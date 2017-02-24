/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_4;

import java.util.Stack;

/**
 *
 * @author yoilanfimia
 */
public class MyQueue<T> {
    private Stack<T> s1;
    private Stack<T> s2;
    private boolean reversed; 

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        reversed = false;
    }
    
    public int size(){
        return (reversed) ? s2.size() : s1.size();
    }
    
    public T dequeue(){
        if (!reversed){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            reversed = true;
        }   
        T x = s2.pop();
        System.out.println("Dequed Element: " + x.toString());
        prinStacks();
        return x;
    }

    public T peek(){
        if (!reversed){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            reversed = true;
        }   
        T x = s2.peek();
        System.out.println("Peeked Element: " + x.toString());
        prinStacks();
        return x;
    }
    
    public void enqueue(T newElement){
        if (reversed){
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            reversed = false;            
        }
       
        s1.push(newElement);
        System.out.println("Enqued Element: " + newElement.toString());
        prinStacks();        
    }
    
    public void prinStacks(){
        System.out.print("Stack 1: [ ");
        for (T x : s1){
            System.out.print(x.toString() + " ");
        }
        System.out.println("]");
        System.out.print("Stack 2: [ ");
        for (T x : s2){
            System.out.print(x.toString() + " ");
        }
        System.out.println("]");
        System.out.println("Reversed: " + reversed);
    }
    
}
