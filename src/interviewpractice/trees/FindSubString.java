package interviewpractice.trees;

import java.util.HashMap;
import java.util.Map;

/**
 * @author benmakusha
 */

public class FindSubString {

    String[] findSubstrings(String[] words, String[] parts) {
        Trie t = new Trie(parts);
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            int longest = 0;
            for (int j = 0; j < cur.length(); j++) {
                int index = t.search(cur.substring(j));
                if (index != -1 && index > longest) {
                    longest = index;
                    result[i] = new String(cur.substring(0, j) + "[" + cur.substring(j, index + j)
                            + "]" + words[i].substring(index + j));
                }
                if (longest > cur.length() - j) {
                    break;
                }
            }
            if (result[i] == null) {
                result[i] = words[i];
            }
        }
        return result;
    }
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean isWord;
        TrieNode(boolean isWord) {
            children = new HashMap<>();
            this.isWord = isWord;
        }
    }
    class Trie {
        TrieNode root;
        Trie(String[] array) {
            root = new TrieNode(false);
            for (String s : array) {
                insert(s);
            }
        }
        public void insert(String s) {
            TrieNode cur = root;
            TrieNode next;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                next = cur.children.get(ch);
                if (next == null) {
                    next = new TrieNode(false);
                    cur.children.put(ch, next);
                }
                cur = next;
            }
            cur.isWord = true;
        }
        //return index of end match longest
        public int search(String s) {
            TrieNode cur = root;
            TrieNode next;
            int n = s.length();
            int i = 0;
            int result = -1;
            while (cur != null && i < n) {
                char ch = s.charAt(i++);
                next = cur.children.get(ch);
                cur = next;
                if (cur != null && cur.isWord) {
                    result = i;
                }
            }
            return result;
        }
    }

}
