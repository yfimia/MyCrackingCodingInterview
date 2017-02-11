/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_5;

/**
 *
 * @author yfimia
 */
public class SingleLinkedNode {
    private int value;
    private SingleLinkedNode next;

    public SingleLinkedNode() {
        value = 0;
        next = null;
    }

    public SingleLinkedNode(int value) {
        this.value = value;
        this.next = null;
        
    }

    public SingleLinkedNode(int value, SingleLinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public SingleLinkedNode getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(SingleLinkedNode next) {
        this.next = next;
    }
    
    
    
}