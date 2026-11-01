class Solution {
    public int countDigits(int num) {
        int count=0;
        int san=num;
        while(num>0)
        {
            int digit=num%10;
            if(san%digit==0)
            count++;
            num/=10;
        }
        return count;
    }
}