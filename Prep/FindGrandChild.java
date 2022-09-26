package Prep;

public class FindGrandChild {
    public static void main(String[] args) {
        String[][] family={
            {"luke","shaw"},
            {"wayne","rooney"},
            {"rooney","ronaldo"},
            {"shaw","rooney"}
        };
        System.out.println(findChilds(family, "ronaldo"));
    }
    public static int findChilds (String[][] family,String name) {
        int count=0;
        for (int row = 0; row< family.length; row++) {
           if(family[row][1]==name){
                count+=findGrandChilds(family,family[row][0]);
           }
       }
       return count;
    }
    public static int findGrandChilds(String[][] family,String name) {
        int count=0;
        for (int i = 0; i < family.length; i++) {
            if (family[i][1]==name) {
                count++;
            }
        }
        return count;
    }
}
