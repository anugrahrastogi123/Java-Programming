import java.util.ArrayList;

public class GetMazePathDiagonal {

	public static void main(String[] args) {

		System.out.println(getMPD(0, 0, 2, 2));

	}

	public static ArrayList<String> getMPD(int currRow, int currCol, int endRow, int endCol) {

		if (currRow == endRow && currCol == endCol) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("\n");
			return br;
		}

		if (currRow > endRow || currCol > endCol) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<String>();

		ArrayList<String> rrh = getMPD(currRow, currCol + 1, endRow, endCol); // recursion result for horizontal
																				// movement
		for (String item : rrh) {
			mr.add("H" + item);
		}

		ArrayList<String> rrv = getMPD(currRow + 1, currCol, endRow, endCol); // recursion result for vertical movement
		for (String item : rrv) {
			mr.add("V" + item);
		}

		ArrayList<String> rrd = getMPD(currRow + 1, currCol + 1, endRow, endCol); // recursion result for diagonal
																					// movement
		for (String item : rrd) {
			mr.add("D" + item);
		}

		return mr;
	}

}
