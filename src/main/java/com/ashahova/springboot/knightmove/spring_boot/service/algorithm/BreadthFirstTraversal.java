package com.ashahova.springboot.knightmove.spring_boot.service.algorithm;
import org.springframework.boot.test.util.TestPropertyValues;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstTraversal {

    protected static final int row[] = {-2, -1, 1, 2, -2, -1, 1, 2};
    protected static final int col[] = {-1, -2, -2, -1, 1, 2, 2, 1};


    public static boolean isVisited(int width,int height,int x,int y,boolean visited[][]){
        return ((x >= 0) && (x< width)
                && (y >= 0) && (y < height)
                && (!visited[x][y]));
    }

   public static int searchAlgorithm(int width,int heiht,int x,int y,int x1,int y1){
       boolean [][] visited = new boolean[width][heiht];
       int [][]dist = new int[width][heiht];

       x=x-1;
       y=y-1;
       x1=x1-1;
       y1=y1-1;

       for (int i = 0; i < width; i++) {
           for (int j = 0; j <heiht; j++)
               dist[i][j] = -1;
       }
       Queue<HorsePosition> q = new ArrayDeque<HorsePosition>();

       q.add(new HorsePosition(x, y));
       visited[x][y] = true;
       dist[x][y]=0;
       while (!q.isEmpty()) {
           HorsePosition horsePosition = q.poll();

           x = horsePosition.x;
           y = horsePosition.y;

           if (x == x1 && y == y1) {
               dist[x][y]=dist[x1][y1];
               break;
           }

           for (int k = 0; k < 8; k++) {
               if (isVisited(width,heiht, x + row[k], y + col[k], visited)) {
                   q.add(new HorsePosition(x + row[k], y + col[k]));
                   visited[x + row[k]][y + col[k]] = true;
                   dist[x + row[k]][y + col[k]] = dist[x][y]+1;
               }
           }
       }
       if (dist[x1][y1] != -1)
          return dist[x1][y1];
        else {
           System.out.println(-1);
           return -1;
       }
    }
}
