class Solution {
public:
    int prefixConnected(vector<string>& words, int k) {
        unordered_map<string,int>a;
        for(int i=0;i<words.size();i++)
            {
                if(words[i].size()>=k){
                    string s = words[i].substr(0,k);
                a[s]++;
                }
            }
    int x = 0;
    for(auto &pair : a)
    {
        if(pair.second>=2)
        x++;
    }
    return x;
}
};