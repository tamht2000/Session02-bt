package ra.bt2;

public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i < 3; i++) {
//            System.out.println("");
//            for(int j = 0; j < 7; j++) {
//                System.out.printf("*");
//            }
//        }

//        for (int i = 1; i <= 6; i++) {
//            System.out.println("");
//            for (int j = 1; j < i; j++) {
//                if(j - i > 0 ) {
//                    System.out.println(" ");
//                } else {
//                    System.out.printf("*");
//                }
//            }
//        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("");
//            for (int j = 1; j <= 5; j++) {
//                if((j + i) <= 6 ) {
//                    System.out.printf("*");
//                } else {
//                    System.out.printf("");
//                }
//            }
//        }

        int n = 5; // Số hàng của tam giác
        for (int i = 1; i <= n; i++) {
            // In ra khoảng trắng phía trước
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In ra dấu '*' cho hàng hiện tại
            for (int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print("*");
            }

            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }
    }
}
