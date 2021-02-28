package tries;

public class TrieClient {

	public static void main(String[] args) {
		
		Trie trie = new Trie();
		
		trie.addWord("arts");
		trie.addWord("art");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.addWord("see");
		trie.addWord("amit");
		
		trie.display();
		
		System.out.println(trie.search("sea"));
		
		System.out.println(trie.search("artist"));
		
		trie.remove("art");
		
		trie.display();
		
		System.out.println(trie.numWords());

	}

}
