import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // 1. Clone original array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // 2. Map each unique element to its 1-based rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        // 3. Build the answer array
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = rankMap.get(arr[i]);
        }
        
        return ans;
    }
}