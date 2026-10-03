import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1); // Base index boundary
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    // Current ')' cannot be matched; becomes the new boundary
                    st.push(i);
                } else {
                    // Length of the valid substring ending at i
                    maxLength = Math.max(maxLength, i - st.peek());
                }
            }
        }

        return maxLength;
    }
}