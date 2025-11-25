package strings;

public class Armstrong {
    public static void main(String arg[]) {
        int n = 153;
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            System.out.println(n + " " + n % 10);
            sum += digit * digit * digit;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
