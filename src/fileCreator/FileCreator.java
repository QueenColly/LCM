package fileCreator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Arrays;

public class FileCreator {
    public static void main(String[] args) {
//    1. Defining the path that points to the file you are trying to work with
//    unix - home/gamp/Desktop windows - :\\Users\Desktop ...

//        try {
//            String fileLocation = "/home/gamp/Desktop";
//            String fileLocation = "/home/gamp/Desktop/gooogle.txt";
//            Path path = Path.of(fileLocation);
//            System.out.println(path.getFileSystem());
//            System.out.println(path.getRoot());
//            Files.createFile(path);
//        }catch(IOException exception){
//            exception.printStackTrace();
//            System.err.println(exception.getMessage());
//        }
//    2. Use a method of class files to work with the path

        String videoUrl = "";
        URI uri = URI.create(videoUrl);
        try(
                InputStream inputStream = uri.toURL().openStream();
                FileOutputStream fileOutputStream =
                        new FileOutputStream("video.mp4");
                ){
            byte[] bytes = inputStream.readAllBytes();
            System.out.println("raw video bytes::" + Arrays.toString(bytes));
            fileOutputStream.write(bytes);
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
