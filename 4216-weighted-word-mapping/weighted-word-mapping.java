class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int totalWeight = 0;

            for (char ch : word.toCharArray()) {
                totalWeight += weights[ch - 'a'];
            }

            int mod = totalWeight % 26;

            // Reverse alphabetical mapping
            char mapped = (char) ('z' - mod);

            result.append(mapped);
        }

        return result.toString();
    }
}