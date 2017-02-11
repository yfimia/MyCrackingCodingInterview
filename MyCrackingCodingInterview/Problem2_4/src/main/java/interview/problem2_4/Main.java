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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {3,5,8,5,10,2,1};
        SingleLinkedList l = new SingleLinkedList(null);
        for (Integer o1 : a) {
            l.addLast(new SingleLinkedNode(o1));
        }
        l.printList();
        l.makePartition(5);
        l.printList();
    }
    
}
