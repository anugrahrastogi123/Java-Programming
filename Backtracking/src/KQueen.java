
// Place k queens on a NxN chess board such that no 2 queens kills each other. 

public class KQueen {
	
	static int count = 0;

	public static void main(String[] args) {
		
		kQueen(new boolean[4][4], 0, 0, 3, "");
	}
	
	public static void kQueen(boolean[][] board, int row, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}
		
		if(row == board.length) {
			return;
		}
		
		// options : columns
		for(int col = 0; col < board[0].length; col++) {
			
			if(isItSafeToPlaceTheQueen(board, row, col)) {
				board[row][col] = true;
				kQueen(board, row+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
				board[row][col] = false;
			}
		}
		
		// not place
		kQueen(board, row+1, qpsf, tq, ans);
	}
	
	private static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
		
		// vertically upward
				int r = row - 1;
				int c = col;
				while(r >= 0) {
					if(board[r][c]) {
						return false;
					}
					r--;
				}
				
				// left
				r = row;
				c = col - 1;
				while(c >= 0) {
					if(board[r][c]) {
						return false;
					}
					c--;
				}
				
				// upper left diagonal
				r = row - 1;
				c = col - 1;
				while(r >= 0 && c >= 0) {
					if(board[r][c]) {
						return false;
					}
					r--;
					c--;
				}
				
				// upper right diagonal
				r = row - 1;
				c = col + 1;
				while(r >= 0 && c < board.length) {
					if(board[r][c]) {
						return false;
					}
					r--;
					c++;
				}
				
				return true;
	}

}
