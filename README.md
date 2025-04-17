# 📁 File Handling Utility

A Java-based File Handling Utility that demonstrates how to **Read**, **Write**, and **Modify** text files using standard Java I/O operations. This project provides a simple console menu for performing file operations on a text file.

## 🚀 Features

- Write user input to a file  
- Read and display content from a file  
- Modify specific words or phrases in the file  
- Console-based interactive menu  
- Handles exceptions and provides user-friendly messages  

## 🛠️ How It Works

This project includes a single Java file inside the package `FileOperation`:

1. **FileHandlingUtility.java**  
   - Provides methods to write, read, and modify a file (`example.txt`)  
   - Uses `BufferedWriter`, `BufferedReader`, `FileWriter`, and `FileReader` for I/O operations  
   - Uses `Files` and `Paths` for advanced modifications  
   - Includes a console-based menu to interact with the user  
   - Takes input using `Scanner` class  

### Menu Options:
- **Option 1:** Write to the file (overwrites existing content)  
- **Option 2:** Read from the file and display content line by line  
- **Option 3:** Replace a word or phrase in the file with another  

## 📂 Folder Structure

Place your files in the following structure:

FileOperation/  
├── FileHandlingUtility.java  
└── example.txt  

## 📄 Sample File (example.txt)

Amit Vitthal Patil

## 🧪 How to Run

1. Open your terminal or IDE and navigate to the directory containing the `FileOperation` folder.

2. Compile the program:
   javac FileOperation/FileHandlingUtility.java

3. Run the program:
   java FileOperation.FileHandlingUtility

4. Follow the on-screen menu instructions to perform file operations.

## 💡 Sample Output

📂 File Operations Menu:

1. Write to file

2. Read from file

3. Modify file content Choose an option (1-3): 1 📝 Enter text to write into the file: Hello World! ✅ File written successfully.

🔁 Do you want to continue? (yes/no): yes

📂 File Operations Menu:

1. Write to file

2. Read from file

3. Modify file content Choose an option (1-3): 2 📖 Reading file content: → Hello World!

## ✅ Requirements

- Java 8 or above  
- Any IDE (IntelliJ IDEA, Eclipse) or terminal for compilation  
- Basic understanding of Java I/O and file handling  

## 🧑‍💻 Author

Your Name  
your.email@example.com  
https://github.com/yourusername  

## 📄 License

This project is licensed under the MIT License. You are free to use, modify, and distribute it for learning or development purposes.
