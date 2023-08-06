package bai4buoi2;

import java.util.Scanner;

public class Bai4buoi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        double a = s.nextDouble();
        System.out.print("Nhap b = ");
        double b = s.nextDouble();
        System.out.print("Nhap c = ");
        double c = s.nextDouble();
        
        // Đặt x^2 = t;
        double delta = b * b - 4 * a * c;
        double t1, t2;
        
        if (delta >= 0) {
            t1 = (-b + Math.sqrt(delta)) / (2 * a);
            t2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            if (t1 >= 0) {
                double x1 = Math.sqrt(t1);
                double x2 = -Math.sqrt(t1);
                System.out.println("Phương trình có nghiệm thực: x1 = " + x1 + ", x2 = " + x2);
            } else {
                System.out.println("Phương trình không có nghiệm thực");
            }
            
            if (t2 >= 0) {
                double x3 = Math.sqrt(t2);
                double x4 = -Math.sqrt(t2);
                System.out.println("Phương trình có nghiệm thực: x3 = " + x3 + ", x4 = " + x4);
            } else {
                System.out.println("Phương trình không có nghiệm thực");
            }
        } else {
            System.out.println("Phương trình không có nghiệm thực");
        }
        
        s.close();
    }
}

