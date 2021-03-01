package tries;

import java.util.BitSet;

public class HuffmanEncoderClient {

	public static void main(String[] args) {

		String str = "abbbccdaaaaa";
		
		HuffmanEncoder hf = new HuffmanEncoder(str);
		
		String codedStr = hf.encode(str);
		System.out.println(codedStr);
		
		String decodedStr = hf.decode(codedStr);
		System.out.println(decodedStr);
		
		System.out.println(hf.encoder);
		
		// the encoded string is in the form of String,
		// so we need to convert and store the encoded representation in the form of bits
		
		BitSet bitSet = new BitSet(codedStr.length()); // 0 is represented as false
													   // 1 is represented as true
		int bitcounter = 0;
		for(Character c : codedStr.toCharArray()) {
			if(c.equals('1')) {
				bitSet.set(bitcounter); // sets the index as true
			}
			bitcounter++;
		}
		
		System.out.println(bitSet);
		
		byte[] arr = bitSet.toByteArray();
		System.out.println(arr.length);

	}

}
