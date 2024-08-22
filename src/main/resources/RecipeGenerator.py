from os import chdir, listdir, makedirs, remove
from os.path import isfile, join, dirname, exists, isdir




# Places the program in the folder of the python file
chdir(dirname(__file__))




# Version compatibility (supported: '1204', '1205+')

version = "1205+"
clearExportFolder = True
excludedFolders = ["duplicates", "misc"] # Folders to exclude from clearing




# FOLDERS

blockStatesFolder = "assets/bountifulblocks/blockstates"
vanillaBlockStatesFolder = "RECIPEGEN/_VANILLA_BLOCKSTATES"
vanillaRecipesFolder = "RECIPEGEN/_VANILLA_RECIPES"
templateFolder = "RECIPEGEN"
exportFolder = "data/bountifulblocks/recipe"
stonecutterExportFolder = "stonecutter"




# NAMESPACES

globalNamespace = "bountifulblocks"
vanillaNamespace = "minecraft"




# BLOCKS

allModBlocks = [f for f in listdir(blockStatesFolder) if isfile(join(blockStatesFolder, f))]

allVanillaBlocks = [f for f in listdir(vanillaBlockStatesFolder) if isfile(join(vanillaBlockStatesFolder, f))]

exludedBlocks = ["grindstone.json","lodestone.json","pointed_dripstone.json","glowstone.json","mud.json","muddy_mangrove_roots.json"]

allBlocks = [f for f in allVanillaBlocks if not f in exludedBlocks] + allModBlocks

vanillaRecipes = [f for f in listdir(vanillaRecipesFolder) if isfile(join(vanillaRecipesFolder, f))]



def isPlainBlock(blockName):
    return not any([suffix in blockName for suffix in ["stairs", "slab", "wall", "carpet", "pressure_plate", "button", "pot", "fence"]])




# Blocksets
obsidianBlocks = [f for f in allBlocks if isPlainBlock(f) and "obsidian" in f and "crying" not in f]
redNetherBrickBlocks = [f for f in allBlocks if isPlainBlock(f) and "red_nether_brick" in f and not "cracked" in f]
prismarineBlocks = [f for f in allBlocks if isPlainBlock(f) and "prismarine" in f and "bricks" not in f and "dark" not in f]
prismarineBrickBlocks = [f for f in allBlocks if isPlainBlock(f) and "prismarine_brick" in f]
darkPrismarineBlocks = [f for f in allBlocks if isPlainBlock(f) and "dark_prismarine" in f]
graniteBlocks = [f for f in allBlocks if isPlainBlock(f) and "granite" in f]
dioriteBlocks = [f for f in allBlocks if isPlainBlock(f) and "diorite" in f]
andesiteBlocks = [f for f in allBlocks if isPlainBlock(f) and "andesite" in f]
smoothBasaltBlocks = [f for f in allBlocks if isPlainBlock(f) and "smooth_basalt" in f and "cracked" not in f]
mudBlocks = [f for f in allBlocks if isPlainBlock(f) and "mud" in f]
iceBlocks = [f for f in allBlocks if isPlainBlock(f) and "ice" in f and "packed" not in f and "blue" not in f and "frosted" not in f]
packedIceBlocks = [f for f in allBlocks if isPlainBlock(f) and "packed_ice" in f]
blueIceBlocks = [f for f in allBlocks if isPlainBlock(f) and "blue_ice" in f]
sandstoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "sandstone" in f and "red" not in f and "smooth" not in f]
redSandstoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "red_sandstone" in f and "smooth" not in f]
stoneBlocks = ["stone.json","stone_bricks.json","stone_tiles.json","chiseled_stone_bricks.json"]
cobblestoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "cobblestone" in f and "mossy" not in f and f not in stoneBlocks and f != "stone.json"]
calciteBlocks = [f for f in allBlocks if isPlainBlock(f) and "calcite" in f]
dripstoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "dripstone" in f]
tuffBlocks = [f for f in allBlocks if isPlainBlock(f) and "tuff" in f]
purpurBlocks = [f for f in allBlocks if isPlainBlock(f) and "purpur" in f]
terracottaBlocks = [f for f in allBlocks if isPlainBlock(f) and "terracotta" in f]
deepslateBlocks = [f for f in allBlocks if isPlainBlock(f) and "deepslate" in f and f != "deepslate.json" and "ore" not in f and "reinforced" not in f and "cracked" not in f]
blackstoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "blackstone" in f and "gilded" not in f and "cracked" not in f]
endStoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "end_stone" in f]
smoothStoneBlocks = [f for f in allBlocks if isPlainBlock(f) and "smooth_stone" in f]




