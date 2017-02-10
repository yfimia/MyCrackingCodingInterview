/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_1;

import java.util.HashSet;

/**
 *
 * @author yfimia
 */
public class SingleLinkedList {

    private SingleLinkedNode head;

    public SingleLinkedList() {
    }

    public SingleLinkedList(SingleLinkedNode head) {
        this.head = head;
    }

    public SingleLinkedNode getHead() {
        return head;
    }

    public void setHead(SingleLinkedNode head) {
        this.head = head;
    }

    public void addFirst(SingleLinkedNode head) {
        head.setNext(this.head);
        this.head = head;
    }

    public void addLast(SingleLinkedNode head) {
        if (this.head == null) {
            addFirst(head);
        } else {
            SingleLinkedNode p = this.head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            head.setNext(null);
            p.setNext(head);
        }
    }

    public void printList() {
        SingleLinkedNode p = this.head;
        if (p == null) {
            System.out.print("Empty List");
        }

        while (p != null) {
            System.out.print(p.getValue() + " | ");
            p = p.getNext();
        }
        System.out.println("\n---------------------------------");
    }

    //This algorithms has a complexity of O(n^2)
    public void removeDuplicates() {
        SingleLinkedNode p = this.head;
        while (p.getNext() != null) {
            SingleLinkedNode previous = p;
            SingleLinkedNode current = p.getNext();
            while (current != null) {
                if (current.getValue() == p.getValue()) {
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    current = previous.getNext();
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
            p = p.getNext();
        }
    }

    //This algorithms has a complexity of O(n)
    public void removeDuplicatesWithHash() {
        HashSet<Integer> x = new HashSet();
        
        SingleLinkedNode previous = this.head;
        SingleLinkedNode current = previous.getNext();
        while (current != null) {
            if (!x.add(current.getValue())){
                previous.setNext(current.getNext());
                current.setNext(null);
                current = previous.getNext();
            }
            else{
                previous = current;
                current = current.getNext();
            }
        }
    }
    
}
