class Solution {
public:
    int fact(int n){
        if(n==1||n==0)
            return 1;
        return n*fact(n-1);
    }
    bool isDigitorialPermutation(int n) {
        int v=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=fact(rem);
            n=n/10;
        }
        string s=to_string(v);
        sort(s.begin(),s.end());
        string t=to_string(sum);
        sort(t.begin(),t.end());
        if(s==t)
            return true;
        return false;
    }
};