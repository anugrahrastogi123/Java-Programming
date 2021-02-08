// another way of solving the N Queen Problem
public class NQueen2 {
	
	static int count = 0;

	public static void main(String[] args) {
		
		nQueen(new boolean[4][4], 0, 0, 4, "");
	}
	
	public static void nQueen(boolean[][] board, int row, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}
		
		if(row == board.length) {
			return;
		}
		
		for(int col = 0; col < board[0].length; col++) {
			
			if(isItSafeToPlaceTheQueen(board, row, col)) {
				board[row][col] = true;
				nQueen(board, row+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
				board[row][col] = false;
			}
		}
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
