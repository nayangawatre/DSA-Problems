class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        String r="";

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){

                c++;
                if(c==1){
                    continue;
                }



            }
            else if(s.charAt(i)==')'){
                c--;
            }
            if(c>=1){
                r=r+s.charAt(i);

            }
        }
        return r;
        
    }
}