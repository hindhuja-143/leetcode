class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int digit=0;
        int a=n;
        while(n>0)
        {
            digit=n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n/=10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            int n1=entry.getKey();
            int n2=entry.getValue();
            sum=sum+(n1*n2);
        }
        return sum;
    }
}