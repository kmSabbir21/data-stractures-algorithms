package com.search.algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int min,temp =0;
        int [] a ={23,2,67,45,24,76,53,34};
        for(int i= 0;i<a.length;i++){
         min=i;
         for(int j=i+1;j<a.length;j++){
         
          if(a[j]<a[min]){
           min=j;
          }
         }
         temp=a[i];
         a[i] = a[min];
         a[min]=temp;
        
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
 
}
