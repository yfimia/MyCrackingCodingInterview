/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_5;

import java.util.Stack;

/**
 *
 * @author yoilanfimia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> a = new Stack<>();
        a.add(4);
        a.add(1);
        a.add(5);
        a.add(8);
        a.add(6);
        SortedStack stack = new SortedStack(a);
        stack.sort();
        stack.printStack();
        
    }
    
}
