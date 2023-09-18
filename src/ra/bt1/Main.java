package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập số:
        System.out.println("Nhập số đầu: ");
        int a = sc.nextInt();
        System.out.println("Nhập số cuối: ");
        int b = sc.nextInt();
        int c = 0;
        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                c += i;
                System.out.println("các số chẵn: " + i);

            }
        }

        System.out.println("Tổng các số chẵn: " + c);
    }
}
