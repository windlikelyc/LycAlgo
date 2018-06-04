package algorithm.Problems.friendCircles;


// 朋友圈思想， 初始每个用户都没扫过，扫完1后1的所有朋友置位1，同时 1朋友的朋友置位1，1朋友的朋友的朋友也置为1 ，最后看把谁剩下
public class Solution {

    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {  // i 代表一个同学，扫他和其他（包括自己）所有人的关系
            if (M[i][j] == 1 && visited[j] == 0) { // i和j有关系 并且j没被扫到
                visited[j] = 1;
                dfs(M, visited, j);  // 已j为基准接着扫
            }
        }
    }
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];  // 每一个同学建立一个标志
        int count = 0;
        for (int i = 0; i < M.length; i++) { // 遍历所有同学
            if (visited[i] == 0) {   // 如果该同学没扫到，言外之意就是可能已经将该同学扫过了
                dfs(M, visited, i);  // 扫该同学的朋友圈子
                count++;
            }
        }
        return count;
    }

}
