class Solution {
    public String compressedString(String word) {
     StringBuilder sb=new StringBuilder();
     int n=word.length();
     int count=0;
     int i=0;
     while(i<n)
     {
        char ch=word.charAt(i);
        count=0;
        while(i<n&&ch==word.charAt(i))
        {
            count++;
            i++;
        }
       
        while(count>9)
        {
            sb.append("9");
            sb.append(ch);
            count=count-9;
        }
        if(count>0)
        {
            sb.append(count);
            sb.append(ch);
        }
     }   
     return sb.toString();
    }
}