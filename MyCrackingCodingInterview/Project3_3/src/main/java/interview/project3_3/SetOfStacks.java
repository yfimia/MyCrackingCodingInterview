/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.project3_3;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author yoilanfimia
 */
public class SetOfStacks<T> {

    private ArrayList<Stack> stacks = new ArrayList<>();
    private int maxCapacity = 1000;
    private int activeStack = 0;

    public SetOfStacks() {
        super();
    }

    public SetOfStacks(int maxCapacity) {
        super();
        this.maxCapacity = maxCapacity;
    }

    public boolean isEmpty() {
        return (activeStack == 0) && (stacks.get(activeStack).isEmpty());
    }

    public void push(T newElement) {
        doIncrement();
        stacks.get(activeStack).push(newElement);
    }

    public T peek() {
        return (T) stacks.get(activeStack).peek();
    }

    public T pop() {
        if (!stacks.get(activeStack).isEmpty()) {
            T result = (T) stacks.get(activeStack).pop();
            doDecrement();
            return result;
        } else {
            System.out.println("Stack underflow");
            return null;

        }
    }

    public T popAt(int index) {
        if ((index > activeStack) || (index < 0)) {
            System.out.println("Not valid stack " + index);
            return null;
        }

        T x = (T) stacks.get(index).pop();
        for (int i = index + 1; i <= activeStack; i++) {
            T z = (T) stacks.get(i).get(0);
            stacks.get(i).remove(0);
            stacks.get(i - 1).push(z);
        }
        if (stacks.get(activeStack).isEmpty()) {
            activeStack -= 1;
        }
        return x;

    }

    private void doIncrement() {
        if (stacks.size() == 0) {
            stacks.add(new Stack());
        }
        if (stacks.get(activeStack).size() >= maxCapacity) {
            activeStack += 1;
            if (activeStack <= stacks.size()) {
                stacks.add(new Stack());
            }
        }
    }

    private void doDecrement() {
        if (stacks.get(activeStack).isEmpty()) {
            if (activeStack > 0) {
                activeStack--;
            }
        }
    }

    public void printSetOfStacks() {
        System.out.println("SET:");
        int i = 0;
        for (Stack x : stacks) {
            System.out.print("Stack " + i + ": [ ");
            for (Object e : x) {
                System.out.print(e.toString() + " ");
            }
            System.out.println("]");
            i++;
        }
    }

    public void printSetOfStacks2() {
        System.out.println("SET:");
        if (stacks.size() > 0) {
            for (int i = 0; i <= activeStack; i++) {
                System.out.print("Stack " + i + ": [ ");
                for (int j = 0; j < stacks.get(i).size(); j++) {
                    System.out.print(stacks.get(i).get(j).toString() + " ");
                }
                System.out.println("]");
            }
        }
    }

    public int getMacCapacity() {
        return maxCapacity;
    }

    public void setMacCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

}
