/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_8;

import java.util.Stack;

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

    public int countNodes(){
        int c = 0;
        SingleLinkedNode h = head;
        while (h != null){
            c++;
            h = h.getNext();
        }
        return c;
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

    public boolean equals(SingleLinkedList a){
        SingleLinkedNode h1 = head;
        SingleLinkedNode h2 = a.getHead();
        while ((h1 != null) && (h2 != null)){
            if (h1.getValue() != h2.getValue()){
                return false;
            }
            h1 = h1.getNext();
            h2 = h2.getNext();
        }
        return ((h1 == null) && (h2 == null));
    }
    
}
