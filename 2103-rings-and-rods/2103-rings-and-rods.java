class Solution {
    public int countPoints(String s) {
       boolean [][] arr=new boolean [10][3];
       int n=s.length();
       for(int i=0;i<n;i+=2)
       {
        char ring=s.charAt(i);
        char rod=s.charAt(i+1);
        if(ring=='R')
        arr[rod-'0'][0]=true;
        else if(ring=='G')
        arr[rod-'0'][1]=true;
        else
        arr[rod-'0'][2]=true;
       } 
       int count=0;
       for(int i=0;i<10;i++)
       {
         if(arr[i][0]&&arr[i][1]&&arr[i][2])
         count++; 
       }
       return count;
    }
}