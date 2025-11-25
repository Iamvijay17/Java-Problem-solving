package strings;

public class LongestWord {
    public static void main(String arg[]) {
        String sentence = "Hello im a fullstack developer";

        String[] words = sentence.split(" ");

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word in the sentence is : " + " " + longest);
    }
}
