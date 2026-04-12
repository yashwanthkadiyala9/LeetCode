class Solution {
    public double[] internalAngles(int[] sides) {
        int[] notvalid = sides;
        int a = notvalid[0];
        int b = notvalid[1];
        int c = notvalid[2];
        if(a + b <=c || a+c <= b || b+c <= a){
            return new double[]{};
        }
        double A = Math.acos((b*b + c*c - a*a) / (2.0*  b * c)) * 180.0 / Math.PI;
        double B = Math.acos((a*a + c*c - b*b) /  (2.0 * a * c)) * 180.0 / Math.PI;
        double C = Math.acos((a*a + b*b - c*c) / (2.0 * a * b)) * 180.0 / Math.PI;
        double[] ans = {A,B,C};
        Arrays.sort(ans);
        return ans;
    }
}