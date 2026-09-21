class Solution {
    public int strStr(String haystack, String needle) {
        /*HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:needle)
        map.put(ch,map.getOrDefault(ch));
        int n=haystack.length;
        for(int i=0;i<n;i++)
        {
            char ch1=haystack.charAt(i);
            char ch2=needle.charAt(i);
            if(ch1!=ch2)
            return -1;
            else
            {
                if(i==0)
                fir=i;
                c++;
                if(c==needle.length)
                return 
            }
        }*/
        return haystack.indexOf(needle);
    }
}