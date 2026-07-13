class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String st = "123456789";
        int llen = String.valueOf(low).length();
        int hlen = String.valueOf(high).length();
        List<Integer> rs = new ArrayList<>();
        
        // 1. Changed to i <= hlen to include the maximum possible length
        for (int i = llen; i <= hlen; i++) {
            for (int s = 0; s + i <= 9; s++) {
                String str = st.substring(s, s + i);
                int n = Integer.parseInt(str);
                
                // 2. Changed to >= and <= for inclusive range matching
                if (n >= low && n <= high) {
                    rs.add(n);
                }
            }
        }
        return rs;
    }
}