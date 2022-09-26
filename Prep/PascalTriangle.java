package Prep;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        pascalTriangle();
    }
    public static void pascalTriangle() {
        int n=(new Scanner(System.in)).nextInt(),c=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                if(j==0) c=1;
                else c=c*(i-j+1)/j; 
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
