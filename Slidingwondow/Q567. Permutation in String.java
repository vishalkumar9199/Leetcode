class Solution {
     private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] window = new int[26];

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            // Add current char to window
            window[s2.charAt(i) - 'a']++;

            // Remove left char if window size > k
            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            // Compare arrays
            if (matches(s1Count, window)) {
                return true;
            }
        }

        return false;
        
    }
}
