package tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {
	
	private class Node{
		
		char data;
		HashMap<Character, Node> children;
		boolean isTerminal; // true if it is terminal of a word
		
		Node(char data, boolean isTerminal){
			this.data = data;
			this.children = new HashMap<>();
			this.isTerminal = isTerminal;
		}
		
	}
	
	private int numWords; // number of words in our trie
	private Node root;
	
	Trie(){
		this.root = new Node('\0', false);
		this.numWords = 0;
	}
	
	public int numWords() {
		return this.numWords;
	}
	
	public void addWord(String word) {
		this.addWord(root, word);
	}
	
	private void addWord(Node parent, String word) {
		
		if(word.length() == 0) {
			
			// word already exists
			if(parent.isTerminal) {
				
			}
			else {
				parent.isTerminal = true;
				this.numWords++;
			}
			
			return;
			
		}
		
		char cc = word.charAt(0); // current char
		String ros = word.substring(1); // rest of string
		Node child = parent.children.get(cc);
		
		// if current char is not present in the hash map of parent node
		if(child == null) {
			child = new Node(cc, false);
			parent.children.put(cc, child);
		}
		
		this.addWord(child, ros);
		
	}
	
	public void display() {
		this.display(root, "");
	}

	private void display(Node node, String osf) { // osf : output so far
		
		if(node.isTerminal) {
			String todisplay = osf.substring(1) + node.data;
			System.out.println(todisplay);
		}
		
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		
		for(Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf+node.data);
		}
		
	}
	
	public boolean search(String word) {
		return this.search(root, word);
	}

	private boolean search(Node parent, String word) {
		
		if(word.length() == 0) {
			if(parent.isTerminal) {
				return true;
			}
			else {
				return false;
			}
		}
		
		char cc = word.charAt(0); // current char
		String ros = word.substring(1); // rest of string
		Node child = parent.children.get(cc);
		
		// if current char is not present then return false i.e the word is not present
		if(child == null) {
			return false;
		}
		
		return this.search(child, ros);
		
	}
	
	public void remove(String word) {
		this.remove(root, word);
	}

	private void remove(Node parent, String word) {
		
		if(word.length() == 0) {
			if(parent.isTerminal) {
				parent.isTerminal = false;
				this.numWords--;
			}
			else {
				// word is a part of other word
			}
			
			return;
		}
		
		char cc = word.charAt(0); // current char
		String ros = word.substring(1); // rest of string
		Node child = parent.children.get(cc);
		
		// if current char is not present then return i.e the word is not present
		if(child == null) {
			return;
		}
		
		this.remove(child, ros);
		
		if(!child.isTerminal && child.children.size() == 0) {
			parent.children.remove(cc);
		}
		
	}

}























