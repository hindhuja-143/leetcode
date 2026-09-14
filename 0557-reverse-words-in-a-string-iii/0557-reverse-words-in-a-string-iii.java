class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        String [] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder word=new StringBuilder(arr[i]);
            word.reverse();
            sb.append(word+" ");
        }
        return sb.toString().trim();
    }
}