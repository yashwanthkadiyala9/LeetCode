class Solution {
    public int countValidPrefixes(String s) {
        int y = 0;
        int k = 0;
        int rem = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                y++;
            }
            else
                k++;
            if(Math.abs(y-k)<= 1){
                rem++;
            }
            }
        return rem;
        }
    }
