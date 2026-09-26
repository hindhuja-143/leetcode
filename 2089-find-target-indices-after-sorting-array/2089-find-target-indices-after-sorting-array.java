class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        //int low=0,high=n-1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            list.add(i);
        }
        return list;
    }
}