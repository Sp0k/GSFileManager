* This is the first package of my library GSLib, I will publish the whole thing once I finish coding it *

# GSFileManager

This is my file management package for Java. It will contain all the java methods
I use for dealing with files, such as creating, reading or writing files for 
example.

It is currently pretty bare bones, but I will keep updating it as I add more 
methods and content to it.

I am currently in my second year of a BsCS, so if you have any criticism or advices, 
I will gladly take them.

## Features
- File creation : Create a file from an absolute path to the file.
- File deletion : Delete a file from an absolute path to the file.
- File reading : Read in a file and returns its content in a String format.
- File writing : Write content to a file using a String from your program.
- Erase content : Erase the content of a file.

All the functions use an absolute path file in order to interact with said files.
I also plan on adding methods to remove specific parts of a file, like a specific
string or paragraphs, or removing from line x to y.

## Prerequisites
- Java JDK 11+

## Installation
1. Clone the repo or download the .jar file 
   - git clone https://github.com/Sp0k/GSFileManager.git
2. (If applicable) Install any dependencies
3. Compile or run your package
   - java -jar path/to/your/package.jar

## Usage
Each of the methods will print error messaged to the screen if any is encountered.

```java
import GSFileManager.FileManager;

public class Example {
   public static void main(String[] args) {
      String filename = "path\\to\\your\\file.txt
      FileManager myManager = new FileManager();
      myManager.createFile(filename);
   }
}
```

You create your file manager object before you can access to any file. This objects
lets you deal with multiple files at once while only needing one object. Using the
<i>createFile()</i> method, you can create a new file. The <i>createFile()</i> 
method has a <i>String filename</i> parameter which should be your absolute path
to the file (e.g. D:\\Personal Files\\myfile.txt).

<br>

```java
import GSFileManager.FileManager;

public class Example {
   public static void main(String[] args) {
      ...
      
      String file = myManager.readFile(filePath);
   }
}
```
You can read a file using the <i>readFile()</i> method. The method also uses a
<i>String filename</i> parameter in order to locate the file to read. It then
scans the entire file and returns its content as a String.

<br>

```java
import GSFileManager.FileManager;

public class Example {
   public static void main(String[] args) {
      ...

      String content = "Hello, World! This is my message!"
      myManager.writeToFile(filename, content);
   }
}
```

You can write to a file using the <i>writeToFile()</i> method. The method uses a
<i>String filename</i> parameter as well as a <i>String content</i> parameter. It
will write the contents of the String to the file. I also recommend using a
<i>StringBuilder</i> object with the <i>toString()</i> method if you want to
easily build the string to add in the file.

<br>

```java
import GSFileManager.FileManager;

public class Example {
   public static void main(String[] args) {
      ...
      
      myManager.eraseContent(filename);
   }
}
```
To erase the content of a file, you can use the <i>eraseContent()</i> method which
will take in a <i>String filename</i> parameter to locate the file. It will replace
the content of the file with an empty String.

<br>

```java
      import GSFileManager.FileManager;

      public class Example {
         public static void main(String[] args) {
            ...
            
            myManager.deleteFile(filename);
         }
      }
```
The <i>deleteFile</i> method uses a <i>String filename</i> parameter to locate
the file. It then uses the <i>File delete()</i> method to delete the file.

## License
Distributed under The Unilicense. See <b>'LICENSE'</b> for more information.

## Contact
Gabriel Savard - gabrielsavard.prog@gmail.com

Project Link: https://github.com/Sp0k/GSFileManager

## Acknowledgements
I did not write most of the methods myself, I modified some from code I learned
on GeeksForGeeks and W3School and another method was written by my friend 
Suchith Sridhar (https://github.com/SuchithSridhar).

Suchith wrote the <i>readFile()</i> method.<br>
W3School wrote the original code for the <i>createFile()</i> and 
<i>writeToFile()</i> methods.<br>
GeekForGeeks wrote the original code for both delete methods.
