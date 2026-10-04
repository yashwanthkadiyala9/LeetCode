class Solution {
    public int minRotations(String s) {
        int min = 0;
        int f = 0;
        int b = 0;
            int curr = 0;
        for(int i = 0;i<s.length();i++){
            int n = s.charAt(i) - '0';
            if(curr == n)
            continue;
            f = Math.abs(n-curr);
            b = 10-f;
            curr = n;
            min += Math.min(f,b);
        }
    return min;
    }
}