package sample;

public class Singleton {
private static Singleton instance;


    private Singleton(){
    }

    public String filePathFirst = "FilePathFirst.txt";
    public String filePathSecond = "FilePathSecond.txt";
    public String filePathThird = "FilePathThird.txt";


    public static synchronized Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


