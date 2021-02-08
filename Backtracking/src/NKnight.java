
public class NKnight {
	
	static int count = 0;

	public static void main(String[] args) {
		
		boolean[][] board = new boolean[3][3];
		nKnight(board, 0, 0, 0, board.length, "");
	}
	
	// kpsf -> knights placed so far
	// tk -> total knights
	public static void nKnight(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {
		
		// positive base case
		if(kpsf == tk) {
			System.out.println(++count + ". " + ans);
			return;
		}
		
		// manually change the variables
		if(col == board[0].length) {
			row++;
			col = 0;
		}
		
		// negative base case
		if(row == board.length) {
			return;
		}
		
		// is it safe to place the knights
		if(isItSafeToPlaceTheKnights(board, row, col)) {
			board[row][col] = true;
			nKnight(board, row, col+1, kpsf+1, tk, ans+"{"+row+"-"+col+"}");
			board[row][col] = false;
		}
		
		// not place
		nKnight(board, row, col+1, kpsf, tk, ans);
	}

	private static boolean isItSafeToPlaceTheKnights(boolean[][] board, int row, int col) {
		
		int[] rowArr = {-1, -2, -2, -1};
		int[] colArr = {2, 1, -1, -2};
		
		for(int i = 0; i < 4; i++) {
			int r = row + rowArr[i];
			int c = col + colArr[i];
			
			if(r >=0 && r < board.length && c >= 0 && c < board[0].length) {
				if(board[r][c]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
