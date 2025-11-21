package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String rev = "";
        // 5. 5 >= 0
        for (int i = str.length() - 1; i >= 0; i--) {
            // debug step
            // System.out.println(i + ": " + str.charAt(i));
            rev += str.charAt(i);
        }

        System.out.println("reversed: " + rev);
    }

}
