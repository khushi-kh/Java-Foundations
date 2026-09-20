package day6;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {

    public static Map<String, List<String>> groupAnagrams(List<String> words) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(word);
        }

        return map;
    }

    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>();

        wordList.add("eat");
        wordList.add("tan");
        wordList.add("tab");
        wordList.add("ate");
        wordList.add("nat");
        wordList.add("bat");
        wordList.add("tea");

        System.out.println(groupAnagrams(wordList));
    }

}
