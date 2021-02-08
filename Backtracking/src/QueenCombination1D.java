
public class QueenCombination1D {

	static int count = 0;
	public static void main(String[] args) {
		
		QueenCombination(new boolean[4], 0, 2, "", -1);
	}
	
	public static void QueenCombination(boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {
		// qpsf -> queen places so far
		// tq -> total queens
		if(qpsf == tq) {
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		for(int i = lastBoxUsed + 1; i < boxes.length; i++) {
			
				boxes[i] = true;
				QueenCombination(boxes, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ", i);
				boxes[i] = false;
					
		}
		
	}

}
