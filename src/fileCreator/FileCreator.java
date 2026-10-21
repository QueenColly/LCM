package fileCreator;

import java.nio.file.Path;
import java.sql.SQLOutput;

public class FileCreator {
    public static void main(String[] args) {
//    1. Defining the path that points to the file you are trying to work with
//    unix - home/gamp/Desktop windows - :\\Users\Desktop ...
        String fileLocation = "/home/gamp/Desktop";
        Path path = Path.of(fileLocation);
        System.out.println(path.getFileSystem());
        System.out.println(path.getRoot());

//    2. Use a method of class files to work with the path
    }
}
