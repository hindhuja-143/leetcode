class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num<=0)
        return true;
        for(int i=1;i<=num;i++)
        {
            int temp=i;
            int rev=0;
            while(temp>0)
            {
                rev=rev*10+temp%10;
                temp/=10;
            }
            if(rev+i==num)
            return true;
        }
        return false;
    }
}