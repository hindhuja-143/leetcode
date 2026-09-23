class Solution {
    public String makeGood(String s) {
      int n=s.length();
      Stack<Character>stk=new Stack<>();
      for(int i=0;i<n;i++)
      {
        char ch=s.charAt(i);
       if(!stk.isEmpty()&&Character.toLowerCase(ch)==Character.toLowerCase(stk.peek())&&Character.isUpperCase(ch)!=Character.isUpperCase(stk.peek()))
          {
            stk.pop();
          }
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