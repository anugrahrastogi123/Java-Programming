import java.util.ArrayList;

public class GetSubSequences {

	public static void main(String[] args) {
		
		System.out.println(getSS("abc"));
		
		// Get SubSequences with ASCII
		// ["", b, 98, a, ab, a98, 97, 97b, 9798]
		System.out.println(getSSWAscii("ab"));

	}
	
	public static ArrayList<String> getSS(String str){
		
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		char currentchar = str.charAt(0);
		String ros = str.substring(1); // rest of string
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recResult = getSS(ros);
		
		for(int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(currentchar + recResult.get(i));
		}
		
		return myResult;
	}
	
	public static ArrayList<String> getSSWAscii(String str){
		
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		char currentchar = str.charAt(0);
		String ros = str.substring(1); // rest of string
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recResult = getSSWAscii(ros);
		
		for(int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(currentchar + recResult.get(i));
			myResult.add((int)currentchar + recResult.get(i));
		}
		
		return myResult;
	}

}
