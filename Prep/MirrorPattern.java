package Prep;

import java.util.Scanner;

public class MirrorPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,l=1;
        n=s.nextInt();
        int n1=n*2-1;
        for (int i = 1; i <=n1; i++) {
            for (int j=1;j<l;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=Math.abs(n-i)+1;k++){
                System.out.print("* ");
            }
            if(i>=n){
                l--;
           }else if (i<n){
                l++;
           }
            System.out.println();
        }
    }
}
