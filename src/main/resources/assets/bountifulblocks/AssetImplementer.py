# Simply enter enter whether you want to create a block or an item, and then enter the filename of the block/item and eventual texture.

# (all the template files are located in the "ASSETIMPLEMENTER" folder)

# For a block:
# - Creates a copy of the "blockstates" file, replace every instance of "INSTANCE" with the filename of the block and exports it to the "blockstates" folder.
# - Creates a copy of the "blockmodel" file, replace every instance of "INSTANCE" with the filename of the block and exports it to the "models/block" folder.
# - Creates a copy of the "blockitemmodel" file, replace every instance of "INSTANCE" with the filename of the block and exports it to the "models/item" folder.
# - Add a line to the en_us.json file with the english in-game name of the block.
# - Add a template line to the fr_fr.json file.

# For an item:
# - Creates a copy of the "itemmodel" file, replace every instance of "INSTANCE" with the filename of the item and exports it to the "models/item" folder.
# - Add a line to the en_us.json file with the english in-game name of the item.
# - Add a template line to the fr_fr.json file.

# The implementer.txt file is structured as follows:
# b,block_type,block_filename,texture_filename(OPTIONAL)

import os

blockstatesFolder = "blockstates"
blockmodelFolder = "models/block"
blockitemmodelFolder = "models/item"
itemmodelFolder = "models/item"

sourceFolder = "ASSETIMPLEMENTER"
implementerFile = "implementer.txt"

blockstatesTemplate = "blockstates.json"
blockmodelTemplate = "blockmodel.json"
blockitemmodelTemplate = "blockitemmodel.json"
itemmodelTemplate = "itemmodel.json"

en_usFile = "lang/en_us.json"
fr_frFile = "lang/fr_fr.json"

def main():
    print("- Welcome to the AssetImplementer program! -\n")
        
    print("Do you want to create a block or an item? (b/i)")
    choice = input()
    if choice == "b":
        createBlock()
        print("\nBlock created successfully!\n")
    elif choice == "i":
        createItem()
        print("\nItem created successfully!\n")
    else:
        print("Invalid choice. Enter 'b' for block or 'i' for item.")

    main()

def autoMain():

    implementerLocation = sourceFolder + "/" + implementerFile
    implementer = open(implementerLocation, "r")
    lines = implementer.readlines()
    implementer.close()

    lineCount = 0
    currentCount = 0

    # Total number of lines (counts the lines with comments and empty lines)
    for line in lines:
        if line.startswith("//") or line == "\n" or line == "":
            continue
        lineCount += 1

    for line in lines:

        if line.startswith("//") or line == "\n" or line == "":
            continue

        print("Implementing asset " + str(currentCount+1) + "/" + str(lineCount))
        currentCount += 1

        if line.split(",")[0] == "b":
            blockType = line.split(",")[1]
            filename = line.split(",")[2]
            texture = line.split(",")[3]
            if currentCount != lineCount:
                texture = texture[:-1]
            createBlockAuto(blockType, filename, texture)

        if line.split(",")[0] == "i":
            filename = line.split(",")[1]
            #createItemAuto(filename)

    print("\nAll blocks/items have been created successfully!\n")
    input("Press Enter to exit...")


