package strings;

public class GeneratePrimes {
    public static void main(String arg[]) {
        int n = 50;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
