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

    public SingleLinkedList add(SingleLinkedList n) {
        int acc = 0;
        SingleLinkedList newList = new SingleLinkedList();
        SingleLinkedNode cN1 = head;
        SingleLinkedNode cN2 = n.getHead();
        while ((cN1 != null) || (cN2 != null)) {
            int v1 = (cN1 != null) ? cN1.getValue() : 0;
            int v2 = (cN2 != null) ? cN2.getValue() : 0;
            SingleLinkedNode newNode = new SingleLinkedNode((v1 + v2 + acc ) % 10);
            newList.addLast(newNode);
            acc = (v1 + v2 + acc ) / 10;
            cN1 = (cN1 != null) ? cN1.getNext() : null;
            cN2 = (cN2 != null) ? cN2.getNext() : null;
        }
        if (acc != 0) newList.addLast(new SingleLinkedNode(acc)); 
        return newList;
    }
    
    private int addParcial(SingleLinkedNode a, SingleLinkedNode b, SingleLinkedList c){
        if ((a == null) && (b == null)) {
            return 0;
        }
        else{
            int acc = addParcial(a.getNext(), b.getNext(), c);
            int curValue = a.getValue() + b.getValue() + acc;
            c.addFirst(new SingleLinkedNode(curValue % 10));
            return curValue / 10;
        }
    }
    
    public SingleLinkedList addReverse(SingleLinkedList n) {
        SingleLinkedList newList = new SingleLinkedList();
        int c = countNodes();
        int cn = n.countNodes();
        if (c < cn){
            while (c < cn){
                addFirst(new SingleLinkedNode(0));
                c++;
            }
            int acc = addParcial(head, n.getHead(), newList);
            if (acc == 1) newList.addFirst(new SingleLinkedNode(acc));
            //Triming initial 0
            while ((head.getValue() == 0) && (head.getNext() != null)){
                head = head.getNext();
            }
        }
        else{
            while (cn < c){
                n.addFirst(new SingleLinkedNode(0));
                cn++;
            }
            int acc = addParcial(head, n.getHead(), newList);
            if (acc == 1) newList.addFirst(new SingleLinkedNode(acc));
            //Triming initial 0
            SingleLinkedNode nhead = n.getHead();
            while ((nhead.getValue() == 0) && (nhead.getNext() != null)){
                nhead = nhead.getNext();
            }
            n.setHead(nhead);
        }
        return newList;
    }
    


}
