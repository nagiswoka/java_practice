package Prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DecimalBinaryConv {
    
    public static void binToDec() {
       
        char arr[]=(new Scanner(System.in)).nextLine().toCharArray();
        int i=arr.length-1;
        int dec=Integer.parseInt(Character.toString(arr[i--]));
        while(i>=0){
            dec+=(Integer.parseInt(Character.toString(arr[i--]))*2<<(arr.length-(i+3)));
        }
        System.out.println(dec);
    }

    public static void decToBin() 
    {
        List<Integer> binary=new ArrayList<>();
        int a;
        a=Integer.parseInt((new Scanner(System.in)).nextLine());
        while(a>0)
        {
            int c=a%2;
            binary.add(c);
            a=a/2;
        }
        Collections.reverse(binary);
        System.out.println("Binary equalent for the input:");
        for (Integer integer : binary) {
            System.out.print(integer+" ");
        }
        System.out.println();    
    }
    public static void main(String[] args) {
        binToDec();
    }
}
