package strings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static void main(String arg[]) {
        String str = "successes";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxChar) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most frequent char: " + maxChar + " (count = " + maxCount + ")");
    }
}
