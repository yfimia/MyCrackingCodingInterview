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

    public static SingleLinkedNode findIntersection(SingleLinkedList l1, SingleLinkedList l2){
        HashMap<SingleLinkedNode, SingleLinkedNode> hTable = new HashMap();
        SingleLinkedNode p1 = l1.getHead();
        SingleLinkedNode p2 = l2.getHead();
        while ((p1 != null) || (p2 != null)){
            if (p1 != null) {
                if (hTable.get(p1) == null){
                    hTable.put(p1, p1);
                    p1 = p1.getNext();
                }
                else{
                    return p1;
                }
            }
            if (p2 != null) {
                if (hTable.get(p2) == null){
                    hTable.put(p2, p2);
                    p2 = p2.getNext();
                }
                else{
                    return p2;
                }
            }
        }
        return null;
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
        
        
        
        
    }
    
}
