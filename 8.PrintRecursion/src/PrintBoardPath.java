
public class PrintBoardPath {

	public static void main(String[] args) {
		
		printBP(0, "");

	}
	
	public static void printBP(int currPos, String ans) {
		
		if(currPos == 10) {
			System.out.println(ans);
			return;
		}
		
		if(currPos > 10) {
			return;
		}
		
		for(int i = 1; i < 7; i++) {
			
			printBP(currPos + i, ans + i);
		}
	}

}
