package buoi02;

import java.util.Scanner;

public class lai_suat_bank {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi: ");
        money = input.nextDouble();

        System.out.println("nhập vào số tháng gửi: ");
        month = input.nextInt();

        System.out.println("Nhập vào lãi suất tiền gửi: ");
        interestRate = input.nextDouble();

        double totalinterestRate = 0;
        for (int i = 0; i < month; i++) {
            totalinterestRate += money*(interestRate/100)*(month*30)/360;
        }
        System.out.println("tiền lãi: " + totalinterestRate);
    }
}
