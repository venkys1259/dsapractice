package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String input = "bcabc",output="";
        HashSet<Character> chars = new HashSet<>();
        for(Character ch: input.toCharArray()){
            chars.add(ch);
        }
        Iterator iterator =chars.iterator();
        while(iterator.hasNext()){
            output = output+iterator.next();
        }
        char[] ch = output.toCharArray();
        Arrays.sort (ch);
        System.out.println (String.valueOf(ch));
    }
}