def createBlock():

    print("\nEnter the type of block (leave empty for normal block):")
    blockType = input()

    if blockType == "":
        blockType = "_DEFAULT"
    else:
        blockType = blockType.upper()
    print("\nEnter the filename of the block:")
    filename = input()



    blockstatesTemplate = sourceFolder + '/' + blockType + "/blockstates.json"
    blockmodelTemplate = sourceFolder + '/' + blockType + "/blockmodel.json"
    blockitemmodelTemplate = sourceFolder + '/' + blockType + "/blockitemmodel.json"


    name = filename.replace("_", " ").title()

    # Make the first letter of each word uppercase
    name = name.split()
    for i in range(len(name)):
        name[i] = name[i].capitalize()
    name = " ".join(name)

    print("\nIf you want the block to use another texture, please enter the filename of the texture (without the .png extension). Otherwise don't enter anything.")
    print('Entering "minecraft:" in front of the texture name will change the texture to a vanilla texture.\n')
    texture = input()

    if texture == "":
        texture = filename

    vanillaTexture = False

    if texture.startswith("minecraft:"):
        texture = texture[10:]
        vanillaTexture = True
        print("\nVanilla texture detected. The block will use the vanilla texture.\n")

    # Create blockstates file
    blockstatesFile = open(blockstatesTemplate, "r")
    blockstatesContent = blockstatesFile.read()
    if blockType == "SLAB":
        blockstatesContent = blockstatesContent.replace("TOREPLACE", texture)
    blockstatesContent = blockstatesContent.replace("INSTANCE", filename)
    blockstatesFile.close()
    blockstatesFile = open(blockstatesFolder + "/" + filename + ".json", "w")
    blockstatesFile.write(blockstatesContent)
    blockstatesFile.close()



    # If the template file exists:
    if blockType == "_DEFAULT":

        # Create a simple blockmodel file
        blockmodelFile = open(blockmodelTemplate, "r")
        blockmodelContent = blockmodelFile.read()
        if vanillaTexture:
            blockmodelContent = blockmodelContent.replace("bountifulblocks", "minecraft")
        blockmodelContent = blockmodelContent.replace("INSTANCE", texture)
        blockmodelFile.close()
        blockmodelFile = open(blockmodelFolder + "/" + filename + ".json", "w")
        blockmodelFile.write(blockmodelContent)
        blockmodelFile.close()

    else:
        # Goes to 'sourceFolder/blockType', modifies and export every file that starts with 'blockmodel'
        # Example: sourceFolder/blockType/blockmodel_INTANCE_button.json
        # Will be exported to 'models/block/INTANCE_button.json'

        for file in os.listdir(sourceFolder + '/' + blockType):
            if file.startswith("blockmodel"):
                blockmodelFile = open(sourceFolder + '/' + blockType + "/" + file, "r")
                blockmodelContent = blockmodelFile.read()

                if vanillaTexture:
                    blockmodelContent = blockmodelContent.replace("bountifulblocks", "minecraft")

                if blockType == "SLAB":
                    blockmodelContent = blockmodelContent.replace("TOREPLACE", texture)

                
                blockmodelContent = blockmodelContent.replace("BLOCKINSTANCE", filename)

                blockmodelContent = blockmodelContent.replace("INSTANCE", texture)
                blockmodelFile.close()

                finalName = file.replace("blockmodel_", "").replace("INSTANCE", filename)

                blockmodelFile = open(blockmodelFolder + "/" + finalName, "w")
                blockmodelFile.write(blockmodelContent)
                blockmodelFile.close()


    # If the template file exists:
    if blockType == "_DEFAULT":
        # Create a simle blockitemmodel file
        blockitemmodelFile = open(blockitemmodelTemplate, "r")
        blockitemmodelContent = blockitemmodelFile.read()
        blockitemmodelContent = blockitemmodelContent.replace("INSTANCE", texture)
        blockitemmodelFile.close()
        blockitemmodelFile = open(blockitemmodelFolder + "/" + filename + ".json", "w")
        blockitemmodelFile.write(blockitemmodelContent)
        blockitemmodelFile.close()

    else:
        # Goes to 'sourceFolder/blockType', modifies and export every file that starts with 'blockitemmodel'
        # Example: sourceFolder/blockType/blockitemmodel_INTANCE_button.json
        # Will be exported to 'models/item/INTANCE_button.json'

        for file in os.listdir(sourceFolder + '/' + blockType):
            if file.startswith("blockitemmodel"):
                blockitemmodelFile = open(sourceFolder + '/' + blockType + "/" + file, "r")
                blockitemmodelContent = blockitemmodelFile.read()

                if blockType == "SLAB":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", texture)
                if blockType == "STAIRS":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", filename)
                if blockType == "WALL" or blockType == "TILE_WALL":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", filename)
                if blockType == "FENCE":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", filename)
                    
                blockitemmodelContent = blockitemmodelContent.replace("FILENAME", filename)
                blockitemmodelContent = blockitemmodelContent.replace("INSTANCE", texture)
                blockitemmodelFile.close()

                finalName = file.replace("blockitemmodel_", "").replace("INSTANCE", filename)

                blockitemmodelFile = open(blockitemmodelFolder + "/" + finalName, "w")
                blockitemmodelFile.write(blockitemmodelContent)
                blockitemmodelFile.close()


    en_us = open(en_usFile, "r")
    en_usContent = en_us.read()    # Add line to en_us.json file

    # if the line doesn't exist, add it
    if not "block.bountifulblocks." + filename + '"' in en_usContent:
        en_us = open(en_usFile, "r")
        en_usContent = en_us.read()
        en_us.close()
        en_usContent = en_usContent[:-2] + ',\n\t"block.bountifulblocks.' + filename + '": "' + name + '"\n}'
        en_us = open(en_usFile, "w")
        en_us.write(en_usContent)
        en_us.close()

        name = "TO-TRANSLATE"

        # Add line to fr_fr.json file
        fr_fr = open(fr_frFile, "r")
        fr_frContent = fr_fr.read()
        fr_fr.close()
        fr_frContent = fr_frContent[:-2] + ',\n\t"block.bountifulblocks.' + filename + '": "' + name + '"\n}'
        fr_fr = open(fr_frFile, "w")
        fr_fr.write(fr_frContent)
        fr_fr.close()