stairsBlocks = [f for f in allModBlocks if "stairs" in f ]
slabBlocks = [f for f in allModBlocks if "slab" in f]
wallBlocks = [f for f in allModBlocks if "wall" in f]
carpetBlocks = [f for f in allModBlocks if "carpet" in f]
bricksBlocks = [f for f in allModBlocks if "bricks" in f and not "cracked" in f and not "chiseled" in f]
tilesBlocks = [f for f in allModBlocks if "tiles" in f]
chiseledBlocks = [f for f in allModBlocks if "chiseled" in f]
pressurePlateBlocks = [f for f in allModBlocks if "pressure_plate" in f]
buttonBlocks = [f for f in allModBlocks if "button" in f]
carvedPlanksBlocks = [f for f in allModBlocks if isfile(join(blockStatesFolder, f)) and "planks" in f and "carved" in f]
flooringBlocks = [f for f in allModBlocks if isfile(join(blockStatesFolder, f)) and "flooring" in f and isPlainBlock(f)]
polishedBlocks = [f for f in allModBlocks if "polished" in f and not f in (stairsBlocks + slabBlocks + wallBlocks)]
mossyFullBlocks = [f for f in allModBlocks if isfile(join(blockStatesFolder, f)) and "mossy" in f and isPlainBlock(f)]
crackedBlocks = [f for f in allModBlocks if "cracked" in f and not "mossy" in f]
threadedWoolBlocks = [f for f in allModBlocks if "threaded" in f and "carpet" not in f]
terracottaBricksBlocks = [f for f in allModBlocks if "terracotta_bricks" in f]

