package ra.bt3;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(checkPrime(i)) {
                System.out.println(i + " là số nguyên tố.");
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
