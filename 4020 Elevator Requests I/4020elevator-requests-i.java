class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum = 0;
        int prev = 0;
        for(int i = 0;i<requests.length;i++){
            if(requests[i] != sum){
                prev += Math.abs(requests[i] - sum);
                sum = requests[i];
            }
        }
        return prev;
    }
}