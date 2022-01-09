package baitapthem.viettus;

import java.util.Scanner;

public class viethoachudautien {
    // in hoa ký tự đàu tiên của 1 từ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao tu muon in hoa chu cai dau tien: ");
        String word = scanner.nextLine();

        String firstLetter = word.substring(0,1);
        firstLetter =  firstLetter.toUpperCase();
        String remainLetters = word.substring(1,word.length());
        word = firstLetter + remainLetters;
        System.out.println("tu in hoa chu cai dau tien la: " + word);
    }
}
