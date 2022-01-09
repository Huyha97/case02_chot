package bai16.thuchanh01;

import bai16.ReadATextFile;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) throws IOException {

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tong = " + sum);
        } catch (Exception e) {
            System.err.println(" file ko ton tai hoac co noi dung loi");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}

