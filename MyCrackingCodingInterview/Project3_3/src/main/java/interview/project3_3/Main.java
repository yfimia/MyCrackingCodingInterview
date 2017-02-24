/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.project3_3;

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
        SetOfStacks<Integer> a = new SetOfStacks<>(3);
        a.printSetOfStacks2();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);
        a.push(7);
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.pop();
        a.printSetOfStacks2();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);
        a.push(7);
        a.printSetOfStacks2();
        a.popAt(0);
        a.printSetOfStacks2();
        a.popAt(1);
        a.printSetOfStacks2();
    }
    
}
