package buoi02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hien_thi_20_snt_dau_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        int quaanity = scanner.nextInt();
        System.out.println("cac so nguyen to la:");
        int count =0;
        int number=0;
        while ( count < quaanity) {
            if (isPrime(number)) {
                System.out.println(number + " ");
                count++;
            }
            number++;
        }
   }
   public static boolean isPrime(int n){
        if ( n < 2) { return false;}
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if ( n%i ==0) {
                    return false;
                }

            }
        }
       return true;
   }

   }

