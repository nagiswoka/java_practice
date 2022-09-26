package Prep;

public class MatrixOnion {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{14,15,16,17,6},{13,20,19,18,7},{12,11,10,9,8}};
        onionPeeling(arr);
    }
    public static void onionPeeling(int arr[][]) {
        int row_st=0,row_end=arr.length,col_st=0,col_end=arr[0].length;
        while(row_st < row_end && col_st < col_end){
            for(int j = col_st;j < col_end;j++) System.out.print(arr[row_st][j]+" ");
            row_st++;
            for(int j = row_st;j < row_end;j++) System.out.print(arr[j][col_end-1]+" ");
            col_end--;
            for (int j = col_end-1; j >= col_st ; j--) System.out.print(arr[row_end-1][j]+" ");
            row_end--;
            for(int j = row_end-1;j >= row_st;j--) System.out.print(arr[j][col_st]+" ");
            col_st++;
        }
    }
}
