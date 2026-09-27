/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let set=new Set();
    let list=[];
    for(let i=0;i<nums.length;i++)
    {
        set.add(nums[i]);
    }
    for(let i=1;i<=nums.length;i++)
    {
        if(!set.has(i))
        list.push(i);
    }
    return list;
};