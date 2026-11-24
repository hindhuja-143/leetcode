class Solution {
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int pro=1;
            int lcm=1;
            int gcd=0;
            for(int j=i;j<n;j++)
            {
                pro*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
                if(pro==lcm*gcd)
                {
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}