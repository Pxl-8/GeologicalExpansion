import json
import re

def parse_resource(res_str):
    parts = res_str.split("/")

    if len(parts) == 1:
        return { "resource": parts[0] }
    elif len(parts) == 2:
        return { "resource": parts[0], "meta": int(parts[1]) }
    elif len(parts) == 3:
        return { "resource": parts[0], "meta": int(parts[1]), "amount": int(parts[2]) }

def convert_to_json(block_type, *targs):
    args = list(targs)
    data = {
        "name": args.pop(0),
        "tool": ('pickaxe' if block_type == "Ore" else args.pop(0)),
        "hardness": args.pop(0),
        "replaces": parse_resource(args.pop(0)),
        "drops": parse_resource(args.pop(0))
    }

    if len(args) > 0:
        data["silkDrops"] = parse_resource(args.pop(0))

    if block_type == "Ore":
        data["behaviour"] = "ore"
    elif block_type == "StoneInfested":
        data["behaviour"] = "infested"

    return data

matcher = re.compile(r"(?:new Block(\w+)\()([a-zA-Z0-9\",_:./ ]+)(?:\))")

def handle_arg(sarg):
    arg = sarg.strip()
    if arg.startswith('"'):
        return arg.strip('"')
    elif arg.endswith("F"):
        return float(arg.strip("F"))

def handle_line(line):
    if line.strip().startswith("//"):
        return

    match = matcher.search(line)
    if match is None:
        return

    block_type = match.group(1)
    arguments = match.group(2)

    parts = list(map(lambda a: handle_arg(a), arguments.split(",")))
    data = convert_to_json(block_type, *parts)
    name = data['name']

    print(f"allModBlocks.add(loader.load(\"{name}\").createBlock(blockReg::getValue));")

    with open(f"src/main/resources/assets/geoexpansion/dynamic/{name}.json", mode='w') as fd:
        json.dump(data, fd, indent=2)

with open("src/main/java/network/pxl8/geoexpansion/common/blocks/ModBlocks.java", mode='r') as fd:
    for line in fd:
        handle_line(line)

print("done")
