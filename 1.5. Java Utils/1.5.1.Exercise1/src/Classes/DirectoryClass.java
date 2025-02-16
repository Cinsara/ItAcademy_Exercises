package Classes;
import java.io.File;
import java.util.*;

public class DirectoryClass {
        public static void directoryList(){
            File[] archives = new File[]{};
            Scanner input = new Scanner(System.in);
            System.out.println("Please, introduce the folder path: ");
            String path = input.nextLine();
            System.out.printf("The path is: %s%n", path);
            File directory = new File(path);

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
