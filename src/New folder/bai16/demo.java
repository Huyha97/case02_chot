package bai16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo {
    // vd ghi file van ban
    public static void main(String[] args)  {
        try{
            File file;
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("hello!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
