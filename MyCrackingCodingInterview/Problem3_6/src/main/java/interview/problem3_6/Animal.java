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
public class Animal {
    protected String name;
    protected int order;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    
    public boolean isOrderThan(Animal any){
        return this.order < any.order;
    }
    

}
