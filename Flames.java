import java.util.Scanner;

public class Flames
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of person-1 without empty space");
        String name1=s.nextLine();
        name1=name1.toLowerCase();
        System.out.println("Enter name of person-2 without empty space");
        String name2=s.nextLine();
        name2=name2.toLowerCase();
        flames(name1,name2);
    }
    private static void flames(String name1,String name2) 
    {
        for(int i=0;i<name1.length();i++)
        {
            for(int j=0;j<name2.length();j++)
            {
                if(name1.charAt(i)==name2.charAt(j))
                {
                    name1=(i==0)?name1.substring(1,name1.length()) : name1.substring(0,i)+name1.substring(i+1,name1.length());
                    name2=(j==0)?name2.substring(1,name2.length()):name2.substring(0,j)+name2.substring(j+1,name2.length());
                }
            }
        }
        int unique=name1.length()+name2.length();
        switch (gameOf(unique)) {
            case "F":System.out.println("Friends..!");
                break;
            case "L":System.out.println("Loves..!");
                break;
            case "A":System.out.println("Affection..!");
                break;
            case "M":System.out.println("Marriage..!");
                break;
            case "E":System.out.println("Enemy..!");
                break;
            case "S":System.out.println("Sister..!");
                break;
        }

    }
    private static String gameOf(int unique) 
    {
        String game="FLAMES";
        if(unique==1) return "S";
        else
        {
            while(game.length()>1){
                if(unique%game.length()==0) game=game.substring(0,game.length()-1);
                //else if(game.length()==2) game=game.substring(1);
                else game=game.substring((unique%game.length()),game.length())+game.substring(0,(unique%game.length())-1);
                //System.out.println(game);
            }
            return game;
        }
        
    }
}