
public class CountMazePathDiag {

	public static void main(String[] args) {
		
		System.out.println(countMPD(0, 0, 2, 2));

	}

	public static int countMPD(int row, int col, int endRow, int endCol) {

		if (row == endRow && col == endCol) {
			return 1;
		}

		if (row > endRow || col > endCol) {
			return 0;
		}

		int ch = countMPD(row, col + 1, endRow, endCol);
		int cv = countMPD(row + 1, col, endRow, endCol);
		int cd = countMPD(row + 1, col + 1, endRow, endCol);

		return ch + cv + cd;
	}

}
