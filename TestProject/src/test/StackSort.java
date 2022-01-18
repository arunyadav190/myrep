package test;

import java.util.ListIterator;
import java.util.Stack;

public class StackSort {
 
	static void stackSort(Stack<Integer> s) {
		if(!s.isEmpty()) {
		int temp=s.pop();
		stackSort(s);
		insertToStack(s, temp);
		}
		
	}
	
	static void insertToStack(Stack<Integer> s, int val) {
		if(s.isEmpty()||val>s.peek()) {
			s.push(val);
			return;
		}
		int temp=s.pop();
		insertToStack(s, val);
		s.push(temp);
	}
	static void printStack(Stack<Integer> s){
		
	ListIterator<Integer> it=s.listIterator();
	while(it.hasNext()) {
		it.next();
	}
	while(it.hasPrevious()) {
		System.out.println(it.previous()+" ");
	}
	}
	
	public static void main(String arg[]) {
		Stack<Integer> s= new Stack<>();
		s.push(11);
		s.push(2);
		s.push(32);
		s.push(3);
		s.push(41);
		s.push(121);
		stackSort(s);
		
		printStack(s);
		
	}
}
