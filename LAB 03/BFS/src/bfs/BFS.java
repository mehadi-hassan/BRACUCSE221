/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bfs;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author 17101177
 */
public class BFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         File file = new File ("graph.txt");
        Scanner sc = null;
        try{
            sc = new Scanner (file);
        }
        catch (IOException e){
            System.out.println("File not found");
        }
        
        int w = sc.nextInt() + 1;
        int[][] matrixUndirected = new int[w][w];
        while(sc.hasNextInt()){
            int p = sc.nextInt();
            int q = sc.nextInt();
            matrixUndirected[p][q] = 1;
            matrixUndirected[q][p] = 1;
        }
        
        bfs(matrixUndirected , 1);
        
         for(int i = 0 ; i<matrixUndirected.length ; i++){
             
             for(int j = 0 ; j <matrixUndirected.length ; j++){
                System.out.print(matrixUndirected[i][j]+" ");
            }
             System.out.println();
        }
        
    }
    
    public static void bfs (int[][] a , int s){
        String[] color = new String[a.length];
        int[] distance = new int[a.length];
        int[] parent = new int[a.length];
        Queue<Integer> q = new LinkedList<>(); 
        
        for(int i = 1 ; i < a.length ; i++){
            color[i] = "white";
            distance[i] = 999999;
            parent[i] = -1;
        }
        
        color[s] = "gray";
        distance[s] = 0;
        parent[s] = -1;
        
        q.add(s);
        while (!q.isEmpty()){
            int u = q.poll();
            
            for(int j = 1 ; j < a.length ; j++){
                
                if(a[u][j] == 1 && color[j].equals("white")){
                    color[j] = "gray";
                    distance[j] = distance[u] + 1;
                    parent[j] = u;
                    q.add(j);
                 }
            }
            
            color[u]  = "black";
            
        }
        
        print(parent, distance);
    }
    
    public static void print(int[] p , int[] d){
        for(int i = 1 ; i<p.length ; i++){
            
            
            
            
            
//            System.out.println(i+ " "+p[i]+"->"+d[i]);
        }
    }
    
    
}
