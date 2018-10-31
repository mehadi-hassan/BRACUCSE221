/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 17101177
 */
public class Dijkstra {
public static int[][] graph = new int[14][14];
    public static int[] parent = new int[14];
    public static int[] distance = new int[14];
    public static boolean[] check = new boolean[6];
    public static String[] city = {"Motijheel" , "A" , "B" , "C" , "D", "E" , 
                                    "F" , "G" , "H" , "I" , "J" , "K" , "L" , "MOGHBAZAR" };
    
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File ("input.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
        }
        
        catch(IOException e){
            System.out.println("File not found");
        }
        
        while(sc.hasNext()){
            String a = sc.next();
            int p = 0;
            for(int i = 0 ; i < city.length ; i++){
               if(a.equals(city[i])){
                   p = i;
               }
            }
            
            a = sc.next();
            int q = 0;
            for(int i = 0 ; i < graph.length ; i++){
               if(a.equals(city[i])){
                   q = i;
               }
            }
            graph[p][q] = sc.nextInt();
        }
        
    //dij(graph , "Motijheel" , "MOGHBAZAR");
    System.out.println(graph[6][13]);
    }
    
    
    public static void dij(int[][] graph , String s , String e){
        int start = 0  , end;
        for (int i = 0 ; i < graph.length ; i++){
            distance[i] = 5000;
            parent[i] = -1;
            check[i] = false;
        }
        
        for(int i = 0 ; i <city.length ; i++){
            if(s.equals(city[i])){
                start = i;
            }
        }
        
        for(int i = 0 ; i <city.length ; i++){
            if(e.equals(city[i])){
                end = i;
            }
        }
        
        
        
        
    }
}
