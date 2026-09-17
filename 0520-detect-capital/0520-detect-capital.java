class Solution {
    public boolean detectCapitalUse(String w) {
        int n=w.length();
        int first=0,upper=0,lower=0;
        for(int i=0;i<n;i++)
        {
            char ch=w.charAt(i);
            if(i==0&&Character.isUpperCase(ch))
            {
                first++;
            }
            if(Character.isUpperCase(ch))
            upper++;
            else
            lower++;
        }
        if(upper==n||lower==n)
        return true;
        if(first==1&&upper==1)
        return true;
        else if(upper>=1&&upper<n)
        return false;
        return true;
    }
}