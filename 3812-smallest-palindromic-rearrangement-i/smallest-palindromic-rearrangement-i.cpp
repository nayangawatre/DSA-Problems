class Solution {
public:
    string smallestPalindrome(string s) {
           int n=s.length();
         int m=n/2;
         sort(begin(s),begin(s)+m);
         int i=0;
        
        while(i<m){
            s[n-1-i]=s[i];
            i++;


        }
        return s;
    }
        
    
};