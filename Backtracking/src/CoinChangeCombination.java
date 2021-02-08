
public class CoinChangeCombination {

	public static void main(String[] args) {
		
		coinChange(new int[] {2, 3, 5, 6}, 10, "", 0);
	}
	
	public static void coinChange(int[] denom, int amount, String ans, int lastDenomIdx) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = lastDenomIdx; i < denom.length; i++) {
			if(amount >= denom[i])
				coinChange(denom, amount-denom[i], ans+denom[i], i);
		}
	}

}
