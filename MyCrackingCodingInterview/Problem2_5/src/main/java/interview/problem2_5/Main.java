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
public class Main {

    public static SingleLinkedList makeDigitList(int x){
        SingleLinkedList l = new SingleLinkedList();
        do{
            SingleLinkedNode n =  new SingleLinkedNode(x % 10, null);
            l.addLast(n);
            x = x / 10;
        } while (x != 0);
        return l;
    }
    
    public static SingleLinkedList makeDigitListReverse(int x){
        SingleLinkedList l = new SingleLinkedList();
        do{
            SingleLinkedNode n =  new SingleLinkedNode(x % 10, null);
            l.addFirst(n);
            x = x / 10;
        } while (x != 0);
        return l;
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SingleLinkedList n1 = makeDigitList(3);
        n1.printList();
        SingleLinkedList n2 = makeDigitList(0);
        n2.printList();
        SingleLinkedList n3 = n1.add(n2);
        n3.printList();
        
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Reverse method
        SingleLinkedList l1 = makeDigitListReverse(1);
        l1.printList();
        SingleLinkedList l2 = makeDigitListReverse(999);
        l2.printList();
        SingleLinkedList l3 = l1.addReverse(l2);
        l3.printList();     
        //l1.printList();
        //l2.printList();
        
        
    }
    
}
