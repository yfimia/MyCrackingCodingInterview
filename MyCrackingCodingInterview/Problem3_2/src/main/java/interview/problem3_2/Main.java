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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackWithMin a = new StackWithMin();
        System.out.println("Min: " + a.min());
        a.push(3);
        System.out.println("Min: " + a.min());
        a.push(5);
        System.out.println("Min: " + a.min());
        a.push(3);
        System.out.println("Min: " + a.min()); 
        a.push(1);
        System.out.println("Min: " + a.min());  
        System.out.println("---------------------");
        
        StackWithMinWithLessSpace b = new StackWithMinWithLessSpace();
        b.push(8);
        System.out.println("Min: " + b.min());  
        b.push(5);
        System.out.println("Min: " + b.min());  
        b.push(1);
        System.out.println("Min: " + b.min());  
        b.push(1);
        System.out.println("Min: " + b.min());  
        
    }
    
}
