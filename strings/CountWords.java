package strings;

public class CountWords {
    public static void main(String arg[]) {
        String str = "Hi Im a fullstack  developer";

        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);
    }
}
