package Classes;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class DirectoryClass {
        public static void directoryListTree(){
            File rootDirectory = new File("C:\\Users\\formacio\\IdeaProjects\\1.5. Java Utils\\1.5.1.Exercise2\\src\\RootDirectory");

            if(rootDirectory.isDirectory()){
                System.out.println("Printing the directory list tree:");
                listRecursive(rootDirectory,0);
            } else {
                System.out.println("Something is wrong. Please, revise the directory's path.");
            }
        }

        public static void listRecursive(File rootDirectory, int level){
            File[] archives = rootDirectory.listFiles();

            if(archives!= null){
                List<File> allFiles = new ArrayList<>(Arrays.asList(archives));
                Collections.sort(allFiles);

                for(File file : allFiles){
                    printInfo(file, level);

                    if(file.isDirectory()){
                        listRecursive(file, level + 1);
                    }
                }
            } else {
                System.out.println("You need a valid directory.");
            }
        }

        public static void printInfo(File file, int level){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
            String modified = dateFormat.format(file.lastModified());
            String indentation = "  ".repeat(level);

            String type = file.isDirectory() ? "D" : "F";
            System.out.printf("%s[%s] %s - Last modification: %s%n",
                    indentation, type, file.getName(), modified);

        }
}
