class Solution {
    public double[] convertTemperature(double c) {
        double []ans=new double[2];
        ans[0]=c + 273.15;
        ans[1]=c* 1.80 + 32.00;
        return ans;
    }
}
