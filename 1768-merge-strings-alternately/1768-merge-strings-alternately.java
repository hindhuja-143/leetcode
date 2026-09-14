class Solution {
    public String mergeAlternately(String w1, String w2) {
        int n1=w1.length(),n2=w2.length();
        int maxlen=Math.max(n1,n2);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<maxlen;i++)
        {
            if(n1>0)
            {
              sb.append(w1.charAt(i));
              n1--;
            }
            
            if(n2>0)
            {
                sb.append(w2.charAt(i));
                n2--;
            }
        }
        return sb.toString();
    }
}