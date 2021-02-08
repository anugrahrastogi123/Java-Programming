
public class QueenCombination2D {

	public static void main(String[] args) {
		
		//queenCombinationBoxRespect(new boolean[2][2], 0, 0, 0, 2, "");
		queenCombinationBoxRespectRecCall(new boolean[2][2], 0, 0, 0, 2, "");

	}
	
	public static void queenCombinationBoxRespect(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		
		// positive base case
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		// manually change variables
		if(col == board[0].length) {
			row++;
			col = 0;
		}
		
		// negative base case
		if(row == board.length) {
			return;
		}
		
		// place
		board[row][col] = true;
		queenCombinationBoxRespect(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
		board[row][col] = false;
		
		// not place
		queenCombinationBoxRespect(board, row, col+1, qpsf, tq, ans);
	}
	
	public static void queenCombinationBoxRespectRecCall(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		
		// positive base case
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		// changing variables using Extra Recursive Call
		if(col == board[0].length) {
			queenCombinationBoxRespectRecCall(board, row+1, 0, qpsf, tq, ans);
			return;
		}
		
		// negative base case
		if(row == board.length) {
			return;
		}
		
		// place
		board[row][col] = true;
		queenCombinationBoxRespectRecCall(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
		board[row][col] = false;
		
		// not place
		queenCombinationBoxRespectRecCall(board, row, col+1, qpsf, tq, ans);
	}

}
