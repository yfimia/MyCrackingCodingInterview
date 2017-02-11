/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_4;

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

    public void makePartition(int value) {
        SingleLinkedNode greaters = null;
        SingleLinkedNode lowers = null;
        SingleLinkedNode current = head;
        head = null;
        while (current != null){
            SingleLinkedNode next = current.getNext();
            if (current.getValue() < value){
                if (head == null) {
                    head = current;
                    lowers = current;
                }
                else{
                    lowers.setNext(current);
                    lowers = current;
                }
                current.setNext(null);
            }
            else{
                current.setNext(greaters);
                greaters = current;
            }
            current = next;
        }
        if (lowers != null) lowers.setNext(greaters);
    }


}
