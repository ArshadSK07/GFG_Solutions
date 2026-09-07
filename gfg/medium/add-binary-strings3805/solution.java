class Solution {
    public String addBinary(String a, String b) {
        // code here
        int i=a.length()-1;
                int j=b.length()-1;
                StringBuilder sb=new StringBuilder();
                // convert two strings into character array
                char [] as=a.toCharArray();
                char [] bs=b.toCharArray();
                char carry='0';
                while(i>=0 && j>=0){
                    int sum=as[i]-'0'+bs[j]-'0'+carry-'0';
                    if(sum==0){
                        carry='0';
                        sb.append('0');
                    }else if(sum==1){
                        carry='0';
                        sb.append('1');
                    }else if(sum==2){
                        carry='1';
                        sb.append('0');
                    }else{
                        carry='1';
                        sb.append('1');
                    }
                    i--;
                    j--;
                }
                while(i>=0){
                    int sum=as[i]-'0'+carry-'0';
                    if(sum==0){
                        carry='0';
                        sb.append('0');
                    }else if(sum==1){
                        carry='0';
                        sb.append('1');
                    }else if(sum==2){
                        carry='1';
                        sb.append('0');
                    }else{
                        carry='1';
                        sb.append('1');
                    }
                    i--;
                }
                while(j>=0){
                    int sum=bs[j]-'0'+carry-'0';
                    if(sum==0){
                        carry='0';
                        sb.append('0');
                    }else if(sum==1){
                        carry='0';
                        sb.append('1');
                    }else if(sum==2){
                        carry='1';
                        sb.append('0');
                    }else{
                        carry='1';
                        sb.append('1');
                    }
                    j--;
                }
                if(carry=='1') sb.append('1');
                String result = sb.reverse().toString();

                // Remove leading zeros as required by the problem
                int start = 0;
                while (start < result.length() - 1 && result.charAt(start) == '0') {
                    start++;
                }

                return result.substring(start);
    }
}