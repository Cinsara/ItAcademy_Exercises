package Classes;
import java.io.File;
import java.util.*;

public class DirectoryClass {

        public static void directoryList(){
            File directory = new File("C:\\Users\\formacio\\IdeaProjects\\1.5.1.Exercise1\\src\\RootDirectory");
            File[] archives = new File[]{};

            if(directory.isDirectory()){
                archives = directory.listFiles();
                Arrays.sort(Objects.requireNonNull(archives));

                for(File archive : archives){
                    System.out.println(archive);
                }
            } else {
                System.out.println("That's not a directory.");
            }
        }
}
