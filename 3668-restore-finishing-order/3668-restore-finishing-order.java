class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int f=friends.length;
        int o=order.length;
        int [] arr=new int[f];
        HashSet<Integer>set=new HashSet<>();
        for(int num:friends)
        set.add(num);
        int k=0;
        for(int i=0;i<o;i++)
        {
            if(set.contains(order[i]))
            arr[k++]=order[i];
        }
        return arr;
    }
}