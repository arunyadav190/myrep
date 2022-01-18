package test;

public class LongestSequence {
	   static int longestArray( int a[])
	    {
	        // code here
	         int max=0,curmax=1;
	       for(int i=1;i<a.length;i++){
	           if(a[i]>a[i-1])
	           {
	               curmax++;
	           }else{
	               curmax=1;
	           }
	           
	           if(curmax>max)
	           max=curmax;
	           
	           System.out.println(i+" "+curmax);
	       }
	       return max;
	    
	    }
	   
	   static int longestSubsequence( int a[])
	    {int [] lis=new int[a.length];
	     for(int i=0;i<a.length;i++)
	    	 lis[i]=1;
	     for(int i=0;i<a.length;i++) {
	    	 for(int j=0;j<i;j++) {
	    		 if(a[i]>a[j]&& lis[i]<lis[j]+1) {
	    			 lis[i]=lis[j]+1;
	    		 }
	    	 }
	     }
	     
	     int max=lis[0];
	     for(int i=0;i<a.length;i++)
	    	max=Math.max(max, lis[i]);
	     
	    
	    return max;
		   
	    }
	   
	   public static void main(String args[]) {
		  int A[]={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		  System.out.println(longestSubsequence(A));
	   }

}
