/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_9;

/**
 *
 * @author yfimia
 */
public class Main {

    public static boolean isSubstring(String s1, String s2){
        return s2.indexOf(s1) >= 0; 
    }

    public static boolean isRotation(String s1, String s2){
        String doble = s1 + s1;
        return isSubstring(s2, doble);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("wetwetpiopio", "wetpiopiowet"));
        System.out.println(isRotation("wetwetpiopio", "piopiowetwet"));
        System.out.println(isRotation("wetwetpiopio", "piopiowetwet"));
        System.out.println(isRotation("wetwetpiowetpio", "pioletpiowetwet"));
    }
    
}
