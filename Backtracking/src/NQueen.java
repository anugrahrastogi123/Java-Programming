
public class NQueen {
	
	static int count = 0;

	public static void main(String[] args) {
		
		nQueen(new boolean[4][4], 0, 0, 0, 4, "");
	}
	
	public static void nQueen(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		
		// positive base case
		if(qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}
		
		// manually change the variables
		if(col == board.length) {
			row++;
			col = 0;
		}
		
		// negative base case
		if(row == board.length) {
			return;
		}
		
		// is it safe to place the queen
		if(isItSafeToPlaceTheQueen(board, row, col)) {
			board[row][col] = true;
			nQueen(board, row+1, 0, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
			board[row][col] = false;
		}
		
		// not place
		nQueen(board, row, col+1, qpsf, tq, ans);
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
