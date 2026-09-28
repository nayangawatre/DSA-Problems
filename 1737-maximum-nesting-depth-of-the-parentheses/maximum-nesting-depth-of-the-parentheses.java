class Solution {
    public int maxDepth(String s) {
        int c=0 ,m=0;
        for(int i=0;i<s.length();i++){
        
            if(s.charAt(i)=='('){
                c++;
                m=Math.max(m,c);
            }
            else if(s.charAt(i)==')'){
                c--;
            }
        }
        return m;
        
    }
}