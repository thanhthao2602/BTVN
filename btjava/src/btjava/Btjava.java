package btjava;

import java.util.Scanner;

public class Btjava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // in hình vuông có độ dài cạnh bằng n 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    boolean isPrime = true;
//Kiểm tra số nguyên tố 
    if(n<=1){
        isPrime = false;
    }
    else{
        for(int i=2 ; i<= Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
    }
    if(isPrime){
      System.out.println(n + " là số nguyên tố.");   
    }
    else{
     System.out.println(n + " không phải là số nguyên tố.");   
    }
    }
}
