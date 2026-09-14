class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stk=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(!stk.isEmpty()&&stk.peek()==ch)
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