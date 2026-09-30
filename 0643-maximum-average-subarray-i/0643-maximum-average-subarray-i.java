class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int n=nums.length;
     
     int right=0,left=0;
     double max=Double.NEGATIVE_INFINITY;;
     int sum=0;
     for(;right<n;right++)
     {
        sum=sum+nums[right];
        if(right-left+1>=k)
        {
            double avg=(double)sum/k;
            max=Math.max(avg,max);
            sum=sum-nums[left];
            left++;
        }
     }   
     return max;
    }
}