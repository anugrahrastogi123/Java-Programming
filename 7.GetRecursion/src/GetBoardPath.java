import java.util.ArrayList;

public class GetBoardPath {

	public static void main(String[] args) {
		
		System.out.println(getBP(0));

	}
	
	public static ArrayList<String> getBP(int currPos){
		
		if(currPos == 10) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		if(currPos > 10) {
			ArrayList<String> baseResult = new ArrayList<String>();
			return baseResult;
		}
		
		ArrayList<String> myResult = new ArrayList<String>();
		
		for(int i = 1; i < 7; i++) {
			ArrayList<String> recResult = getBP(currPos + i);
			for(String item: recResult) {
				myResult.add(i + item);
			}
		}
		
		return myResult;
	}

}
