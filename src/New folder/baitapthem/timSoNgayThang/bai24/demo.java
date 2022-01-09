package baitapthem.timSoNgayThang.bai24;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n=0;
      try {
          System.out.println(" nhap so nguyen n");
          n = scanner.nextInt();
      } catch (Exception e) {
          System.out.println(" you are wrong, please enter a number, not a word");
      } finally {
          System.out.println(" nhập dữ liệu ko đúng");
      }
          System.out.println("gia tri nhap la" + n);
          System.out.println(" ket thuc chuong trinh");


      }
    }

