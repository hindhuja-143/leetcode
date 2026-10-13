class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int [] arr=new int[k];
        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);
        Integer[]unique=map.keySet().toArray(new Integer[0]);
        Arrays.sort(unique,(a,b)->{
            if(!map.get(a).equals(map.get(b)))
            return map.get(b)-map.get(a);
            return a-b;
        });
        for(int i=0;i<k;i++)
        {
            arr[i]=unique[i];
        }
        return arr;
    }
}