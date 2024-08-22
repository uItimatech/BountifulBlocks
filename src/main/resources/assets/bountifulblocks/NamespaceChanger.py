# This program goes through every file in every specified folder and its subfolders and changes every occurence of [oldNamespace] to [newNamespace]
import os
import re

oldNamespace = "echoingwilds"
newNamespace = "bountifulblocks"

# Function to change the namespace of a file
def changeNamespaceInFile(file, namespace):
    # Open the file
    with open(file, "r") as f:
        filedata = f.read()

    # Replace the target string
    filedata = filedata.replace(oldNamespace, namespace)

    # Write the file out again
    with open(file, "w") as f:
        f.write(filedata)


# Function to change the namespaces of all directories and files to the new namespace
def changeNamespaceInDirectory(directory, namespace):
    # Go through all files and directories in the specified directory
    for root, dirs, files in os.walk(directory):
        for file in files:
            # If the file is a .json file, change the namespace
            if file.endswith(".json"):
                changeNamespaceInFile(os.path.join(root, file), namespace)

        for dir in dirs:
            # Change the namespace of the subdirectories
            changeNamespaceInDirectory(os.path.join(root, dir), namespace)

# Main function
def main():

    # Asks the use the folder in which to replace files
    folder = input("Enter the folder to replace files in: ")

    # Changes the namespace of all files in the specified folder
    changeNamespaceInDirectory(folder, newNamespace)
    print("Namespace changed to "+ newNamespace +" in all .json files in the " + folder + " folder.")

    # Wait for user input to close the program
    input("Press Enter to close the program...")

# Run the main function
if __name__ == "__main__":
    main()