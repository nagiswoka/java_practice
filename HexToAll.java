import java.util.*;


public class HexToAll
{
        private String input;

        public void setInput(String input)
        {
            this.input=input;
        }
        public void hexToOct(long decimal)
        {
            List<Integer> octal=new ArrayList<>();
            while(decimal>0)
            {
                int oct=(int)decimal%8;
                octal.add(oct);
                decimal=decimal/8;
            }
            Collections.reverse(octal);
            System.out.println("Octal equalent for the input:"+input);
            for (Integer integer : octal) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
        public long hexToDec()
        {
           long dec=0;
           String revString = "";
            for(int i = input.length()-1; i >= 0; i--) 
            {
                revString= revString + input.charAt(i);
            }
           for(int i=0;i<revString.length();i++)
           {
                switch(revString.charAt(i))
                {    
                    case 'A':
                        dec=(long)(dec+(10*(Math.pow(16,i))));
                        break;
                    case 'B':
                        dec=(long)(dec+(11*(Math.pow(16,i))));
                        break;
                    case 'C':
                        dec=(long)(dec+(12*(Math.pow(16,i))));
                        break;    
                    case 'D':
                        dec=(long)(dec+(13*(Math.pow(16,i))));
                        break;
                    case 'E':
                        dec=(long)(dec+(14*(Math.pow(16,i))));
                        break;
                    case 'F':
                        dec=(long)(dec+(15*(Math.pow(16,i))));
                        break;
                        /* case 0,1: */
                    case 1,2,3,4,5,6,7,8,9:
                        String temp=String.valueOf(revString.charAt(i));
                        dec=(long)(dec+(Integer.parseInt(temp)*(Math.pow(16,i))));
                        break;
                }
           }
           return dec;
        }
        public void hexToBin(long decimal)
        {
            List<Integer> binary=new ArrayList<>();
            while(decimal>0)
            {
                int c=(int)decimal%2;
                binary.add(c);
                decimal=decimal/2;
            }
            Collections.reverse(binary);
            System.out.println("Binary equalent for the input:"+input);
            for (Integer integer : binary) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
        void loadtext()
        {
            String text="~~~~~~~~~~~~~~~YoUr InPuT Is BeInG PrOcEsSeD~~~~~~~~~~~~~~!!!!!!WaIt FoR FeW SeCoNdS~~~~~~~~~~~~~~~~~~!!!!";
            for (int loop=0;loop<text.length();loop++) 
            {
                System.out.print(text.charAt(loop));
                try {
                    Thread.sleep(175);
                } catch (Exception e) {
                    System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                } 
            }
        }
        public static void main(String[] args) 
        {
            HexToAll hta=new HexToAll();
            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the Number to convert:");
            String input=sc.nextLine();
            long decimal=0;
            hta.setInput(input);
            System.out.println("---------------------------------------------CONVERT SECTION----------------------------------------------");
            System.out.println("\n1)HEX TO DECIMAL \n2)HEX TO BINARY \n3)HEX TO OCTAL \n4)HEX TO ALL \n5)EXIT");
            System.out.println("ENTER THE APPROPRIATE CHOICE:");
            byte choice=sc.nextByte();
            switch(choice)
            {
                case 1:
                    hta.loadtext();
                    System.out.println("\nDecimal equalent for the input"+input);
                    try {
                        Thread.sleep(175);
                    } catch (Exception e) {
                        System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                    } 
                    decimal=hta.hexToDec();
                    System.out.println(decimal);
                    break;
                case 2:
                    hta.loadtext();
                    try {
                        Thread.sleep(175);
                    } catch (Exception e) {
                        System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                    } 
                    decimal=hta.hexToDec();
                    hta.hexToBin(decimal);
                    break;
                case 3:
                    hta.loadtext();
                    try {
                        Thread.sleep(175);
                    } catch (Exception e) {
                        System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                    } 
                    decimal=hta.hexToDec();
                    hta.hexToOct(decimal); 
                    break;
                case 4:
                    hta.loadtext();
                    System.out.println("\nDecimal equalent for the input"+input);
                    try {
                        Thread.sleep(175);
                    } catch (Exception e) {
                        System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                    } 
                    decimal=hta.hexToDec();
                    System.out.println(decimal);
                    try {
                        Thread.sleep(175);
                    } catch (Exception e) {
                        System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                    } 
                    hta.hexToBin(decimal);
                    try {
                        Thread.sleep(175);
                    } catch (Exception e) {
                        System.out.println("SHINUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!!!!!");
                    } 
                    hta.hexToOct(decimal); 
                break;
                default:
                    System.out.println("\nArigato Gosaimasu....Just Shinu...!");
                break;
            }  
        }
}
