package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DirectoryClass {
    public static void directoryListTree(){
        File rootDirectory = new File("C:\\Users\\formacio\\IdeaProjects\\1.5. Java Utils\\1.5.1.Exercise3\\src\\RootDirectory");
        File saveDirectory = new File("directory_saved.txt");

        try( BufferedWriter writer = new BufferedWriter(new FileWriter(saveDirectory))){
            if(rootDirectory.isDirectory()){
                System.out.println("Saving the directory list tree in a .txt:");
                listRecursive(rootDirectory,0, writer);
            } else {
                System.out.println("Something is wrong. Please, revise the directory's path.");
            }
        } catch(IOException e){
            System.err.println("Something is wrong: " + e.getMessage());
        }
    }

    public static void listRecursive(File rootDirectory, int level, BufferedWriter writer) throws IOException {
        File[] archives = rootDirectory.listFiles();

        if(archives!= null){
            List<File> allFiles = new ArrayList<>(Arrays.asList(archives));
            Collections.sort(allFiles);

            for(File file : allFiles){
                printInfo(file, level, writer);

                if(file.isDirectory()){
                    listRecursive(file, level + 1, writer);
                }
            }
        } else {
            System.out.println("You need a valid directory.");
        }
    }

    public static void printInfo(File file, int level, BufferedWriter writer) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String modified = dateFormat.format(file.lastModified());
        String indentation = "  ".repeat(level);

        String type = file.isDirectory() ? "D" : "F";
        String description = String.format("%s[%s] %s - Last modification: %s%n",
                indentation, type, file.getName(), modified);

        writer.write(description);
    }
}

