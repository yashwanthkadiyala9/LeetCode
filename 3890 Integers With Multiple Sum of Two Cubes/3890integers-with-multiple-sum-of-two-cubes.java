class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int l = n;
        Map<Integer, Integer> c = new HashMap<>();
        int li = (int) Math.cbrt(l);
        for(int i=1;i<li;i++){
            for(int j = i;j<=li;j++){
                long s = (long) i * i * i + (long) j * j * j;
                if(s <= l){
                    c.put((int) s, c.getOrDefault((int)s,0)+1);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : c.entrySet()){
            if(entry.getValue() >= 2){
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}