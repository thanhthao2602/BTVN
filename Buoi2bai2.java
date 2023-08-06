package buoi2bai2;

import java.util.Scanner;

public class Buoi2bai2 {

    public static void main(String[] args) {
         float tong = 0;
         int sum=0 ;
         int gt=1;
        int n;
        Scanner s;
        do {
            System.out.println("Nhap n = ");
            s = new Scanner(System.in);
            n = s.nextInt();

        }while(n <= 0);
    // Tính tổng S = 1 + 1/2 + 1/3 +...+1/n với n là số nguyên dương      
        for(int i = 1; i <= n; i++) {
            tong += 1.0/i;
        }
         
        System.out.println("S = " + tong); 
        // Tính tổng P = 1! + 2! + 3! + ... + n! với n là số nguyên dương 
        
        for(int i=1 ; i<=n ; i++){
           gt *=i;
           sum+=gt;
        }
      System.out.println("P = " + sum);   
    }

}
