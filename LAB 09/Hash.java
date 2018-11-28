/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author 17101177
 */
public class Hash {
    public static Hashtable<String, String> table = new Hashtable<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 9;
        Scanner sc = new Scanner (System.in);
        while (i!=0){
            
            System.out.println("1 = Insert number\n2 = Find number\n3 = Delete number\n0 = exit\n");
            i = sc.nextInt();
            if(i == 1){
                System.out.println("Enter Name:");
                String n = sc.next();
                System.out.println("Enter Number:");
                String num = sc.next();
                hash.add(n,num);
            }
            
            if(i==2){
                System.out.println("Enter Name to search:");
                String n = sc.next();
                hash.search(n);
            }
            
            if(i==3){
                 System.out.println("Enter Name to Remove:");
                String n = sc.next();
                hash.remove(n);
            }
            
        }
       
    }
    
    public static class hash{
        public static void add(String x , String y){
        table.put(x, y);
        System.out.println("Number inserted successfully");
        }
        
        public static void remove (String x){
            if(table.get(x)!=null){
                table.remove(x);
                 System.out.println(x+ "'s Number deleted successfully");
            }
            else{
                System.out.println("Number Not Found");
            }
            
        }
        
        public static void search (String x){
            if(table.get(x)==null){
                System.out.println("Not Found");
            }
            else{
                System.out.println(x+"'s Number: " + table.get(x));
            }
        }
    
    }
}