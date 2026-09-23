class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int [] arr=new int[n];
        boolean flag=true;
        int k=0;
        for(int i=0;i<n;i++)
        {
            flag=true;
            for(int j=i+1;j<n;j++)
            {
                if(prices[i]>=prices[j])
                {
                    flag=false;
                    arr[i]=prices[i]-prices[j];
                    break;
                }
            }
            if(flag)
            arr[i]=prices[i];
        }
        return arr;
    }
}