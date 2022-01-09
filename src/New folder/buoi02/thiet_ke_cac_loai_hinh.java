package buoi02;

import java.util.Scanner;

public class thiet_ke_cac_loai_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle_bottonleft");
            System.out.println("3. Print the square triangle_topleft");
            System.out.println("4. Print isosceles triangle");
            System.out.println("5. Exit ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Draw the triangle");
                    System.out.println("nhap vao chieu dai hinh chu nhat: ");
                    int chieuDai = input.nextInt();
                    System.out.println("nhap vao chieu dai rong chu nhat: ");
                    int chieuRong = input.nextInt();
                    for (int i = 1; i <= chieuRong; i++) {
                        for (int j = 1; j <= chieuDai; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle");
                    System.out.println("nhap vao chieu dai canh goc vuong cua hinh tam giac: ");
                    int canhTamGiac2 = input.nextInt();
                    for (int i = 0; i <= canhTamGiac2; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("3. Print the square triangle_topleft");
                    System.out.println("nhap vao chieu dai canh goc vuong cua hinh tam giac: ");
                    int canhTamGiac3 = input.nextInt();
                    for (int i = canhTamGiac3; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("4. Print the square triangle_topleft");
                    int hight;
                    System.out.printf(" Nhập vào chiều cao của kim tự tháp: ");
                    hight = input.nextInt();
                    for(int i = hight; i >= 1; --i) {
                        for(int space = 1; space <= hight - i; ++space) {
                            System.out.print("  ");
                        }
                        for(int j=i; j <= 2 * i - 1; ++j) {
                            System.out.print("* ");
                        }
                        for(int j = 0; j < i - 1; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            }
        }
    }
}