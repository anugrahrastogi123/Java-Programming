
public class CountMazePath {

	public static void main(String[] args) {
		
		System.out.println(countMP(0 ,0 ,2, 2));

	}

	public static int countMP(int row, int col, int endRow, int endCol) {

		if (row == endRow && col == endCol) {
			return 1;
		}

		if (row > endRow || col > endCol) {
			return 0;
		}
		
		int ch = countMP(row, col + 1, endRow, endCol); // count of horizontal move
		int cv = countMP(row + 1, col, endRow, endCol); // count of vertical move
		
		return ch + cv;
	}

}
