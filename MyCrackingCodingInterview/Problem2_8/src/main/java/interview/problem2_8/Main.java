/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_8;

import java.util.HashMap;

/**
 *
 * @author yfimia
 */
public class Main {

    //I used a hashmap to check when elements have been already added meaning that there is a loop
    public static SingleLinkedNode findLoopInitialNode(SingleLinkedList l1) {
        HashMap<SingleLinkedNode, SingleLinkedNode> hTable = new HashMap();
        SingleLinkedNode p1 = l1.getHead();
        while ((p1 != null) && (hTable.get(p1) == null)) {
            hTable.put(p1, p1);
            p1 = p1.getNext();
        }
        
        return (p1 == null)? null : p1;
    }

    
    //Implementing a solution with the fast runner pattern
    //
    public static SingleLinkedNode findLoopInitialNode2(SingleLinkedList l1) {
        SingleLinkedNode slow = l1.getHead();
        SingleLinkedNode fast = l1.getHead();
        //iterate untill the pointers get meet. They will met at some point into the loop
        while ((fast != null) && (fast.getNext() != null) ){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) break;
        }
        
        //si fast is null or fast.getNext is null there is no loop
        if (fast == null || fast.getNext() == null){
            return null;
        }
        
        //Move slow to the head and move 1 step each pointers until next collition that will be at the initail position of the loop
        slow = l1.getHead();
        while (slow != fast){
            slow = slow.getNext();
            fast = fast.getNext();
        }
        
        return fast;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        

        SingleLinkedNode p, q, z;
        p = new SingleLinkedNode(1, null);
        q = p;
        p = new SingleLinkedNode(2, p);
        p = new SingleLinkedNode(7, p);
        p = new SingleLinkedNode(9, p);
        p = new SingleLinkedNode(5, p);
        z = p;
        p = new SingleLinkedNode(1, p);
        p = new SingleLinkedNode(3, p);
        q.setNext(z);

        SingleLinkedList n1 = new SingleLinkedList(p);
        //n1.printList();

        SingleLinkedNode node = findLoopInitialNode(n1);
        if (node != null){
            System.out.println("Loop at: " + node.getValue() );
        }
        else{
            System.out.println("There is no Loop"); 
        }
        
        SingleLinkedNode node2 = findLoopInitialNode2(n1);
        if (node2 != null){
            System.out.println("Loop at: " + node2.getValue() );
        }
        else{
            System.out.println("There is no Loop"); 
        }        
        
    }

}
