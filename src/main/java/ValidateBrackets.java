package main.java;

import java.util.HashMap;
import java.util.Stack;

public class ValidateBrackets {
    public static void main(String[] args) {
        String input = "{()}[]";
        System.out.println (isValid (input));

     }
     static boolean isValid(String input){
         HashMap<Character, Character> bracketsMap = new HashMap<> ();
         bracketsMap.put('(',')');
         bracketsMap.put('[',']');
         bracketsMap.put('{','}');
         Stack<Character> characterStack = new Stack<> ();
         char[] chars = input.toCharArray ();
         for(int i=0; i<chars.length;i++){
             if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                 characterStack.push (chars[i]);
             }
             else{
                 if(!characterStack.isEmpty() && chars[i] != bracketsMap.get(characterStack.pop())){
                     return false;

                 }
             }
         }
         if(!characterStack.isEmpty ()) return false;
        return true;
     }


}
