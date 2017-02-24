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
public class SortedStack{
    private Stack<Integer> a;
    

    public SortedStack(Stack<Integer> stack) {
        this.a = stack;
    }
    
    public void sort(){
        Stack<Integer> b = new Stack<>();
        int min;
        while (!a.isEmpty()){
            int v = a.pop();
            while ((!b.isEmpty()) && (v < b.peek())){
                a.push(b.pop());
            }
            b.push(v);
        }
        a = b;
    }

    public void printStack(){
        System.out.print("Stack: [ ");
        for (Integer x : a){
            System.out.print(x + " ");
        }
        System.out.print("]");
    }
    
}
