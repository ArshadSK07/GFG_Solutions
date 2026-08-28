class Solution {
    public static boolean checkPangram(String s) {
        // code here
        int [] freq=new int [26];
        for(char c : s.toCharArray()){
            if(c >='a' && c<='z')
                freq[c-'a']++;
            else if(c>='A' && c<='Z')
                freq[c-'A']++;
        }
        for(int i=0;i<26;i++)
            if(freq[i]==0) return false;
        return true;
    }
}