class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int rev=0;
        if(x<0)
        return false;
        while(a>0)
        {
            rev=rev*10+a%10;
            a/=10;
        }
        return x==rev;
    }
}