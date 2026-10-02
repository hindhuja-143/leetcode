class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        boolean flag=true;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    flag=false;
                }
            }
        }
        if(flag)
        return 0;
        int [] dr={-1,1,0,0};
        int [] dc={0,0,-1,1};
        int count=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int k=0;k<size;k++){
            int [] cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            for(int i=0;i<4;i++)
            {
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<grid[0].length&&grid[nr][nc]==1)
                {
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc]=2;
                }
            }
           }
           count++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }
        return count-1;
    }
}