package com.search.algorithm;

public class BinarySearch {
    
  public static void main(String[] args) {
      
    int [] a = {2,3,5,7,9,11,15,17,19,23,25,26};
    int search  = 27;
    int li =0;
    int hi = a.length-1;
    int mi =(li+hi)/2;
       while(li<=hi){ 
        if(a[mi]==search){
            System.out.println("Element is "+mi+" position");
            break;
        }
        else if(a[mi]<search){
            li = mi+1;
        }else{
        hi = mi-1;
        
        }
        mi = (li+hi)/2;
       }
       if(li>hi){
           System.out.println("Item not found");
       }
        
    }
    
}
