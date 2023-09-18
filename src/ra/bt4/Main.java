package ra.bt4;

public class Main {
    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        int n = 2;
        for(int i = 2; i <= n; i++) {
            if(count <= num) {
                if(checkPrime(i)) {

                    System.out.println(i + " là số nguyên tố thứ " + count);
                    count++;
                }
                n++;
            }

        }
    }

    public static boolean checkPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
