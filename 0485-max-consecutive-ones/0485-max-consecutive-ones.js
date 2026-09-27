/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let n=nums.length;
    let count=0;
    let max=0;
    for(let i=0;i<n;i++)
    {
        if(nums[i]==0)
        count=0;
        else if(nums[i]==1)
        count++;
        max=Math.max(count,max);
    }
    return max;
};