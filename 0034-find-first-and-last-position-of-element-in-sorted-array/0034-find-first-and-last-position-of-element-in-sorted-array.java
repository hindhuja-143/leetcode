class Solution {
    public int[] searchRange(int[] nums, int target) {
      int n=nums.length;
      int [] arr=new int [2];
      Arrays.fill(arr,-1);
      int low=0,high=n-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target)
        {
            arr[0]=mid;
            high=mid-1;
        }
        else if(nums[mid]<target)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
      }
      low=0;
      high=n-1;
      while(low<=high)
      {
        int mid=low+(high-low)/2;
        if(nums[mid]==target)
        {
            arr[1]=mid;
            low=mid+1;
        }
        else if(nums[mid]<target)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
      }
      return arr;
    }
}