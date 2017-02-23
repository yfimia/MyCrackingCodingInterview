/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_2;

import java.util.Stack;

/**
 *
 * @author yoilanfimia
 */
public class StackWithMin extends Stack<StackNode> {

    //This class use one value to define the min for each value in the stack
    public void push(int newValue) {
        super.push(new StackNode(newValue, Math.min(newValue, internalMin())));
    }

    private int internalMin() {
        return isEmpty() ? Integer.MAX_VALUE : peek().getMin();
    }

    public int min() {
        if (isEmpty()) {
            //Exception
            System.out.println("Empty stack");
            return Integer.MAX_VALUE;
        } else {
            return peek().getMin();
        }
    }

}
