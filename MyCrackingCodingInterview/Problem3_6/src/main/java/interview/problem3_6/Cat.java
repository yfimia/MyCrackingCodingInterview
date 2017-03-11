/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_6;

/**
 *
 * @author yfimia <yfimia@gmail.com>
 */
public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
    
    public void maullar(){
        System.out.println("Miau");
    }
    
    public String toString() {
        return "[Cat = { name : " + name + ", order: " + order + " }]";
    }
    
}
