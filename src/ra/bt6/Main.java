package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Lựa chọn: ");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 4:
                    System.out.println("đã thoát");
                    System.exit(4);
                    break;
                case 1:
                    System.out.println("nhập 1 số: ");
                    int so = sc.nextInt();
                    if(so % 2 == 0) {
                        System.out.println("số chẵn");
                    } else {
                        System.out.println("số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("nhập số: ");
                    int num = sc.nextInt();
                    if(num != 0 && num != 2 && num % Math.sqrt(num) != 0 ) {
                        System.out.println(num + " là số nguyên tố");
                        break;
                    } else {
                        System.out.println(num + " không là số nguyên tố");
                        break;
                    }
                case 3:
                    System.out.println("nhập số: ");
                    int number = sc.nextInt();;
                    if(number % 3 == 0) {
                        System.out.println(number + " chia hết cho 3");
                        break;
                    } else {
                        System.out.println(number + " không chia hết cho 3");
                        break;
                    }
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    System.exit(choice);
            }
        } while (choice != 0);
    }

}
