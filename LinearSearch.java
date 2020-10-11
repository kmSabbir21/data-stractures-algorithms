package com.search.algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5,3,6,1,4,2};
        int item = 4;
        int temp =0;
        for(int i=1;i<arr.length;i++){
        if(arr[i]==item){
            System.out.println("Data position index :"+i);
           temp = temp+1;
        }
        
    }
        if(temp==0){
            System.out.println("Data not present");
        }
    
  }

}
