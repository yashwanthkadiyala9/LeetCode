class Solution {
    public long countCommas(long n) {
        long value = n;
        long r = 0;
        long k = 1;
        for(long i =1;k<=value;i++){
            long last = Math.min(value,k*10 - 1);
            long c = last - k +1;
            int comma = (int)(i-1) / 3;
            r += c*comma;
            k *= 10;
        }
        return r;
        
    }
}