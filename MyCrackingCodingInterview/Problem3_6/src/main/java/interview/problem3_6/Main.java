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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalQueue shelter = new AnimalQueue();
        
        shelter.addDog(new Dog("Firulay"));
        shelter.addDog(new Dog("Jhon"));
        shelter.addCat(new Cat("Figaro"));
        shelter.addDog(new Dog("Max"));
        shelter.addCat(new Cat("Kity"));
        
        System.out.println(shelter.adoptAny());
        System.out.println(shelter.adoptDog());
        System.out.println(shelter.adoptAny());
        System.out.println(shelter.adoptAny());
        System.out.println(shelter.adoptAny());
        System.out.println(shelter.adoptAny());
        
        
        
    }
    
}
