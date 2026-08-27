class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] totalCounts = new int[26];
        for (char c : s.toCharArray()) {
            totalCounts[c - 'a']++;
        }

        // Try to match target[0...i-1] and strictly exceed target[i]
        for (int i = n - 1; i >= 0; i--) {
            int[] currentCounts = totalCounts.clone();
            boolean possible = true;

            // Check if prefix target[0...i-1] can be formed
            for (int j = 0; j < i; j++) {
                char c = target.charAt(j);
                if (currentCounts[c - 'a'] > 0) {
                    currentCounts[c - 'a']--;
                } else {
                    possible = false;
                    break;
                }
            }

            if (!possible) continue;

            // Find the smallest character strictly greater than target[i]
            int bumpChar = -1;
            for (int c = target.charAt(i) - 'a' + 1; c < 26; c++) {
                if (currentCounts[c] > 0) {
                    bumpChar = c;
                    break;
                }
            }

            if (bumpChar != -1) {
                // Construct the valid result string
                StringBuilder sb = new StringBuilder();
                sb.append(target.substring(0, i));
                sb.append((char) ('a' + bumpChar));
                currentCounts[bumpChar]--;

                // Append remaining characters in ascending order
                for (int c = 0; c < 26; c++) {
                    while (currentCounts[c] > 0) {
                        sb.append((char) ('a' + c));
                        currentCounts[c]--;
                    }
                }
                return sb.toString();
            }
        }

        return "";
    }
}