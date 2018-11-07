/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 17101177
 */
public class Knapsack {
//    public static int value[] = {50000,100000,20000,30000,60000};
//    public static int weight[] = {3,1,3,3,2};
    
    public static int value[] = new int[5];
    public static int weight[] = new int[5];
   
    public static void main(String[] args){
        // TODO code application logic here
        
        File file = new File ("input.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Knapsack.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int i = 0;
        while(sc.hasNextInt()){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
            i++;
        }
        
        for(int j = 0 ; j<weight.length ; j++){
            System.out.println(weight[j]+"   "+value[j]);
        }
        
        knapsack(7);
        
    }
    
    public static void knapsack(int n){
        
        int[][] k = new int[weight.length+1][n+1];
        
        for(int i = 0 ; i <= n ; i++){
            k[0][i] = 0;
        }
        
        for(int i = 0 ; i <= weight.length ; i++){
            k[i][0] = 0;
        }
        
        for(int i = 1 ; i <= weight.length ; i++){
            for(int j = 1 ; j <= n ; j++){
                
                if(weight[i-1] > j){
                    k[i][j] = k[i-1][j];
                }
                else{
                    k[i][j] = Math.max((value[i-1] + k[i-1][j-weight[i-1]]) , k[i-1][j]);
                }
            }
        }
        
        System.out.println(k[weight.length][n]);
    }
    
}
