/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_7;

import java.util.HashMap;

/**
 *
 * @author yfimia
 */
public class Main {

    //This time I'm using a hashmap to check when elements have been already added and in case it happend this is the starting node on the intersection
    public static SingleLinkedNode findIntersection(SingleLinkedList l1, SingleLinkedList l2) {
        HashMap<SingleLinkedNode, SingleLinkedNode> hTable = new HashMap();
        SingleLinkedNode p1 = l1.getHead();
        SingleLinkedNode p2 = l2.getHead();
        while ((p1 != null) && (p2 != null)) {
            if (hTable.get(p1) == null) {
                hTable.put(p1, p1);
                p1 = p1.getNext();
            } else {
                return p1;
            }
            if (hTable.get(p2) == null) {
                hTable.put(p2, p2);
                p2 = p2.getNext();
            } else {
                return p2;
            }
        }
        return null;
    }

    //This time I assume the length of the two list is know and then I discard the front elements in the loger list then look for the first common node
    public static SingleLinkedNode findIntersection2(SingleLinkedList l1, SingleLinkedList l2) {
        int c1 = l1.countNodes();
        int c2 = l2.countNodes();

        if ((c1 == 0) || (c2 == 0)) {
            return null;
        }

        //Set in p1 the longest list and in p2 the smaller
        SingleLinkedNode p1, p2;
        int mayor, menor;
        if (c1 > c2) {
            p1 = l1.getHead();
            mayor = c1;
            p2 = l2.getHead();
            menor = c2;
        } else {
            p1 = l2.getHead();
            mayor = c2;
            p2 = l1.getHead();
            menor = c1;
        }

        //Discarding first elements in the loger list
        while (mayor > menor) {
            p1 = p1.getNext();
            mayor--;
        }

        while ((p1 != null) && (p2 != null) && (p1 != p2)) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }

        return p1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SingleLinkedList n1 = new SingleLinkedList();
        SingleLinkedList n2 = new SingleLinkedList();

        SingleLinkedNode p = new SingleLinkedNode(1, null);
        p = new SingleLinkedNode(2, p);
        p = new SingleLinkedNode(7, p);
        SingleLinkedNode q = p;
        p = new SingleLinkedNode(9, p);
        p = new SingleLinkedNode(5, p);
        p = new SingleLinkedNode(1, p);
        p = new SingleLinkedNode(3, p);
        q = new SingleLinkedNode(6, q);
        q = new SingleLinkedNode(4, q);

        n1.setHead(p);
        n2.setHead(q);

        n1.printList();
        n2.printList();

        SingleLinkedNode node3 = findIntersection(n1, n2);
        SingleLinkedList n3 = new SingleLinkedList(node3);
        n3.printList();

        SingleLinkedNode node4 = findIntersection2(n1, n2);
        SingleLinkedList n4 = new SingleLinkedList(node4);
        n4.printList();
        
    }

}
