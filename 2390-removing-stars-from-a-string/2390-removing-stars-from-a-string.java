class Solution {
    public String removeStars(String s) {
       Stack<Character>stk=new Stack<>();
       for(char ch:s.toCharArray())
       {
        if(ch!='*')
        stk.push(ch);
        else
        stk.pop();
       } 
       StringBuilder sb=new StringBuilder();
       while(!stk.isEmpty())
       sb.insert(0,stk.pop());
       return sb.toString();
    }
}