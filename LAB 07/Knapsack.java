/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author 17101177
 */
public class Knapsack {
    
    public static int value[] = new int[5];
    public static int weight[] = new int[5];
    public static String items[] = {"Laptop", "Phone", "Speaker","Necklace","Watch"};
   
    public static void main(String[] args){
        
        File file = new File ("input.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        
        int i = 0;
        while(sc.hasNextInt()){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
            i++;
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
        
        System.out.println("Item(s) Picked:");
        int i = items.length-1;
        int j = n;

        while(i > 0 && j > 0){
        	if(k[i][j] == k[i-1][j]){
        		i--;
        	}
        	else{
        		System.out.println(items[i]);
        		i--;
        		j-=weight[i];
        	}
        }

        System.out.println("Total Value: "+k[weight.length][n]);


    }
    
}
