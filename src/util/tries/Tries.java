package util.tries;

public class Tries {
    static final int ALPHABET_SIZE = 26;

    static class Node{
        Node[] children = new Node[ALPHABET_SIZE];
        boolean isEndOfWord;
        Node(){
            isEndOfWord = false;
            for(int i=0; i < ALPHABET_SIZE; i++){
                children[i] = null;
            }
        }
    }

    static Node root;

    static void insert(String key){
        int level;
        int length = key.length();
        int index;
        Node pCrawl = root;
        for(level = 0;level<length;level++){
            index = key.charAt(level) - 'a';
            if(pCrawl.children[index] == null){
                pCrawl.children[index]=new Node();
            }
            pCrawl=pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    static boolean search(String key){
        int level;
        int length = key.length();
        int index;
        Node pCrawl = root;
        for(level = 0;level<length;level++){
            index = key.charAt(level) - 'a';
            if(pCrawl.children[index] == null){
                return false;
            }
            pCrawl = pCrawl.children[index];
        }
        return (pCrawl != null && pCrawl.isEndOfWord);
    }

}
