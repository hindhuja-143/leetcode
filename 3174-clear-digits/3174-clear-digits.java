class Solution {
    public String clearDigits(String s) {
      Stack<Character>stk=new Stack<>();
      for(char ch:s.toCharArray())
      {
        if(!stk.isEmpty()&&Character.isDigit(ch))
        stk.pop();
        else
        stk.push(ch);
      }  
      StringBuilder sb=new StringBuilder();
      while(!stk.isEmpty())
      {
        sb.insert(0,stk.pop());
      }
      return sb.toString();
    }
}