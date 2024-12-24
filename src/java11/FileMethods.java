package java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileMethods {
    public static void main(String[] args) {
        try {
            Files.writeString(Path.of("random.txt"),"sdsdsdfsdfs", StandardOpenOption.CREATE);
            Files.writeString(Path.of("random2.txt"),"sdsdsdfsdfs", StandardOpenOption.CREATE);
            System.out.println("is Location Same :"+Files.isSameFile(Path.of("random.txt"),Path.of("random2.txt")));
            String str = Files.readString(Path.of("random.txt"));
            System.out.println("Data is :"+str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
