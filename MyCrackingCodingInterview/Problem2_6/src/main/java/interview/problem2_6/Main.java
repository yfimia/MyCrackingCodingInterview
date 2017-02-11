/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem2_6;

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
        
        SingleLinkedList n1 = makeDigitList(12324);
        n1.printList();
        System.out.println("Is palindrome: " + n1.isPalindrome());
        System.out.println("Is palindrome: " + n1.isPalindromeFaster());
        
        
        
        
    }
    
}
