COMPANY : CODETECH IT SOLUTIONS
NAME : ALEKHYA DAMA
INTERN ID : CT04WVN
DOMAIN NAME : JAVA PROGRAMMING
DURATION : 4 WEEKS
MENTOR : NEELA SANTOSH 

📂 File Handling Utility in Java
 Introduction:-
This project is a Java-based file handling utility designed to perform essential file operations, such as writing, reading, and modifying files. It is a menu-driven program that allows users to interactively manage file content with ease.

File handling is a fundamental concept in Java that enables applications to store, retrieve, and manipulate data efficiently. This project utilizes Java I/O classes like FileWriter, BufferedReader, and Scanner to provide a seamless file management experience.
📌 Features
🔹 Write to a file – Users can create or overwrite a file with custom text input.
🔹 Read from a file – The program displays the file's content in the console.
🔹 Modify a file – Specific lines in a file can be updated dynamically.
🔹 Menu-driven interface – Easy navigation through different file operations.
🔹 Error handling – Proper exception handling to manage file-related errors.

🚀 Technologies Used
Java – Core programming language
FileWriter & FileReader – Writing and reading file contents
BufferedReader – Efficient reading of file data
Scanner – Capturing user input
Exception Handling – Managing file operation errors
🛠️ How It Works
1️⃣ Writing to a File
The program prompts the user to enter text, which is then written to a file using FileWriter. If the file does not exist, it creates a new one.

2️⃣ Reading from a File
Using BufferedReader, the program reads and displays the file's content. This operation ensures efficient reading, even for large files.

3️⃣ Modifying File Content
Users can modify specific lines in the file by providing the line number and new text. The program reads the file, updates the specified line, and rewrites the modified content back to the file.

📜 Code Structure
The project consists of a single Java file implementing the following:
🔹 writeToFile() – Writes user input to a file.
🔹 readFromFile() – Reads and prints file content.
🔹 modifyFileContent() – Updates specific lines in the file.
🔹 main() – Provides a menu-driven interface.

📌 Example Usage
Run the program
1.bash
/*javac FileHandlingUtility.java  
java FileHandlingUtility */ 
2.Choose an operation 
File Handling Menu:  
1. Write to File  
2. Read from File  
3. Modify File  
4. Exit  

mathematica
Copy
Edit
File Handling Menu:  
1. Write to File  
2. Read from File  
3. Modify File  
4. Exit  
3.Perform operations
Enter text to write.
View file contents.
Modify specific lines dynamically.
🎯 Future Enhancements
✅ Add file deletion functionality.
✅ Implement append mode instead of overwriting.
✅ Introduce a GUI interface for better user experience.

📜 License
This project is open-source and can be modified as needed.
