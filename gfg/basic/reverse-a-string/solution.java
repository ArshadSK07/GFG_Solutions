class Solution {
    public static String reverseString(String s) {
        // code here
        char [] str = s.toCharArray();
        int i=0;
        int j=str.length-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return new String(str);
    }
}