/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_1;

/**
 *
 * @author yoilanfimia
 */
public class FixedStack {
    private int capacity;
    private int stackQuantity;
    private int[] stack;
    private int[] tops;

    public FixedStack(int stackQuantity, int capacity) {
        this.capacity = capacity;
        this.stackQuantity = stackQuantity;
        this.stack = new int[stackQuantity * capacity];
        this.tops = new int[stackQuantity];
        
    }
    
    public boolean isEmpty(int stackNumber){
        return tops[stackNumber] == 0;
    }
    
    public boolean isFull(int stackNumber){
        return tops[stackNumber] == capacity;
    }
    
    public int peek(int stackNumber){
        if (!isEmpty(stackNumber)){
            return stack[stackNumber * capacity + tops[stackNumber]];
        }
        //Here we should raise an exception
        System.out.println("Peek over an Empty Stack" + stackNumber); 
        return -1;
    }
    
    public boolean push(int stackNumber, int value){
        if (!isFull(stackNumber)){
            stack[stackNumber * capacity + tops[stackNumber]++] = value;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int pop(int stackNumber){
        if (!isEmpty(stackNumber)){
            tops[stackNumber]--;
            int value = stack[stackNumber * capacity + tops[stackNumber]];
            return value;
        }
        //Here we should raise an exception
        System.out.println("Pop over an Empty Stack " + stackNumber); 
        return -1;
    }
    
    public void printStack(int stackNumber){
        System.out.print("Stack [" + stackNumber + "] ");
        System.out.print("Capacity [" + capacity + "] ");
        System.out.print("Used [" + tops[stackNumber] + "] ");
        System.out.print("Values [ ");
        for (int i = 0; i < tops[stackNumber]; i++){
            System.out.print(stack[stackNumber * capacity + i] + " ");
        }
        System.out.println("]");
    }
    
}
