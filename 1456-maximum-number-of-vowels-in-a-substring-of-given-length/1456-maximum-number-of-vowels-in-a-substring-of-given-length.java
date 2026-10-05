class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int right=0,left=0;
        String vow="aeiou";
        int count=0,max=0;
        for(;right<n;right++)
        {
          char ch=s.charAt(right);
          if(vow.indexOf(ch)!=-1)
          {
            count++;
          }
          if(right-left>=k)
          {
           char c=s.charAt(left);
           if(vow.indexOf(c)!=-1)
           count--;
           left++;
          }
          max=Math.max(count,max);
          
        }
        return max;
    }
}