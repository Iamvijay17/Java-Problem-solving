package strings;

public class ReverseWords {
    public static void main(String arg[]) {
        String sentence = "Hi Welcome";
        String result = "";

        String[] words = sentence.split(" ");

        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            result += reverseWord + " ";
        }

        System.out.println(result);
    }
}
