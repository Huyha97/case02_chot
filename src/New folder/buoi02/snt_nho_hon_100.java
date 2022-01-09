package buoi02;

import java.util.Scanner;

public class snt_nho_hon_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int N = 2;
      boolean check = true;
      while (N < 200) {
          for (int i = 2; i < Math.sqrt(N); i++) {
              if (N%i ==0) {
                  check = false;
                  break;
              }
          }
          if (check) {
              System.out.println(N);
          }
          check = true;
          N++;
      }
    }
}
