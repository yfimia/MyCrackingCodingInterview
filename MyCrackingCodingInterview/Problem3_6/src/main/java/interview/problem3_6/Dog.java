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
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public void ladrar() {
        System.out.println("Jau");
    }

    public String toString() {
        return "[Dog = { name : " + name + ", order: " + order + " }]";
    }

}
