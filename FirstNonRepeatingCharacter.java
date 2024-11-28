import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static int firstUniqChar(String s) {
        // Step 1: Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Step 2: Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 3: Iterate through the string and find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "leetcode";
        System.out.println("First non-repeating character index: " + firstUniqChar(s1)); 

        String s2 = "loveleetcode";
        System.out.println("First non-repeating character index: " + firstUniqChar(s2)); 

        String s3 = "aabb";
        System.out.println("First non-repeating character index: " + firstUniqChar(s3)); 
    }
}