woodTypes = ["oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "crimson", "warped", "bamboo", "mangrove", "cherry"]



# Recipe associations

associations = [
    ["_stairs","STAIRS",stairsBlocks],
    ["_slab","SLAB",slabBlocks],
    ["_wall","WALL",wallBlocks],
    ["_carpet","CARPET",carpetBlocks],
    ["_bricks","BRICKS",bricksBlocks],
    ["_tiles","TILES",tilesBlocks],
    ["chiseled_","CHISELED",chiseledBlocks],
    ["polished_","POLISHED",polishedBlocks],
    ["_pressure_plate","PRESSURE_PLATE",pressurePlateBlocks],
    ["_button","BUTTON",buttonBlocks],
    ["carved_","CARVED_WOOD_PLANKS",carvedPlanksBlocks],
    ["_flooring","WOOD_FLOORING",flooringBlocks],
    ["mossy_","MOSSY_DEFAULT",mossyFullBlocks],
    ["cracked_","CRACKED",crackedBlocks],
    ["_threaded","THREADED_WOOL",threadedWoolBlocks],
    ["_bricks","TERRACOTTA_BRICKS",terracottaBricksBlocks]
    ]



# Format: ['block', 'originOverride']
specificOverrides = [
    ["smooth_stone_bricks","smooth_stone"],
    ["sandstone_bricks","cut_sandstone"],
    ["red_sandstone_bricks","cut_red_sandstone"],
    ["polished_dripstone","dripstone_block"],
    ["polished_purpur","purpur_block"],
    ["bamboo_flooring_stairs","bamboo_mosaic"],
    ["bamboo_flooring_slab","bamboo_mosaic"],
    ["dripstone_stairs","dripstone_block"],
    ["dripstone_slab","dripstone_block"],
    ["dripstone_wall","dripstone_block"],
    ["chiseled_mud_bricks","smooth_mud"],
    ["smooth_mud","packed_mud"],
    ["chiseled_ice","ice_tiles"],
    ["chiseled_packed_ice","packed_ice_tile_slab"],
    ["chiseled_blue_ice","blue_ice_tile_slab"],
    ["chiseled_obsidian","obsidian_tile_slab"],
    ["blackstone_tiles","polished_blackstone_bricks"],
    ["purpur_tile_stairs","purpur_block"],
    ["purpur_tile_slab","purpur_block"],
    ["purpur_tile_wall","purpur_block"],
    ["chiseled_red_nether_bricks","red_nether_brick_slab"],
    ["snow_bricks","packed_snow"]
    ]




stonecutterBlocksets = [
    ["obsidian", obsidianBlocks],
    ["red_nether_brick", redNetherBrickBlocks],
    ["prismarine", prismarineBlocks],
    ["prismarine_brick", prismarineBrickBlocks],
    ["dark_prismarine", darkPrismarineBlocks],
    ["granite", graniteBlocks],
    ["diorite", dioriteBlocks],
    ["andesite", andesiteBlocks],
    ["smooth_basalt", smoothBasaltBlocks],
    ["mud", mudBlocks],
    ["ice", iceBlocks],
    ["packed_ice", packedIceBlocks],
    ["blue_ice", blueIceBlocks],
    ["sandstone", sandstoneBlocks],
    ["red_sandstone", redSandstoneBlocks],
    ["stone", stoneBlocks],
    ["cobblestone", cobblestoneBlocks],
    ["calcite", calciteBlocks],
    ["dripstone", dripstoneBlocks],
    ["tuff", tuffBlocks],
    ["purpur", purpurBlocks],
    ["deepslate", deepslateBlocks],
    ["blackstone", blackstoneBlocks],
    ["end_stone", endStoneBlocks],
    ["smooth_stone", smoothStoneBlocks]
    ]




# Clear export folder

if clearExportFolder:
    for f in listdir(exportFolder):
        if (isdir(join(exportFolder, f)) and f not in excludedFolders):
            for ff in listdir(join(exportFolder, f)):
                remove(join(exportFolder, f, ff))




# Generate generic recipes

recipeCount = 0

for i in range(len(associations)):

    associationSuffix = associations[i][0]
    associationFolder = associations[i][1]
    associationData = associations[i][2]

    for block in associationData:

        if "infested" in block or ("mossy" in block and isPlainBlock(block) and associationFolder != "MOSSY_DEFAULT"):
            continue



        originName = block.replace(".json", "").replace(associationSuffix, "")

        if ("brick" in originName or "tile" in originName) and not ("bricks" in originName or "tiles" in originName) and associationFolder != "CHISELED":
            originName = originName + "s"

        if associationFolder == "CARPET":
            originName = originName + "_wool"
        elif associationFolder in ["WOOD_FLOORING", "CARVED_WOOD_PLANKS"]:
            originName = originName.replace("_planks", "") + "_slab"
        elif associationFolder == "BRICKS" and not "terracotta" in originName:
            originName = "polished_" + originName
        elif associationFolder == "TILES":
            originName = originName + "_bricks"
        elif associationFolder == "CHISELED":
            originName = originName + "_slab"








        blockName = block.replace(".json", "")
        blockNamespace = globalNamespace

        blockCategoryFolder = associationSuffix.replace("_", "")

        localTemplateFolder = templateFolder + "/" + associationFolder




        # If the block has a specific override
        if blockName in [x[0] for x in specificOverrides]:
            originName = [x[1] for x in specificOverrides if x[0] == blockName][0]

        originNamespace = vanillaNamespace
        if originName + ".json" in allModBlocks:
            originNamespace = globalNamespace




        for templateFile in listdir(localTemplateFolder):

            outputName = templateFile.replace("ORIGIN", originName).replace("INSTANCE", blockName)

            with open(join(localTemplateFolder, templateFile), "r") as file:
                filedata = file.read()

                # No stonecutting recipes for wood types
                if "stonecutting" in templateFile and any([woodType in blockName for woodType in woodTypes]) or "snow" in blockName:
                    continue
                elif "terracotta_bricks" in blockName and not "stonecutting" in templateFile:
                    continue

                if version == "1204":
                    filedata = filedata.replace('"id":', '"item":')

                if "VER" in templateFile:
                    if version in templateFile:
                        # Removes everything after "VER" in the filename
                        outputName = outputName.split("VER")[0] + ".json"
                    else:
                        continue

                filedata = filedata.replace("ORIGINNAMESPACE", originNamespace)
                filedata = filedata.replace("ORIGIN", originName)
                filedata = filedata.replace("INSTANCENAMESPACE", blockNamespace)
                filedata = filedata.replace("INSTANCE", blockName)


            finalPath = join(exportFolder, blockCategoryFolder)
            if not exists(finalPath):
                makedirs(finalPath)

            # Creates an output file
            with open(join(finalPath, outputName), "w") as outfile:
                outfile.write(filedata)
                recipeCount += 1


print("Generated " + str(recipeCount) + " generic recipes")




# Generate blockset stonecutter recipes
# For every blockset, generate a recipe from each plain block to each other plain block (except itself)

recipeCount = 0

for blockset in stonecutterBlocksets:
    
        blocksetSuffix = blockset[0]
        blocksetData = blockset[1]
    
        for block in blocksetData:

            if "infested" in block or ("mossy" in block and isPlainBlock(block)) or not isPlainBlock(block):
                continue

            for originBlock in blocksetData:
    
                if "infested" in originBlock or ("mossy" in originBlock and isPlainBlock(originBlock)) or not isPlainBlock(originBlock) or block == originBlock:
                    continue
                
                if block in allModBlocks:
                    blockNamespace = globalNamespace
                else:
                    blockNamespace = vanillaNamespace

                if originBlock in allModBlocks:
                    originNamespace = globalNamespace
                else:
                    originNamespace = vanillaNamespace



                originName = originBlock.replace(".json", "")
                blockName = block.replace(".json", "")


                localTemplateFolder = templateFolder + "/STONECUTTER"

                for templateFile in listdir(localTemplateFolder):
                        
                        outputName = templateFile.replace("ORIGIN", originName).replace("INSTANCE", blockName)
    
                        with open(join(localTemplateFolder, templateFile), "r") as file:
                            filedata = file.read()
    
                            if version == "1204":
                                filedata = filedata.replace('"id":', '"item":')
    
                            if "VER" in templateFile:
                                if version in templateFile:
                                    # Removes everything after "VER" in the filename
                                    outputName = outputName.split("VER")[0] + ".json"
                                else:
                                    continue
    
                            filedata = filedata.replace("ORIGINNAMESPACE", originNamespace)
                            filedata = filedata.replace("ORIGIN", originName)
                            filedata = filedata.replace("INSTANCENAMESPACE", blockNamespace)
                            filedata = filedata.replace("INSTANCE", blockName)
    
                        finalPath = join(exportFolder, stonecutterExportFolder)
                        if not exists(finalPath):
                            makedirs(finalPath)
    
                        # Creates an output file if it's not already in the vanilla recipes folder
                        if not outputName in vanillaRecipes:
                            with open(join(finalPath, outputName), "w") as outfile:
                                outfile.write(filedata)
                                recipeCount += 1

print("Generated " + str(recipeCount) + " stonecutter recipes")
input("Press Enter to exit")