class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int [] >q=new LinkedList<>();
        int original=image[sr][sc];
        if(image[sr][sc]==color)
        return image;
        q.offer(new int[]{sr,sc});
        int [] dr={-1,1,0,0};
        int [] dc={0,0,-1,1};
        image[sr][sc]=color;
        while(!q.isEmpty())
        {
           int [] cell=q.poll();
           int r=cell[0];
           int c=cell[1];
           for(int i=0;i<4;i++)
           {
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0&&nr<image.length&&nc>=0&&nc<image[0].length&&image[nr][nc]==original)
            {
                image[nr][nc]=color;
                q.offer(new int[]{nr,nc});
            }
           }
        }
        return image;
    }
}