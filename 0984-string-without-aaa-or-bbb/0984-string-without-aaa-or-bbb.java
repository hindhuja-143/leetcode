class Solution {
    public String strWithout3a3b(int a, int b) {
        int n1=a;
        int n2=b;
        StringBuilder sb=new StringBuilder();
        while(n1>0||n2>0)
        {
            if(n1>n2)
            {
                if(n1>=2)
                {
                    sb.append("aa");
                    n1-=2;
                }
                else if(n1>0)
                {
                sb.append("a");
                n1--;
                }
                if(n2>0)
                {
                    sb.append("b");
                    n2--;
                }
            }
            else if(n2>n1)
            {
                if(n2>=2)
                {
                    sb.append("bb");
                    n2-=2;
                }
                else if(n2>0)
                {
                    sb.append("b");
                    n2--;
                }
                if(n1>0)
                {
                    sb.append("a");
                    n1--;
                }
            }
            else
            {
                if(n1>0)
                {
                    sb.append("a");
                    n1--;
                }
                 if(n2>0)
                {
                    sb.append("b");
                    n2--;
                }
            }
        }
        return sb.toString();
    }
}