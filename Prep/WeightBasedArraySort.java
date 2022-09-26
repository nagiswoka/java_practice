package Prep;

import java.util.*;

public class WeightBasedArraySort {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
        }
        sortedByWeight(arr);
    }
    public static void sortedByWeight(int[] arr) {
        // weight rules 
        // 5 if item is perfect square
        // 4 if item is multiple of 4 and divided by 6
        // 3 if item is even
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!(hashMap.containsKey(arr[i]))&&arr[i]%Math.sqrt(arr[i])==0){
                hashMap.put(arr[i],5);
            }
            else if((hashMap.containsKey(arr[i]))&&arr[i]%Math.sqrt(arr[i])==0){
                int temp=hashMap.get(arr[i]);
                temp+=5;
                hashMap.put(arr[i],temp);   
            }
            else hashMap.put(arr[i],0);
            if(!(hashMap.containsKey(arr[i]))&&(arr[i]%4==0&&arr[i]%6==0)){
                hashMap.put(arr[i],4);
            }
            else if((hashMap.containsKey(arr[i]))&&arr[i]%4==0&&arr[i]%6==0){
                int temp=hashMap.get(arr[i]);
                temp+=4;
                hashMap.put(arr[i],temp);
            }
            else hashMap.put(arr[i],0);

            if(!(hashMap.containsKey(arr[i]))&&arr[i]%2==0){
                hashMap.put(arr[i],2);
            }
            else if((hashMap.containsKey(arr[i]))&&arr[i]%2==0){
                int temp=hashMap.get(arr[i]);
                temp+=2;
                hashMap.put(arr[i],temp);
            }
            else hashMap.put(arr[i],0);
        }
        List<Map.Entry<Integer,Integer>>list= new ArrayList<>(hashMap.entrySet());
        Collections.sort(
        list,
        (i1,
         i2) -> i1.getValue().compareTo(i2.getValue()));
        for(Map.Entry<Integer,Integer> entry:list){
            System.out.print("<"+entry.getKey()+","+entry.getValue()+">");
        }
    }
}
