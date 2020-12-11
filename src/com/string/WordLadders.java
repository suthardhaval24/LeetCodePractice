package com.string;

import java.util.*;

/**
 * Leetcode Medium
 * Idea is BFS:
 */

public class WordLadders {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String words[] = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        int ans = ladderLength(beginWord, endWord, wordList);
        System.out.println(ans);
    }

    private static int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> set = new HashSet<>();
        for(String word : wordList){
            set.add(word);
        }

        //base case
        if(!set.contains(endWord)){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String current_word = queue.poll();
                char[] word_chars = current_word.toCharArray();
                for(int j=0;j<word_chars.length;j++){
                    char original_char = word_chars[j];
                    for(char c='a'; c<='z';c++){
                        if(word_chars[j] ==c) continue;
                        word_chars[j] =c;
                        String new_word = String.valueOf(word_chars);
                        if(new_word.equals(endWord)) return level+1;
                        if( set.contains(new_word)){
                            queue.offer(new_word);
                            set.remove(new_word);
                        }
                    }
                    word_chars[j] = original_char;
                }
            }
            level++;
        }

        return 0;
    }
}
