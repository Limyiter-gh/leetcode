/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_155_Min_Stack;

import java.util.Stack;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    private Stack<Integer> elementStack = new Stack<>();
    private Stack<Integer> supportStack = new Stack<>();
    
    public void push(int x){
        if (supportStack.empty() || x <= supportStack.peek()) {
            supportStack.push(x);
        }
        elementStack.push(x);
    }
    
    public void pop(){
        if (elementStack.peek().equals(supportStack.peek())) {
            supportStack.pop();
        }
        elementStack.pop();
    }
    
    public int top(){
        return elementStack.peek();
    }
    
    public int getMin(){
        return supportStack.peek();
    }
}
