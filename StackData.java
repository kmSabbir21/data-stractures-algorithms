package com.search.algorithm;

import java.util.Stack;

public class StackData {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("Sabbir");
        stack.add("Sumon");
        stack.add("Ashik");
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.push("ABC Khan"));
        System.out.println(stack);
        
        System.out.println(stack.empty());
        System.out.println(stack.get(1));
        
    }
    
}
