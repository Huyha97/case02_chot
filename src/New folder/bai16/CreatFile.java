package bai16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreatFile {
    public static void main(String[] args) throws IOException {
        String str = "FIle handling in java using" + " filewriter and filereader";
        File file;
        FileWriter fw = new FileWriter("output.txt");
                for (int i = 0; i < str.length(); i++) {
                    fw.write(str.charAt(i));
                    System.out.println("writting successful");
                    fw.close();
        }
    }
}
