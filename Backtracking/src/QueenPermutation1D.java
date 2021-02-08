
public class QueenPermutation1D {

	static int count = 0;
	public static void main(String[] args) {
		
		QueenPermuatation(new boolean[4], 0, 2, "");
	}
	
	public static void QueenPermuatation(boolean[] boxes, int qpsf, int tq, String ans) {
		// qpsf -> queen places so far
		// tq -> total queens
		if(qpsf == tq) {
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		for(int i = 0; i < boxes.length; i++) {
			if(boxes[i] == false) {
				boxes[i] = true;
				QueenPermuatation(boxes, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
				boxes[i] = false;
			}			
		}
		
	}

}