def createBlockAuto(type, filename, texture='DEFAULT'):

    blockType = type.upper()

    defaultTypes = ["BLOCK", "B", ""]

    if blockType in defaultTypes:
        blockType = "_DEFAULT"
    else:
        blockType = blockType.upper()

    blockstatesTemplate = sourceFolder + '/' + blockType + "/blockstates.json"
    blockmodelTemplate = sourceFolder + '/' + blockType + "/blockmodel.json"
    blockitemmodelTemplate = sourceFolder + '/' + blockType + "/blockitemmodel.json"

    name = filename.replace("_", " ").title()

    # Make the first letter of each word uppercase
    name = name.split()
    for i in range(len(name)):
        name[i] = name[i].capitalize()
    name = " ".join(name)

    if texture == "DEFAULT" or texture == "":
        texture = filename

    vanillaTexture = False

    if texture.startswith("minecraft:"):
        texture = texture[10:]
        vanillaTexture = True

    # Create blockstates file
    blockstatesFile = open(blockstatesTemplate, "r")
    blockstatesContent = blockstatesFile.read()
    if blockType == "SLAB":
        blockstatesContent = blockstatesContent.replace("TOREPLACE", texture)
    blockstatesContent = blockstatesContent.replace("INSTANCE", filename)
    blockstatesFile.close()
    blockstatesFile = open(blockstatesFolder + "/" + filename + ".json", "w")
    blockstatesFile.write(blockstatesContent)
    blockstatesFile.close()



    # If the template file exists:
    if blockType == "_DEFAULT":

        # Create a simple blockmodel file
        blockmodelFile = open(blockmodelTemplate, "r")
        blockmodelContent = blockmodelFile.read()
        if vanillaTexture:
            blockmodelContent = blockmodelContent.replace("bountifulblocks", "minecraft")
        blockmodelContent = blockmodelContent.replace("INSTANCE", texture)
        blockmodelFile.close()
        blockmodelFile = open(blockmodelFolder + "/" + filename + ".json", "w")
        blockmodelFile.write(blockmodelContent)
        blockmodelFile.close()

    else:
        # Goes to 'sourceFolder/blockType', modifies and export every file that starts with 'blockmodel'
        # Example: sourceFolder/blockType/blockmodel_INTANCE_button.json
        # Will be exported to 'models/block/INTANCE_button.json'

        for file in os.listdir(sourceFolder + '/' + blockType):
            if file.startswith("blockmodel"):
                blockmodelFile = open(sourceFolder + '/' + blockType + "/" + file, "r")
                blockmodelContent = blockmodelFile.read()

                if vanillaTexture:
                    blockmodelContent = blockmodelContent.replace("bountifulblocks", "minecraft")

                if blockType == "SLAB":
                    blockmodelContent = blockmodelContent.replace("TOREPLACE", texture)

                
                blockmodelContent = blockmodelContent.replace("BLOCKINSTANCE", filename)

                blockmodelContent = blockmodelContent.replace("INSTANCE", texture)
                blockmodelFile.close()

                finalName = file.replace("blockmodel_", "").replace("INSTANCE", filename)

                blockmodelFile = open(blockmodelFolder + "/" + finalName, "w")
                blockmodelFile.write(blockmodelContent)
                blockmodelFile.close()


    # If the template file exists:
    if blockType == "_DEFAULT":
        # Create a simle blockitemmodel file
        blockitemmodelFile = open(blockitemmodelTemplate, "r")
        blockitemmodelContent = blockitemmodelFile.read()
        blockitemmodelContent = blockitemmodelContent.replace("INSTANCE", texture)
        blockitemmodelFile.close()
        blockitemmodelFile = open(blockitemmodelFolder + "/" + filename + ".json", "w")
        blockitemmodelFile.write(blockitemmodelContent)
        blockitemmodelFile.close()

    else:
        # Goes to 'sourceFolder/blockType', modifies and export every file that starts with 'blockitemmodel'
        # Example: sourceFolder/blockType/blockitemmodel_INTANCE_button.json
        # Will be exported to 'models/item/INTANCE_button.json'

        for file in os.listdir(sourceFolder + '/' + blockType):
            if file.startswith("blockitemmodel"):
                blockitemmodelFile = open(sourceFolder + '/' + blockType + "/" + file, "r")
                blockitemmodelContent = blockitemmodelFile.read()

                if blockType == "SLAB":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", texture)
                if blockType == "STAIRS":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", filename)
                if blockType == "WALL" or blockType == "TILE_WALL":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", filename)
                if blockType == "FENCE":
                    blockitemmodelContent = blockitemmodelContent.replace("TOREPLACE", filename)
                    
                blockitemmodelContent = blockitemmodelContent.replace("FILENAME", filename)
                blockitemmodelContent = blockitemmodelContent.replace("INSTANCE", texture)
                blockitemmodelFile.close()

                finalName = file.replace("blockitemmodel_", "").replace("INSTANCE", filename)

                blockitemmodelFile = open(blockitemmodelFolder + "/" + finalName, "w")
                blockitemmodelFile.write(blockitemmodelContent)
                blockitemmodelFile.close()


    en_us = open(en_usFile, "r")
    en_usContent = en_us.read()    # Add line to en_us.json file

    # if the line doesn't exist, add it
    if not "block.bountifulblocks." + filename + '"' in en_usContent:
        en_us = open(en_usFile, "r")
        en_usContent = en_us.read()
        en_us.close()
        en_usContent = en_usContent[:-2] + ',\n\t"block.bountifulblocks.' + filename + '": "' + name + '"\n}'
        en_us = open(en_usFile, "w")
        en_us.write(en_usContent)
        en_us.close()

        name = "TO-TRANSLATE"

        # Add line to fr_fr.json file
        fr_fr = open(fr_frFile, "r")
        fr_frContent = fr_fr.read()
        fr_fr.close()
        fr_frContent = fr_frContent[:-2] + ',\n\t"block.bountifulblocks.' + filename + '": "' + name + '"\n}'
        fr_fr = open(fr_frFile, "w")
        fr_fr.write(fr_frContent)
        fr_fr.close()





