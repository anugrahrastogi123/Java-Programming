
public class CountBoardPath {

	public static void main(String[] args) {
		
		System.out.println(countBP(0, 10));

	}
	
	public static int countBP(int currPos, int end) {
		
		if(currPos == end) {
			return 1;
		}
		
		if(currPos > end) {
			return 0;
		}
		
		int count = 0;
		
		for(int i = 1; i < 7; i++) {
			count += countBP(currPos + i, end);
		}
		
		return count;
	}

}
