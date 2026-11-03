package fileCreator;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class files {
    public static void main(String[]args){
        String baseURI = "http://jsonplaceholder.typicode.com";
        String endpoint = "/posts";
        URI uri = URI.create(baseURI + endpoint);
        Path path = Path.of("posts.json");

        try(InputStream inputStream = uri.toURL().openStream()){
            byte[] data = inputStream.readAllBytes();
            Files.write(path, data);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
