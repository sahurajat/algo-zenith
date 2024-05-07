//uniaque pathe in a grid from start to end
//There is a robot on an m x n grid. The robot is initially located at the top-left corner
 //(i.e., grid[0][0]). The robot tries to move to the bottom-right corner
 //(i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

 //tc-O(M*N)  sc->O(M*N)
class Solution {
    public int uniquePaths(int m, int n) {
        int paths[][]=new int[n][m];
        //assign the last row as 1
        for(int c=0;c<m;c++)
        {
            paths[n-1][c]=1;
        }
        //assign last coln as 1
        for(int r=0;r<n;r++)
        {
            paths[r][m-1]=1;
        }
        for(int r=n-2;r>=0;r--)
        {
            for(int c=m-2;c>=0;c--)
            {
                paths[r][c]=paths[r][c+1]+paths[r+1][c];
            }
        }
        return paths[0][0];
    }
}