def createItem():
    print("\nEnter the filename of the item:")
    filename = input()
    
    name = filename.replace("_", " ").title()

    # Make the first letter of each word uppercase
    name = name.split()
    for i in range(len(name)):
        name[i] = name[i].capitalize()
    name = " ".join(name)

    # Create itemmodel file
    itemmodelFile = open(itemmodelTemplate, "r")
    itemmodelContent = itemmodelFile.read()
    itemmodelContent = itemmodelContent.replace("INSTANCE", filename)
    itemmodelFile.close()
    itemmodelFile = open(itemmodelFolder + "/" + filename + ".json", "w")
    itemmodelFile.write(itemmodelContent)
    itemmodelFile.close()

    # Add line to en_us.json file
    en_us = open(en_usFile, "r")
    en_usContent = en_us.read()
    en_us.close()
    en_usContent = en_usContent[:-2] + ',\n\t"item.bountifulblocks.' + filename + '": "' + name + '"\n}'
    en_us = open(en_usFile, "w")
    en_us.write(en_usContent)
    en_us.close()

    name = "TO-TRANSLATE"

    # Add line to fr_fr.json file
    fr_fr = open(fr_frFile, "r")
    fr_frContent = fr_fr.read()
    fr_fr.close()
    fr_frContent = fr_frContent[:-2] + ',\n\t"item.bountifulblocks.' + filename + '": "' + name + '"\n}'
    fr_fr = open(fr_frFile, "w")
    fr_fr.write(fr_frContent)
    fr_fr.close()



def intro():

    print("Would you like to implement everything manually or from the implementer.txt file ? (m/i)")
    choice = input()
    if choice == "m":
        main()
    elif choice == "i":
        autoMain()
    else:
        print("Invalid choice. Enter 'm' for manual or 'i' for implementer.txt.")
        intro()

if __name__ == "__main__":
    #Places the program in the folder of the python file
    os.chdir(os.path.dirname(__file__))
    intro()