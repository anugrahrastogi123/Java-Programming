import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char ch = s.next().charAt(0);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		Queue<Character> queue = new LinkedList<>();
		
		while(ch != '.') {
			
			queue.add(ch);
			if(map.containsKey(ch)) {
				int oldValue = map.get(ch);
				oldValue = oldValue + 1;
				map.put(ch, oldValue);
			}
			else {
				map.put(ch, 1);
			}
			
			while(!queue.isEmpty()) {
				
				char frontChar = queue.peek();
				if(map.get(frontChar) == 1) {
					System.out.print(frontChar + " ");
					break;
				}
				else {
					queue.poll(); // remove from front of the queue
				}
			}
			
			if(queue.isEmpty()) {
				System.out.print(-1 + " ");
			}
			
			ch = s.next().charAt(0);
		}
		
		s.close();

	}

}
