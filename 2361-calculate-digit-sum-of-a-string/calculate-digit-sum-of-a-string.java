class Solution {
    public String digitSum(String s, int k) {

        

        while(s.length()>k){
            int sum=0,a=0;
             StringBuilder ans=new StringBuilder();
             for(int i=0;i<s.length();i++){

                sum += s.charAt(i) - '0';
                a++;

                   if (a == k) {
                    ans.append(sum);
                    sum = 0;
                    a = 0;
                }


             }
           if (a > 0) {
                ans.append(sum);
            }

            s = ans.toString();
        }
        return s;

       
        
    }
}