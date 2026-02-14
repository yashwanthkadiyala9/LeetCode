class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s = new StringBuilder();
        for(int i =0;i<words.length;i++)
            {
                int sum =0;
                for(int j =0;j<words[i].length();j++)
                    {
                        char x= words[i].charAt(j);
                        sum += weights[x-'a'];
                    }
                int r = (int)(sum % 26);
                char m = (char)('z' - r);
                s.append(m);
                
            }
        return s.toString();
        
    }
}