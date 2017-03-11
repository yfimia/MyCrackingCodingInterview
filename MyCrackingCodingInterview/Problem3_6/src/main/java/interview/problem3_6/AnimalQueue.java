/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem3_6;

import java.util.LinkedList;

/**
 *
 * @author yfimia <yfimia@gmail.com>
 */
public class AnimalQueue {

    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public boolean addDog(Dog dog) {
        dog.setOrder(order++);
        return dogs.add(dog);
    }

    public boolean addCat(Cat cat) {
        cat.setOrder(order++);
        return cats.add(cat);
    }

    public Animal adoptAny() {
        Dog d = dogs.peekFirst();
        Cat c = cats.peekFirst();
        if (d != null) {
            if (c != null){
                if (d.isOrderThan(c)) {
                    return dogs.poll();
                } else {
                    return cats.poll();
                }
            }
            else{
                return dogs.poll();
            }
        }
        else{
            return cats.poll();
        }
    }

    public Dog adoptDog() {
        return dogs.poll();
    }
    
    public Cat adoptCat() {
        return cats.poll();
    }
    

}
