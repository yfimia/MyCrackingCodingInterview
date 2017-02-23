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
public class StackWithMinWithLessSpace extends Stack<StackNodeWithLessSpace> {

    //This solution use an extra stack for the min
    private Stack<Integer> minValues;

    public StackWithMinWithLessSpace() {
        super(); 
        minValues = new Stack<>();
    }
    
    public void push(int newValue) {
        if (newValue <= internalMin()){
            minValues.push(newValue);
        }
        super.push(new StackNodeWithLessSpace(newValue));
    }
    
    public StackNodeWithLessSpace pop(){
        if (!isEmpty()){
            if (peek().getValue() == min()){
                minValues.pop();
            }
            return super.pop();
        }
        else{
            return null;
            //Stack underflow
        }
    }

    private int internalMin() {
        return isEmpty() ? Integer.MAX_VALUE : minValues.peek();
    }

    public int min() {
        if (isEmpty()) {
            //Exception
            System.out.println("Empty stack");
            return Integer.MAX_VALUE;
        } else {
            return minValues.peek();
        }
    }

}
