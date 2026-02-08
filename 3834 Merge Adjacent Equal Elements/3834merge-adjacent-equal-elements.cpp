class Solution {
public:
    vector<long long> mergeAdjacent(vector<int>& nums) {
        int n = nums.size();
        vector<long long> v1;
        int x;
        for(x=0;x<n;x++)
            {
                v1.push_back(nums[x]);
                while(v1.size()>=2 && v1.back()==v1[v1.size()-2])
                      {
                    long long a = v1.back()*2;
                          v1.pop_back();
                          v1.pop_back();
                          v1.push_back(a);
                      }
                  
            }
        return v1;
    }
};