import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class DecToAll
{
    private String input;
    public void decToBin() 
    {
        List<Integer> binary=new ArrayList<>();
        int a;
        a=Integer.parseInt(input);
        while(a>0)
        {
            int c=a%2;
            binary.add(c);
            a=a/2;
        }
        Collections.reverse(binary);
        System.out.println("Binary equalent for the input:"+input);
        for (Integer integer : binary) {
            System.out.print(integer+" ");
        }
        System.out.println();    
    }
    public void decToOct()
    {
        List<Integer> octal=new ArrayList<>();
        int a;
        a=Integer.parseInt(input);
        while(a>0)
        {
            int c=a%8;
            octal.add(c);
            a=a/8;
        }
        Collections.reverse(octal);
        System.out.println("Octal equalent for the input:"+input);
        for (Integer integer : octal) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
    public void decToHex()
    {
        List    hex=new ArrayList<>();
        double a;
        a=Double.parseDouble(input);
        while(a>1)
        {
            a=a/16;
            int n=(int)a;
            double point=a-n;
            point*=16;
            if((int)point>9)
            {
                switch ((int)point) 
                {
                    case 10:
                        hex.add("A");
                        break;
                    case 11:
                        hex.add("B");
                        break;
                    case 12:
                        hex.add("C");
                        break;
                    case 13:
                        hex.add("D");
                        break;
                    case 14:
                        hex.add("E");
                        break;
                    case 15:
                        hex.add("F");
                        break;
                }
            }
            else
            {
                hex.add((int)point);
            }
            point=0;
        }   
        Collections.reverse(hex);
        System.out.println("Hexadecimal equalent for the input:"+input);
        for (Object object : hex) 
        {
            System.out.print(object+" ");    
        }
        System.out.println();
    }
    public void getInput(String input)
    {
        this.input=input;
    }
    public static void main(String[] args) 
    {
        DecToAll decToBin=new DecToAll();
        Scanner n=new Scanner(System.in);
        System.out.println("Enter decimal number to convert:");
        String input=n.nextLine();
        decToBin.getInput(input);
        System.out.println("----------------------------------------------ENTER THE OPTION--------------------------------------------");
        System.out.println("\n1)DECIMAL TO BINARY\n2)DECIMAL TO OCTAL\n3)DECIMAL TO HEX\n4)DECIMAL TO ALL\n5)EXIT");
        int opt=n.nextInt();
        switch(opt)
        {
            case 1:
            decToBin.decToBin();
            break;
            case 2:
            decToBin.decToOct();
            break;
            case 3:
            decToBin.decToHex(); 
            break;
            case 4:
            decToBin.decToBin();
            decToBin.decToOct();
            decToBin.decToHex();    
            break;
            default:
            break;
        }  
        n.close();
    }
}