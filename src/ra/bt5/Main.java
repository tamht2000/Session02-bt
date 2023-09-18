package ra.bt5;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Khai báo biến N là giá trị bắt đầu kiểm tra, có giá trị là 1.
        int N = 1;

        // Bước 2: Sử dụng vòng lặp while để bắt đầu lặp.
        while (true) {
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0) {
                // Nếu N chia hết cho 5, 7 và 11 thì N là giá trị cần tìm và dừng vòng lặp.
                break;
            } else {
                // Nếu không chia hết, tăng giá trị N thêm 1 và tiến hành kiểm tra lại.
                N++;
            }
        }

        // Bước 3: Kết thúc vòng lặp, hiển thị số tìm được ra màn hình.
        System.out.println("Giá trị cần tìm là: " + N);

    }
}
