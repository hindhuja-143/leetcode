class Solution {
    public int subtractProductAndSum(int n) {
        int san=0,hin=1;
        while(n>0)
        {
            int d=n%10;
            san=san+d;
            hin=hin*d;
            n/=10;
        }
        return hin-san;
    }
}