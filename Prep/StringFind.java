package Prep;

import java.sql.Array;
import java.util.Arrays;

public class StringFind {
    
    boolean isVisited[][];
    int boundry[][]=new int[2][2];
    public static void main(String[] args) {
        StringFind stringFind=new StringFind();
        String sen="WELCOMETOZOHOCORPORATION";
        sen=sen.toLowerCase();
        char[][] arr=new char[5][5];
        int length=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(length<sen.length()){
                    arr[i][j]=sen.charAt(length++);
                }
            }
        }
        String word="coc";
        System.out.println(Arrays.deepToString(stringFind.isFound(arr, word)));
    }

    public int[][] isFound(char[][] arr,String word){
        int row=arr.length;
        int column=arr[0].length;
       
        isVisited=new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(word.charAt(0)==arr[i][j]&&searchWord(i,j,0,word,arr)){       
                    boundry[0][0]=i;
                    boundry[0][1]=j;
                }
            }
        }
        return boundry;
    }
    public  boolean searchWord(int row,int column,int index,String word,char[][] arr) {

        if(index==word.length()){ 
            boundry[1][0]=row-1;
            boundry[1][1]=column;
            return true;
        }
        if(row<0||row>=arr.length||column<0||column>=arr[0].length||word.charAt(index)!=arr[row][column]){
            return false;
        }
        isVisited[row][column]=true;
        if(searchWord(row+1,column,index+1,word,arr)||searchWord(row, column+1, index+1, word, arr)){
            return true;
        }
        isVisited[row][column]=false;
        return false;
    }
}
