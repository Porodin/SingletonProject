package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Singleton {
private static Singleton instance;


    private Singleton() throws IOException {
    }

    String filePathFirst = new String(Files.readAllBytes(Paths.get("FilePathFirst.txt")));
    String filePathSecond = new String(Files.readAllBytes(Paths.get("FilePathSecond.txt")));
    String filePathThird = new String(Files.readAllBytes(Paths.get("FilePathThird.txt")));


    static synchronized Singleton getInstance() throws IOException {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


