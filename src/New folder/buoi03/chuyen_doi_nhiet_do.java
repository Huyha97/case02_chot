package buoi03;

import java.util.Scanner;

public class chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. doF to doC");
            System.out.println("2. doC to doF");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter do F: ");
                    doF = scanner.nextDouble();
                    System.out.println("do F la: " + doFtodoC(doF));
                    break;
                case 2:
                    System.out.println("enter do C: ");
                    doC = scanner.nextDouble();
                    System.out.println("do C la: " + doCtodoF(doC));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0) ;
    }

    public static double doCtodoF (double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double doFtodoC (double doF) {
        double doC = (5.0/9)*(doF - 32);
        return doC;
    }
}
