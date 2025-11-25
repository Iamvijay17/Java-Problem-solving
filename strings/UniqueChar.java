package strings;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {
    public static void main(String arg[]) {
        String str = "aabccd";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.print("Unique Char is : ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(" " + entry.getKey());
            }
        }

    }
}
