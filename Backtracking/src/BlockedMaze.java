
public class BlockedMaze {

	public static void main(String[] args) {
		
		int[][] maze = {{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
		// 1 -> blocked
		// 0 -> not blocked
		blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
	}
	
	public static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {
		
		// positive base case
		if(row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(ans);
			return;
		}
		
		// negative base case
		if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || 
				maze[row][col] == 1 || visited[row][col]) {
			return;
		}
		
		visited[row][col] = true;
		
		// Top
		blockedMaze(maze, row-1, col, ans+"T", visited);
		
		// Down
		blockedMaze(maze, row+1, col, ans+"D", visited);
		
		// Left
		blockedMaze(maze, row, col-1, ans+"L", visited);
		
		// Right
		blockedMaze(maze, row, col+1, ans+"R", visited);
		
		visited[row][col] = false;
	}

}
