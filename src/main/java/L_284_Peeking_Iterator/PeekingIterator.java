/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_284_Peeking_Iterator;

import java.util.Iterator;

/**
 *
 * @author Li Mingyang
 */
public class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> it;
    private boolean peeked = false;
    private Integer top;

    // initialize any member here. 
    public PeekingIterator(Iterator<Integer> iterator) {
        this.it = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!peeked) {
            top = it.next();
            peeked = true;
        }
        return top;
    }

    @Override
    public boolean hasNext() {
        if (peeked) {
            return true;
        } else {
            return it.hasNext();
        }
    }

    @Override
    public Integer next() {
        if (!peeked) {
            return it.next();
        } else {
            peeked = false;
            return top;
        }
    }
}
