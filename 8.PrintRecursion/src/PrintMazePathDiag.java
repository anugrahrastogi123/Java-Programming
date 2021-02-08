
public class PrintMazePathDiag {

	public static void main(String[] args) {
		
		printMPD(0, 0, 2, 2, "");

	}

	public static void printMPD(int row, int col, int endRow, int endCol, String ans) {

		if (row == endRow && col == endCol) {
			System.out.println(ans);
			return;
		}

		if (row > endRow || col > endCol) {
			return;
		}

		printMPD(row, col + 1, endRow, endCol, ans + "H");
		printMPD(row + 1, col, endRow, endCol, ans + "V");
		printMPD(row + 1, col + 1, endRow, endCol, ans + "D");
	}

}
