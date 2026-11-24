class Solution {
    public boolean checkString(String s) {
        //boolean aflag=true;
        boolean bflag=true;
        //<Character>stk=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='a'&&bflag==true)
            {
                continue;
            }
            else if(ch=='a'&&bflag==false)
            {
                return false;
            }
            else if(ch=='b')
            {
                bflag=false;
            }
        }
        return true;
    }
}