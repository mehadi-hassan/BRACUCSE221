/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 17101177
 */
public class LCS {
    public static int[][] c;
    public static int[][] b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a = "ABEJ";
        String b = "AJBCE";
        
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        
        lcs_length(x,y);
        lcs_seq(x,y);
    }
    
    public static void lcs_length(char[] x , char[] y){
        
        int m = x.length+1;
        int n = y.length+1;

        c = new int[m][n];
        b = new int[m][n];

        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(x[i-1] == y[j-1]){
                    c[i][j] = c[i-1][j-1] + 1;
                    
                    b[i][j] = 1;
                }
                
                else if (c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = 2;
                }
                
                else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = 3;
                }
            }
        }
        
        System.out.println("Length of Longest Subsequence: "+ c[m-1][n-1]);
    }
    
    public static void lcs_seq(char[] x , char[] y){
        String s = "";
        for(int i = x.length ; i>=0 ; i--){
            for(int j = y.length ; j >= 0 ; j--){
                if(b[i][j] == 1){
                   s+=x[i-1];
                   i--;
                   j--;
                }
                else if(b[i][j] == 2){
                   j--;
                }
                else if (b[i][j] == 3){
                    i--;
                }
            }
        }
        System.out.print("Longest Common Subsequence: ");
        for(int i = s.length()-1 ; i>=0 ; i--){
            System.out.print(s.charAt(i));
        }
        
        System.out.println();

    }
    
}
