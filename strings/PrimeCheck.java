package strings;

public class PrimeCheck {
    public static void main(String arg[]) {
        int n = 6;
        boolean isPrime = true;

        if (n <= 1)
            isPrime = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("is prime number");
        } else {
            System.out.println("is not a prime number");
        }
    }

}
