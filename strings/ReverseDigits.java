package strings;

public class ReverseDigits {
    public static void main(String arg[]) {
        int num = 8;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10; // last digit
            rev = rev * 10 + digit;
            System.out.println(digit + " " + rev);
            num = num / 10; // remove last digit
        }

        System.out.println(rev);
    }
}
