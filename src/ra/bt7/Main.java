package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Lựa chọn: ");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật .");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 4:
                    System.out.println("đã thoát");
                    System.exit(4);
                    break;
                case 1:
                    System.out.println("nhập chiều dài: ");
                    int dai = sc.nextInt();
                    System.out.println("nhập chiều rộng: ");
                    int rong = sc.nextInt();
                    System.out.println("Chu vi hcn: " + (dai + rong) * 2);
                    System.out.println("Diện tích hcn: " + dai * rong);

                    break;
                case 2:
                    System.out.println("nhập cạnh 1: ");
                    int a = sc.nextInt();
                    System.out.println("nhập cạnh 2: ");
                    int b = sc.nextInt();
                    System.out.println("nhập cạnh 3: ");
                    int c = sc.nextInt();

                    int p = (a + b + c) / 2;
                    System.out.println("Chu vi tam giác: " + (a + b + c));
                    System.out.println("Diện tích tam giác: " + Math.sqrt(p * (p - a) * (p - b * (p - c))));

                    break;
                case 3:
                    System.out.println("nhập bán kính: ");
                    int r = sc.nextInt();
                    ;
                    float PI = 3.14f;
                    System.out.println("chu vi hình tròn: " + 2 * PI * r);
                    System.out.println("Diện tích hình tròn: " + PI * r * r);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    System.exit(choice);

            }

        }while (choice != 0) ;
    }
}
