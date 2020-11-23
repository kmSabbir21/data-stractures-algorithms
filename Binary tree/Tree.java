package com.tree;
import java.util.Scanner;
public class Tree {

    static Node createTree(){
    Node root =null;
    System.out.println("Enter data:");
    int data=sc.nextInt();
    if(data == -1) return null;
    root=new Node(data);
    
        System.out.println("Enter left data:"+data);
        root.left=createTree();
        
        System.out.println("Enter right data:"+data);
        root.right=createTree();
    
    return root;
        
    }
   static Scanner sc=null;
    public static void main(String[] args) {
    sc=new Scanner(System.in);
    createTree();
    }
    
}
