package test;

public class RatMaze {

	static int countPath(int[][] maze) {
		
		if(maze[0][0]==-1)
			return 0;
		// for first row
		for (int i=0;i<maze.length;i++) {
			if(maze[0][i]==0)
				maze[0][i]=1;
			else
				break;
		}
		//  for first column
		for (int i=1;i<maze.length;i++) {
			if(maze[i][0]==0)
				maze[i][0]=1;
			else
				break;
		}
		
		printArr(maze);
		
		for(int i=1;i<maze.length;i++){
			for(int j=1;j<maze.length;j++){
				if(maze[i][j]==-1)
					continue;
				
				if(maze[i-1][j]>0) {
					maze[i][j]=maze[i][j]+maze[i-1][j];
				}
					
				if(maze[i][j-1]>0) {
					maze[i][j]=maze[i][j]+maze[i][j-1];	
					}
				
			}
		}
		
		printArr(maze);
		
		if(maze[maze.length-1][maze.length-1]>0)
		return	maze[maze.length-1][maze.length-1];
		else
			return 0;
				
	}
	
	static void printArr(int[][] maze) {
		for(int i=0;i<maze.length;i++){
			System.out.print("\n");
			for(int j=0;j<maze.length;j++){
				System.out.print(maze[i][j]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int maze[][] = {{0, 0, 0, 0},
                {0, -1, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, 0, 0}};
	    
	    System.out.println("Counted Path:"+countPath(maze));
	}

}
