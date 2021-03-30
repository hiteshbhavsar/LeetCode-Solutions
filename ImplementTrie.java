// This method can fail if the second constraint is removed
/*
Runtime: 29 ms, faster than 94.63% of Java online submissions for Implement Trie (Prefix Tree).
Memory Usage: 49.9 MB, less than 51.07% of Java online submissions for Implement Trie (Prefix Tree).

*/
class ImplementTrie {
    Node root = null;
    class Node {
        Node[] nodeCheck;
        boolean leaf;
        
        Node() {
            this.nodeCheck = new Node[26];
            this.leaf = false;
        }
    }

    /** Initialize your data structure here. */
    public ImplementTrie() {
        // initialize root
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node tempNode = root;
        for(char charValue: word.toCharArray()) {
            Node[] tempArr = tempNode.nodeCheck;
            if(tempArr[charValue - 'a'] == null) {
                Node newNode = new Node();
                tempArr[charValue - 'a'] = newNode;
            }
            tempNode = tempArr[charValue - 'a'];
        }
        
        tempNode.leaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node tempNode = root;
        for(char charValue: word.toCharArray()) {
            Node[] tempArr = tempNode.nodeCheck;
            if(tempArr[charValue - 'a'] == null) {
                return false;
            }
            tempNode = tempArr[charValue - 'a'];
        }
        return tempNode.leaf;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node tempNode = root;
        for(char charValue: prefix.toCharArray()) {
            Node[] tempArr = tempNode.nodeCheck;
            if(tempArr[charValue - 'a'] == null) {
                return false;
            }
            tempNode = tempArr[charValue - 'a'];
        }
        return true;
    }
}
/*

class Trie {
    class Node{
        Map<Character, Node> children;
        boolean endOfWord;
        public Node() {
            children = new HashMap<>();
            endOfWord = false;
        }    
    private Node root;
    public Trie() {
        root=new Node('\0');
        
    }
    
      public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Node node = current.children.get(ch);
            if (node == null) {
                node = new Node();
                current.children.put(ch, node);
            }
            current = node;
        }
        //mark the current nodes endOfWord as true
        current.endOfWord = true;
    }
    
    public boolean search(String word) {
        Node current=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            Node node=current.children.get(ch);
            if(node==null) return false;
        }
        if(current.endOfWord)
            return true;
        else return false;
    }
    
    public boolean startsWith(String prefix) {
        Node current=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            Node node=current.children.get(ch);
            if(node==null) return false;
        }
        return true;
    }
}


}*/

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
