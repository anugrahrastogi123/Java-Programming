
public class PrintMazePath {

	public static void main(String[] args) {
		
		printMP(0, 0, 2, 2, "");

	}
	
	public static void printMP(int row, int col, int endRow, int endCol, String ans) {
		
		if(row == endRow && col == endCol) {
			System.out.println(ans);
			return;
		}
		
		if(row > endRow || col > endCol) {
			return;
		}
		
		printMP(row, col + 1, endRow, endCol, ans + "H");
		printMP(row + 1, col, endRow, endCol, ans + "V");
	}

}
