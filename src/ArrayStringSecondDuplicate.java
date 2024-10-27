import java.util.HashMap;

public class ArrayStringSecondDuplicate {
    public static void main(String[] args) {
        System.out.println(findSecondDuplicate("ughdwiui"));
    }

    public static char findSecondDuplicate(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        int duplicateCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.get(c) > 1) {
                duplicateCount++;
                if (duplicateCount == 2) {
                    return c;
                }
            }
        }

        throw new IllegalArgumentException("String does not have a second duplicate character.");
    }

}
