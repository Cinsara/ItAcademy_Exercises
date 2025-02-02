import static Classes.DirectoryClass.directoryListTree;
import static Classes.DirectoryClass.readOtherInfo;

public class Main {
    public static void main(String[] args) {
        directoryListTree();
        readOtherInfo("src/RootDirectory/Directory1/archive/archive1.txt");
    }
}