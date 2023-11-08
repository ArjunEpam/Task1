package tasks2.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        findAndPrintDuplicateCharacters(input);
    }

    public static void findAndPrintDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char ch : characters) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
