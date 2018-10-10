
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17101177
 */
public class Task1 {
    public static void main (String [] args){
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
        }
        
        DFS dfs = new DFS();
        dfs.dfs(matrixUndirected);
        dfs.print();
    }
}
