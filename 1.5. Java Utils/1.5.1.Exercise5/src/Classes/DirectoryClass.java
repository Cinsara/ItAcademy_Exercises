package Classes;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DirectoryClass {
    public static void directoryListTree(){
        File rootDirectory = new File("C:\\Users\\34676\\IdeaProjects\\1.5. Java Utils\\1.5.1.Exercise5\\src\\RootDirectory");
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

    public static void readOtherInfo(String filePath){
        File info = new File(filePath);
        String readLine;

        try(BufferedReader readInfo = new BufferedReader(new FileReader(info))){
            System.out.printf("The content of the file %s is: %n", info.getName());

            while((readLine = readInfo.readLine()) != null){
                System.out.println(readLine);
            }
        } catch(IOException e){
            System.err.printf("Something is wrong with the file: %s%n", e.getMessage());
        }
    }

    public static void serializeObjectJava(Object object, String filePath){

        try(ObjectOutputStream object1 = new ObjectOutputStream(new FileOutputStream(filePath))){
            object1.writeObject(object);
            System.out.println("The object has been serialized.");
        } catch(IOException e){
            System.err.printf("Something is wrong: %s%n", e.getMessage());
        }
    }

    public static Object deserializableObjectJava(String filePath){
        Object object = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            object = objectInputStream.readObject();
            System.out.println("The object has been deserialized.");
        } catch(IOException | ClassNotFoundException e){
            System.err.printf("Something is wrong: %s%n", e.getMessage());
        }
        return object;
    }
}