class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!= s2.length()) return false;
        int []freqs1 = new int [26];
        int [] freqs2 = new int [26];
        for(int i=0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
            freqs2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
            if(freqs1[i]!=freqs2[i])
                return false;
        return true;
    }
}