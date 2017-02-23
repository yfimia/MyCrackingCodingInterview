/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_2;

/**
 *
 * @author yoilanfimia
 */
public class StackNode {
    private int value;
    private int min;

    public StackNode() {
    }

    public StackNode(int value, int min) {
        this.value = value;
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public int getMin() {
        return min;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setMin(int min) {
        this.min = min;
    }

    
    
}
