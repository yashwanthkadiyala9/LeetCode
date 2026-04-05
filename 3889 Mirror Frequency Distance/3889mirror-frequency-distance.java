class Solution {
    public int mirrorFrequency(String s) {
        int[] l = new int[26];
        int[] d = new int[10];
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
            l[c-'a']++;
            }
        else{
            d[c - '0']++;
        }
        }
    int t = 0;
    for(int i =0;i<26;i++){
    int  m = 25 - i;
    if(i<=m){
    t += Math.abs(l[i] - l[m]);
    }
    }
for(int i =0;i<9;i++){
    int mi = 9 - i;
    if(i<=mi){
        t += Math.abs(d[i] - d[mi]);
        
    }
}
return t;
}
}