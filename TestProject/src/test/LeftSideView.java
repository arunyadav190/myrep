package test;

import java.util.ArrayList;
import java.util.Stack;

public class LeftSideView {
	
	  // Binary tree node
    private static class Node {
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    
	static int depth=0;
	static   Stack<Integer> sk=new Stack<>();
    
    static   ArrayList<Integer>  funclist(Node root,ArrayList<Integer> arr, int dep){
         
      if(root==null)
       return arr;
     
      if(depth<dep){
          arr.add(root.data);
          depth=dep;
          sk.push(root.data);
      }
      funclist(root.left,arr,dep+1);
      funclist(root.right,arr,dep+1);
      
      return arr;
      
     }
    
    
    //Function to return list containing elements of left view of binary tree.
   
     static   ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> arr=new ArrayList<>();
      funclist(root,arr, 1);
      while(!sk.isEmpty())
      {
    	  int temp=sk.pop();
      arr.add(temp);
      System.out.println(temp);
      
      }
      
    return  arr;
      
    }
    
    public static void main(String[] args)
    {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        leftView(root);
    }
    
}
