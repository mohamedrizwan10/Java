class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length(), n = word2.length();
        int minLen = Math.min(m, n);

        // Merge up to the length of the shorter word
        for (int i = 0; i < minLen; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // Append the remaining part of the longer string
        if (m > n) {
            sb.append(word1.substring(n));
        } else if (n > m) {
            sb.append(word2.substring(m));
        }

        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
