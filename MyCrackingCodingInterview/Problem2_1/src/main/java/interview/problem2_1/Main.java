/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_1;

import java.util.LinkedList;

/**
 *
 * @author yfimia
 */
public class Main {


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = {1,5,2,7,5,9,5,2,3};
        SingleLinkedList l = new SingleLinkedList(null);
        for (Integer o1 : a) {
            l.addLast(new SingleLinkedNode(o1));
        }
        l.printList();
        l.removeDuplicatesWithHash();
        l.printList();
        
        
    }
    
}
