/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17101177
 */
public class DFS {
    
    public int[][] graph; 
    public String[] color;
    public int[] timeStart;
    public int[] timeEnd;
    public int[] parent;
    public int time = 0;
    
    public void dfs (int [][] temp){
        graph = temp;
        color = new String [graph.length];
        parent = new int [graph.length];
        timeStart = new int [graph.length];
        timeEnd = new int [graph.length];
        
        for(int i = 0 ; i < graph.length ; i++){
            color[i] = "white";
            parent[i] = 50000;
        }
        
        for(int i = 0 ; i < graph.length ; i++){
            if(color[i].equals("white")){
                dfs_visit(graph , i);
            }
        }
    }
    
    
    public void dfs_visit(int[][] graph , int u){
        color[u] = "gray";
        time+=1;
        timeStart[u] = time;
         
        for(int i = 0 ; i < graph.length ; i++){
           if(color[i].equals("white")){
               parent[i] = u;
              System.out.println(parent[i]);
               dfs_visit(graph , i);
               
           }
        }
        color[u] = "black";
        timeEnd[u] = time+1;
    }
    
    public void print(){
        System.out.println("Adjacency matrix:");
        System.out.print("  ");
        for(int k = 0 ; k<graph.length ; k++){
            System.out.print(k+" ");
        }
        System.out.println();
        
        for(int j = 0 ; j < graph.length ; j++){
            System.out.print(j+ " ");
            for(int k = 0 ; k< graph.length ; k++){
                System.out.print(graph[j][k]+ " ");
            }
            System.out.println();
        }
    }
 
    
}
