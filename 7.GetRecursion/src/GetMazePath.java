import java.util.ArrayList;

public class GetMazePath {

	public static void main(String[] args) {
		
		System.out.println(getMP(0, 0, 2, 2));

	}
	
	public static ArrayList<String> getMP(int currRow, int currCol, int endRow, int endCol){
		
		if(currRow == endRow && currCol == endCol) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		
		if(currRow > endRow || currCol > endCol) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<String>();
		
		ArrayList<String> rrh = getMP(currRow, currCol+1, endRow, endCol); // recursion result for horizontal movement
		for(String item : rrh) {
			mr.add("H" + item);
		}
		
		ArrayList<String> rrv = getMP(currRow+1, currCol, endRow, endCol); // recursion result for vertical movement
		for(String item : rrv) {
			mr.add("V" + item);
		}
		
		return mr;
	}

}
