/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_232_Implement_Queue_using_Stacks;

import java.util.Stack;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    
}

class MyQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    // Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!s2.isEmpty()) {
            s2.pop();
        }else{
            while (! s1.isEmpty()) {                
                s2.push(s1.pop());
            }
            s2.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }else{
            while (! s1.isEmpty()) {                
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
