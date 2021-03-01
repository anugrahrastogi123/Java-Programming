package tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanEncoder {
	
	HashMap<Character, String> encoder;
	HashMap<String, Character> decoder;
	
	public HuffmanEncoder(String feeder) {
		// create a freq map of this feeder string
		HashMap<Character, Integer> freqmap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < feeder.length(); i++) {
			
			char cc = feeder.charAt(i);
			if(freqmap.containsKey(cc)) {
				int oldVal = freqmap.get(cc);
				int newVal = oldVal + 1;
				freqmap.put(cc, newVal);
			}
			else {
				freqmap.put(cc, 1);
			}
			
		}
		
		// create a min heap of Trees
		HeapGeneric<Node> minheap = new HeapGeneric<>();
		
		Set<Map.Entry<Character, Integer>> entries = freqmap.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entries) {
			Node nn = new Node(entry.getKey(), entry.getValue());
			minheap.add(nn);
		}
		
		// combine nodes until one node is left in heap
		while(minheap.size() != 1) {
			Node minone = minheap.remove();
			Node mintwo = minheap.remove();
			
			Node combined = new Node('\0', minone.cost + mintwo.cost);
			combined.left = minone;
			combined.right = mintwo;
			
			minheap.add(combined);
		}
		
		Node ft = minheap.remove(); // ft : full tree
		
		this.encoder = new HashMap<>();
		this.decoder = new HashMap<>();
		
		this.initEncoderDecoder(ft, "");
		
	}
	
	// fill encoder and decoder
	private void initEncoderDecoder(Node node, String osf) { // osf : output so far
		
		if(node == null) {
			return;
		}
		
		if(node.left == null && node.right == null) {
			this.encoder.put(node.data, osf);
			this.decoder.put(osf, node.data);
		}
		
		this.initEncoderDecoder(node.left, osf + "0");
		this.initEncoderDecoder(node.right, osf + "1");
		
	}
	
	public String encode(String source) {
		
		String rv = "";
		
		for(int i = 0; i < source.length(); i++) {
			String code = this.encoder.get(source.charAt(i));
			rv += code;
		}
		
		return rv;
		
	}
	
	public String decode(String codedString) {
		
		String rv = "";
		String key = "";
		
		for(int i = 0; i < codedString.length(); i++) {
			key = key + codedString.charAt(i);
			if(this.decoder.containsKey(key)) {
				rv = rv + this.decoder.get(key);
				key = "";
			}
		}
		
		return rv;
		
	}
	
	private class Node implements Comparable<Node>{
		Character data;
		int cost; // frequency
		Node left;
		Node right;
		
		Node(char data, int cost){
			this.data = data;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}

}
