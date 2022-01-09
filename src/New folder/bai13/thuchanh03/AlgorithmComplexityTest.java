package bai13.thuchanh03;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char charecter = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max){
                max = frequentChar[j];
                charecter = (char) j;
            }

        }
        System.out.println("the most appearing letter is" + charecter + "with a frequency of " + max + "times");


    }
}
