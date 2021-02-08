import java.util.ArrayList;

public class GetPermutation {

	public static void main(String[] args) {
		
		System.out.println(getP("abc"));

	}
	
	public static ArrayList<String> getP(String str){
		
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1); // rest of string
		
		ArrayList<String> recResult = getP(ros);
		ArrayList<String> myResult = new ArrayList<String>();
		
		for(String item: recResult) {
			for(int i = 0; i <= item.length(); i++) {
				String val = item.substring(0,i) + ch + item.substring(i);
				myResult.add(val);
			}
		}
		return myResult;
	}

}
