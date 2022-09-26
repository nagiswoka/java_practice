package Prep;

import java.util.Scanner;



// Output Format

/* 1     7
    2   6 
     3 5  
      4   
     5 3  
    6   2 
   7     1   */
public class DiagonalPattern {
    
    public static void main(String[] args) {
        diagonalPrint();
    }
    public static void diagonalPrint() {
        int n=(new Scanner(System.in)).nextInt();
        int m=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(i==j){
                        if(i<m)
                            System.out.print(i);
                        else
                            System.out.print(n-i+1);
                    }else if(i+j==n+1){
                        if(i<m)
                        System.out.print(j);
                        else
                            System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
               
            }
            System.out.println();
        }
    }
}
