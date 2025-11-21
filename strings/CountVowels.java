package strings;

public class CountVowels {
    public static void main(String[] args) {
        String str = "education";
        int result = 0;

        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result++;
            }

        }

        System.out.println(result);
    }
}
