package com.vsam;

import java.util.Arrays;
import java.util.Stack;

public class NextHigherElement {
    public static void main(String[] args) {
        int[] input = {7,2,9,3,6,4,3}; //7,2,9,3,6,4,3
        int[] output = new int[input.length];
        int j = 0,stackElement;
        Stack<Integer> numberStack = new Stack<> ();
        for(int i = 0; i<input.length;i++){
            if(i == 0 || numberStack.peek () > input[i]){
                numberStack.push (input[i]);
            }else{

                numberStack = reverseStack(numberStack);
                while(!numberStack.isEmpty ()){
                    stackElement = numberStack.pop ();
                    if(stackElement >= input[i]){
                        output[j] = -1;
                    }else {
                        output[j] = input[i];
                    }
                    j++;

                }
                numberStack.push (input[i]);

            }
        }
        while(!numberStack.isEmpty ()){
            output[j] = -1;
            numberStack.pop ();
            j=j+1;

        }
        System.out.println (Arrays.toString(output));

    }

    static Stack<Integer> reverseStack(Stack<Integer> input){
        Stack<Integer> reversedStack = new Stack<> ();
        while(input.size () != 0){
            reversedStack.push (input.pop());
        }
        return reversedStack;
    }
}
