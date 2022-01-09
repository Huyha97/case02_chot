package buoi06.btvn;

import java.util.Scanner;

public class ManagerBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" nhap vao so luong sach: ");
        int n = input.nextInt();

        Book[] booklist = new Book[n];
        for (int i = 0; i <booklist.length ; i++) {
            System.out.println("input name:");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("input price");
            String price = input.next();
            System.out.println("input quanity");
            double quanity = input.nextDouble();
            System.out.println("input day:");
            String day = input.next();
            booklist[i] = new Book();
        }
        for (Book b: booklist) {
            System.out.println(b);
        }
//
//        Book[] bookSciencelist = new ScienceBook[n];
//        for (int i = 0; i <bookSciencelist.length ; i++) {
//            System.out.println("Nhaapj sach thu" + (i+1));
//            System.out.println("input name:");
//            String name = input.next();
//            System.out.println("input price");
//            String price = input.next();
//            System.out.println("input quanity");
//            double quanity = input.nextDouble();
//
//            System.out.println("input day:");
//            String day = input.next();
//            System.out.println("Nhập loại sach");
//            String type = input.next();
//
//            bookSciencelist[i] = new ScienceBook();
//        }
//        for (Book b: bookSciencelist) {
//            System.out.println(b);
//        }



    }
}
