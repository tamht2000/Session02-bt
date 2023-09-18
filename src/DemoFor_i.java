public class DemoFor_i {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if(checkPrime(i)) {
                System.out.println("so nguyen to: " + i);
            }
        }
    }

    public static boolean checkPrime(int num) {
       if(num == 0) {
           return false;
       }
       if(num == 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(num); i++) {
           if(num % i == 0) {
               return false;
           }
       }
       return true;
    }
}
