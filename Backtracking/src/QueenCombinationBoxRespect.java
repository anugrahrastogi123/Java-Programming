
public class QueenCombinationBoxRespect {

	public static void main(String[] args) {
		
		QueenCombination(new boolean[4], 0, 0, 2, "");

	}
	
	// box -> ith box in the given board 
	public static void QueenCombination(boolean[] board, int box, int qpsf, int tq, String ans) {
		// base case
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		// negative base case
		if(box == board.length) {
			return;
		}
		
		
		// place
		board[box] = true;
		QueenCombination(board, box+1, qpsf+1, tq, ans+"b"+box);
		board[box] = false;
		
		// not place
		QueenCombination(board, box+1, qpsf, tq, ans);
	}

}
