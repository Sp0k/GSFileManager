/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        File Manager
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.1
 * ░░███  ░░███  ███    ░███        since 2023-10-13
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: A collection of methods I wrote to deal with files.
 */
package GSFileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    /**
     * Create a new file
     *
     * @param filename The absolute path for the new file. This parameter needs to be a String.
     */
    public void createFile(String filename) {
        try {
            File f = new File(filename);
            if (f.createNewFile()) {
                System.out.printf("File created: %s\nAbsolute path: %s\n", f.getName(), f.getAbsolutePath());
            } else {
                System.out.print("File already exists.\n");
            }
        } catch (IOException e) {
            System.out.print("An error occurred");
            e.printStackTrace();
        }
    }

    /**
     * Read files
     *
     * @param filename the absolute path for a file for the program to read.
     * @return String containing the text contained in the file.
     */
    public static String readFile(String filename) {
        File f = new File(filename);
        Scanner reader = null;
        String lines = "";

        try {
            reader = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            return "";
        }

        while (reader.hasNext()) {
            lines += reader.nextLine() + "\n";
        }
        reader.close();

        return lines;
    }

    /**
     * Adds text to a file
     *
     * @param filename The absolute path of the file.
     * @param text The text to add to the file.
     */
    public void writeToFile(String filename, String text) {
        try {
            FileWriter w = new FileWriter(filename);
            w.write(text);
            w.close();
            System.out.print("Successfully wrote to the file!\n");
        } catch (IOException e) {
            System.out.print("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Erase the content of a file
     *
     * @param filename The absolute path of the file
     */
    public void eraseContent(String filename) {
        try (PrintWriter pw = new PrintWriter(filename)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete a file
     *
     * @param filename The absolute path of the file
     */
    public void deleteFile(String filename) {
        File f = new File(filename);
        if (f.delete()) {
            System.out.printf("Deleted the file: %s", f.getName());
        } else {
            System.out.print("Failed to delete the file.\n");
        }
    }
}
