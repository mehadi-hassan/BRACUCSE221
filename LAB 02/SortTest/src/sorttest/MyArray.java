/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorttest;

import java.util.Arrays;

/**
 * @author 17101177
 */
public class MyArray {
    
    
    public static int[] insertionSort(int[] a){
      
        for(int j = 1 ; j < a.length ; j++){
            int key = a[j];
            int i = j -1;
            
            while(i > 0 && a[i] > key){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        
        return  a;
    }
    
    public static int[] mergeSort(int[] a){
        
       if(a.length == 1){
       return a;
       }
       
       else{
           int mid = a.length/2;
           int a1[] = mergeSort(split(a , 0, mid));
           int a2[] = mergeSort(split(a , mid , a.length));
           int a3[] = merge(a1, a2);
           return a3;
       }
    }
    
    public static int[] split(int a[] , int start, int end){
        int temp[] = new int[end-start];
        System.arraycopy(a, start, temp, 0, (temp.length));
        return temp;
    }

    
    public static int[] merge(int[] a1 , int[] a2){
        int[] c = new int [a1.length+a2.length];
        int i = 0 , j = 0 , k = 0;
        
        while (i < a1.length && j < a2.length){
            if(a1[i] <= a2[j]){
                c[k] = a1[i];
                i++;
            }
            else{
                c[k] = a2[j];
                j++;
            }
            k++;
        }
        
        while(i < a1.length){
            c[k] = a1[i];
            i++;
            k++;
        }
        
        while(j < a2.length){
            c[k] = a2[j];
            j++;
            k++;
        }
        return c;
    }
    
    public static int[] quickSort(int[] a){
      return  null;
    }
    
    
    
    
    
    
    
    
    
    
    public static void toMyString(int[] a){
       for(int i = 0 ; i < a.length-1 ; i++){
           System.out.print(a[i]+", ");
       }
       System.out.println(a[a.length-1]);
    }
    
    
}
