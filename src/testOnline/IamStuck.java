package testOnline;

import java.util.Arrays;
import java.util.Scanner;

public class IamStuck {
    static void ForwardDFS(char[][] map, int r, int c, boolean[][] visited) {

        int nextr, nextc;
        visited[r][c] = true;
    //    System.out.println(map[r][c] + "\t" + r + "\t" + c);
        if (map[r][c] == '+' || map[r][c] == 'S' || map[r][c] == 'T') {
            nextr = r - 1;
            nextc = c;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
            nextr = r + 1;
            nextc = c;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
            nextr = r;
            nextc = c - 1;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
            nextr = r;
            nextc = c + 1;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
        } else if (map[r][c] == '-') {
            nextr = r;
            nextc = c - 1;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
            nextr = r;
            nextc = c +1;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
        } else if (map[r][c] == '|') {
            nextr = r - 1;
            nextc = c;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
            nextr = r + 1;
            nextc = c;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
        } else if (map[r][c] == '.') {
            nextr = r + 1;
            nextc = c;
            if (isLegal(map, nextr, nextc) && !visited[nextr][nextc]) {
                ForwardDFS(map, nextr, nextc, visited);
            }
        }
    }

    static boolean isLegal(char[][] map, int r, int c) {
        int n = map.length;
        int m = map[0].length;
        boolean isLegal = false;
        if (r >= 0 && c >= 0 && r < n && c < m && map[r][c] != '#')
            isLegal = true;
        return isLegal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = "";
        int sr = 0, sl = 0, er = 0, el = 0;
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            while (str.length()==0){
                str=sc.nextLine();
            }
            for (int j = 0; j < str.length(); j++) {
                grid[i][j] = str.charAt(j);
                if (grid[i][j] == 'S') {
                    sr = i;
                    sl = j;
                }
                if (grid[i][j] == 'T') {
                    er = i;
                    el = j;
                }
            }
           // System.out.println("##################################\n"+Arrays.toString(grid[i]));
        }
        boolean[][] visited = new boolean[n][m];
        ForwardDFS(grid, sr, sl, visited);
        int count = 0;
        if (visited[er][el]) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (visited[i][j]) {
                 //       System.out.println("*************************************" );
                        boolean[][] visited2 = new boolean[n][m];
                        ForwardDFS(grid, i, j, visited2);
                        if (!visited2[er][el]) {
             //               System.out.println("*************************************" +
               //                     ""+grid[i][j]+"\t"+i+"\t"+j);
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        } else {
            System.out.println("I'm stuck!");

        }
    }
}
