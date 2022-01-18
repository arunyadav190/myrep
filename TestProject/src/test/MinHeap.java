package test;

public class MinHeap {
	final int MAX_HEAP=20;
	int[] heap;
	int cur_size;
	
	public MinHeap() {
		// TODO Auto-generated constructor stub
	heap =new int[MAX_HEAP];
	cur_size=0;
	}

	int getParent(int index) {
		return (index-1)/2;
	}
	
	int getLeftChild(int index) {
		return (index*2 +1);
	}
	int getRightChild(int index) {
		return (index*2 +2);
	}
	// insert in min heap
	
	// swap value of i and j index
	void swapIndexVal(int i, int j) {
	
		int temp = heap[i];
		heap[i]=heap[j];
		heap[j]=temp;	
	}
	
	
	// heapify at given root index
	void minHeapify(int index) {
		System.out.println("Min heapfy at"+index);
		int l=getLeftChild(index);
		int r=getRightChild(index);
         int smallest=index;
         if(heap[index]>heap[l]) {
        	 smallest=l;
        	 if(heap[r]<heap[smallest]) {
        		 smallest=r;
        	 }
         }
         
         if(index!=smallest) {
        swapIndexVal(index, smallest);	 
        minHeapify(smallest);
         }
		
		
	}
	// extract min
		int extractMin() {
			if(cur_size==1) {
				cur_size--;
				return heap[cur_size];
				}else {
				cur_size--;
				int index=0;
				int min=heap[0];
				heap[0]=heap[cur_size];
				minHeapify(0);
				return min;
				}
		}
	
	// insert in min heap
	void insertMinHeap(int val) {
	if(cur_size == MAX_HEAP)
		return;
	
	cur_size++;
	int index=cur_size-1;
	heap[index]=val;
	
	
	while(((heap[getParent(index)]>heap[index]) && index!=0 )) {
	swapIndexVal(index, getParent(index));
	index=getParent(index);
	}
	}
	
	void printArr() {
		
		for(int i=0;i <cur_size;i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		
	MinHeap obj=new MinHeap();
	obj.insertMinHeap(11);
	obj.insertMinHeap(3);
	obj.insertMinHeap(2);
	obj.insertMinHeap(1);
	obj.insertMinHeap(15);
	obj.insertMinHeap(5);
	obj.insertMinHeap(4);
	obj.insertMinHeap(45);
	obj.insertMinHeap(4);
	obj.printArr();
	obj.extractMin();
	obj.printArr();
	
	}
}
