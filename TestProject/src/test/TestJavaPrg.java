package test;

class BSTNode{
	int data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int d){
		data= d;
		left=null;
		right= null;
	}
}

public class TestJavaPrg {
	
	public BSTNode insertNodeBST(BSTNode root, int key) {
		BSTNode node=new BSTNode(key);
		if(root==null) {
			return node;
		}
		BSTNode curr=root;
	
		if(curr.data > key) {
			// on left side
			curr.left=  insertNodeBST(curr.left, key);
		}else if (curr.data < key) {
			curr.right=  insertNodeBST(curr.right, key);	
		}
		
		return root;
	}
	
	// inorder print
	public void printBST(BSTNode root) {
		
		if(root.left!=null) {
			printBST(root.left);
		}
		System.out.println(" "+root.data);
		if(root.right!=null) {
			printBST(root.right);
		}
		
		
	}
	
   public BSTNode searchKey(BSTNode root, int key) {
	 
	  if(root==null || root.data==key) {
			System.out.println("Key found ");
			return root;
		}
		if(root.data>=key) {
			return searchKey(root.left, key);
		}
		return searchKey(root.right, key);
		
	
	}
	
   public BSTNode deleteNode(BSTNode root, int key) {
	   
	   if(root==null) {
		   return root;
	   }
	   
	   if(root.data==key) {
		  
		   // only one child or no child
		   if(root.right==null) {
			   System.out.println("Root right is null "+root.data);
			   return root.left;
		   }else if(root.left==null)
		   {   System.out.println("Root left is null "+root.data);
			   return root.right;
		   }
		   
		   System.out.println("Having both childs ");
			   BSTNode minNode=minValue(root.right);
			   root.data=minNode.data;
			   System.out.println("Deleting  value"+root.data);
		       deleteNode(root.right, minNode.data);
			  
	   }else if(root.data<key){
		   root.right=deleteNode(root.right, key);
		   System.out.println("Right Tree");
	   }else {
		   root.left=deleteNode(root.left, key);
		   System.out.println("left Tree");
	   }
	   return root;
	   
	 
   }
   
   public BSTNode minValue(BSTNode node) {
	   
	   
	   if(node.left==null || node==null) {
		   return node;
	   }else {
	   return   minValue(node.left);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTNode root =null;
		TestJavaPrg obj=new TestJavaPrg();
		root = obj.insertNodeBST(root,50);
		root = obj.insertNodeBST(root,30);
		root = obj.insertNodeBST(root,20);
		root = obj.insertNodeBST(root,40);
		root = obj.insertNodeBST(root,70);
		root = obj.insertNodeBST(root,60);
		root = obj.insertNodeBST(root,80);
		obj.printBST(root);
		//BSTNode res=obj.searchKey(root, 21);
		//System.out.println("Result "+ res);
		System.out.println("--++");
		root=obj.deleteNode(root, 50);
		System.out.println("-----");
		obj.printBST(root);
		System.out.println("---------------------------------------");
		//BSTNode inOr =obj.minValue(root.left);
		//System.out.println("-----"+inOr.data);
	}
}
