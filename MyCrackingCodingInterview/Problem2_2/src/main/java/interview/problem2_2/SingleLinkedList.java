/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_2;

import java.util.HashSet;

/**
 *
 * @author yfimia
 */
public class SingleLinkedList {

    private SingleLinkedNode head;

    private int quantity = -1;

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

    private SingleLinkedNode kElementFromLat(SingleLinkedNode current, int k, int reverseCount) {
        if (current == null) {
            quantity = reverseCount;
            return null;
        } else {
            SingleLinkedNode r = kElementFromLat(current.getNext(),k, reverseCount + 1);
            if (quantity - reverseCount == k) {
                return current;
            } else {
                return r;
            }
        }

    }

    //This algorithms has a complexity of O(n) in time by O(n) space complexity
    public SingleLinkedNode elementKFromLastRecursive(int k) {
        SingleLinkedNode p;
        p = kElementFromLat(this.head, k, 0);
        return p;
    }
    
    //This is the best way. Takes O(n) in time and O(1) in space
    public SingleLinkedNode elementKFromLastIterative(int k) {
       SingleLinkedNode p1 = head;
       SingleLinkedNode p2 = head;
       for (int i = 0; (i < k); i++){
           if (p2 == null) return null;
           p2 = p2.getNext();
       }
       
       while (p2 != null){
           p2 = p2.getNext();
           p1 = p1.getNext();
       }
       
       return p1;
       
    }

}
