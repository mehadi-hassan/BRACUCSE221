/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorttest;
import java.util.Arrays;

/**
 *
 * @author 17101177
 */
public class SortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int array[] = {3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
        
        //Task 1
        System.out.println("Task 1: Built in Sort");
        int[] temp = array;
        int timeStart = (int) ((System.currentTimeMillis()));
        Arrays.sort(temp);
        MyArray.toMyString(temp);
        int timeEnd  = (int) ((System.currentTimeMillis())) - timeStart;
        System.out.println("Time required: " + timeEnd + " ms\n");
        
        //Task 2
        System.out.println("Task 2: Insertion Sort");
        timeStart = (int) ((System.currentTimeMillis()));
        temp = MyArray.insertionSort(array);
        timeEnd  = (int) ((System.currentTimeMillis())) - timeStart;
        MyArray.toMyString(temp);
        System.out.println("Time required: " + timeEnd + " ms\n");
        
        
        //Task 3
        System.out.println("Task 3: Merge Sort");
        timeStart = (int) ((System.currentTimeMillis()));
        temp = MyArray.mergeSort(array);
        timeEnd  = (int) ((System.currentTimeMillis())) - timeStart;
        MyArray.toMyString(temp);
        System.out.println("Time required: " + timeEnd + " ms\n");
        
        
        //Task 4
        System.out.println("Task 4: Quick Sort");
        timeStart = (int) ((System.currentTimeMillis()));
        temp = MyArray.quickSort(array);
        timeEnd  = (int) ((System.currentTimeMillis())) - timeStart;
        MyArray.toMyString(temp);
        System.out.println("Time required: " + timeEnd + " ms\n");
        
        
        
        
        
        
        
    }
    
}
