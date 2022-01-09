package bai11.baitap01;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;
import java.util.Stack;

public class BAITAP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();
        System.out.println("input String: ");
        String Chuoi = scanner.nextLine();

        for (int i = 0; i < Chuoi.length(); i++) {
            stackChuoi.push(Chuoi.charAt(i) + "");
        }
        System.out.println(" chuỗi đảo ngược là: ");

        for (int i = 0; i < Chuoi.length(); i++) {
            System.out.println((String)stackChuoi.pop());
        }
    }
}
