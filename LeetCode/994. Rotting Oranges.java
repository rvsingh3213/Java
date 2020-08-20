

//https://leetcode.com/problems/rotting-oranges/
//994. Rotting Oranges


class Solution {
    public int orangesRotting(int[][] grid) {
        
        int r=grid.length;
        int c=grid[0].length;
        
        int fresh=0,t=0;
        Queue<int []> rotten=new LinkedList<>();
        
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)fresh++;
                else if(grid[i][j]==2)rotten.add(new int[]{i,j});
            }
        
        while(!rotten.isEmpty())
        {
            int size=rotten.size();
            
            for(int i=0;i<size;i++)
            {
                int arr[]=rotten.poll();
                
                int x=arr[0];
                int y=arr[1];
                // we can use loop intead
                if(x>0 && grid[x-1][y]==1){ fresh--; grid[x-1][y]=2; rotten.add(new int[]{x-1,y});   }
                if(y>0 && grid[x][y-1]==1){ fresh--; grid[x][y-1]=2; rotten.add(new int[]{x,y-1});   }
                if(x<r-1 && grid[x+1][y]==1){ fresh--; grid[x+1][y]=2; rotten.add(new int[]{x+1,y});   }
                if(y<c-1 && grid[x][y+1]==1){ fresh--; grid[x][y+1]=2; rotten.add(new int[]{x,y+1});   }
                
            }
            if(!rotten.isEmpty()) t++;
            
            
        }
        
        return fresh==0?t:-1;
        
    }
}