package buoi03;

import java.util.Scanner;

public class tong_duong_cheo_ma_tran_vuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so dong va so cot cua mang: ");
        int num = input.nextInt();

        double[][] array = new double[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Phan tu thu [%d][%d]: ",i,j);
                array[i][j] = input.nextDouble();
            }
        }
        double sum =0;
        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j){
                    sum += array[i][i];
//                }
//            }
        }
        System.out.print("Tong cac so o duong cheo chinh cua ma tran vuong: "+sum);
    }
}