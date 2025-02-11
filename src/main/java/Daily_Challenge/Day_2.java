package Daily_Challenge;

public class Day_2 {
    public static void main(String[] args) {

    }
    public String longestPrefix(String[] arr){
        Trie root=new Trie();
        for(String s:arr){
            root.insert(s);
        }
        return root.search(arr[0],arr.length);
    }
}
class Trie{
    public TrieNode root;
    public class TrieNode{
        public boolean isEnd;
        public int size;
        public TrieNode[] next;
        TrieNode(){
            isEnd=false;
            size=0;
            next=new TrieNode[26];
        }
    }
    Trie(){
        root=new TrieNode();
    }
    public void insert(String s){
        TrieNode node=root;
        for (char c:s.toCharArray()){
            if(node.next[c-'a']==null){
                node.next[c-'a']=new TrieNode();
            }
            node.next[c-'a'].size++;
            node=node.next[c-'a'];
        }
        node.isEnd=true;
    }
    public String search(String s,int N){
        TrieNode node=root;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(node.next[c-'a']!=null&&node.next[c-'a'].size==N){
                node=node.next[c-'a'];
            }else {
                return s.substring(0,i);
            }
        }
        return s;
    }

}
