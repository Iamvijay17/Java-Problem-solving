package strings;

public class RemoveDuplicates {
    public static void main(String arg[]) {
        String str = "banana";
        String result = "";

        for (char value : str.toCharArray()) {
            if (result.indexOf(value) == -1) {
                result += value;
            }
        }

        System.out.println(result);

    }
}
