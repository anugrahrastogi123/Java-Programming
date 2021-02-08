
public class CoinChangeCoinRespect {

	public static void main(String[] args) {
		
		coinChange(new int[] {2, 3, 5, 6}, 0, 10, "");
	}
	
	public static void coinChange(int[] denom, int vidx, int amount, String ans) {
		
		// positive base case
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		// negative base case
		if(amount < 0 || vidx == denom.length) {
			return;
		}
		
		// yes -> the coin at vidx(virtual index) will contribute
		coinChange(denom, vidx, amount-denom[vidx], ans+denom[vidx]);
		// no -> the coin at vidx(virtual index) will not contribute
		coinChange(denom, vidx+1, amount, ans);
	}

}
