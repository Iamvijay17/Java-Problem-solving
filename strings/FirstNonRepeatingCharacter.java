package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abbcddeeffr";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating char: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating characters found.");
    }
}
