package com.search.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QSearch {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Abc");
        q.add("bbc");
        q.add("ccb");
        System.out.println( q.poll()); //Take a eliment from list
        System.out.println( q.peek()); //Peek element
        
        System.out.println(q.contains("Abc"));//True
        System.out.println(q.contains("XYZ"));//False
       
        System.out.println(q);//The element of q
        System.out.println(q.size());//The size of q
    }
    
}
