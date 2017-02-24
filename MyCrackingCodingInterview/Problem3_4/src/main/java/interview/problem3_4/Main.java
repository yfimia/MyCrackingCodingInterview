/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_4;

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
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(2);
        mq.enqueue(8);
        mq.enqueue(6);
        mq.enqueue(3);
        mq.peek();
        mq.dequeue();
        mq.enqueue(7);
        mq.dequeue();
        mq.enqueue(9);
        
        
    }
    
}
