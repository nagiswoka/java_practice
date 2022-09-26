package Prep;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddLettPattern {
    public static void main(String[] args) {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try{
            String word=bufferedReader.readLine();
            int i=0;
            for (;i<word.length();i++) {
                for (int j=0;j<word.length(); j++) {
                    if(i==j){                               //we need to print in these format
                        System.out.print(word.charAt(i));
                    }
                    if(i+j==word.length()-1&&i!=j){
                        System.out.print(word.charAt(word.length()-i-1));//to print in reverse order 
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }catch(Exception e) {System.out.println(e);}
        
    }
}
