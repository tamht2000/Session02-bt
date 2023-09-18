package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("nhập cạnh 1: ");
            double a = sc.nextInt();
            System.out.println("nhập cạnh 2: ");
            double b = sc.nextInt();
            System.out.println("nhập cạnh 3: ");
            double c = sc.nextInt();
            if(a > 0 && b > 0 && c > 0 && a+b>c && b+c>a && a+c>b) {
                double p = a+b+c;
                double cv =p /2;
                double s=Math.sqrt(cv*(cv-a)*(cv-b)*(cv-c));
                System.out.println("chu vi: " + p);
                System.out.println("diện tích: " + s);
                break;
            } else {
                System.out.println("các cạnh không đúng, vui lòng nhâp lại");
            }
        }
    }
}
