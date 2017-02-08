/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//1.1 - Finding if string has only unique characters 

package interview.problem1_1;

import java.util.BitSet;

/**
 *
 * @author yfimia
 */
public class Main {

    static boolean[] charset = new boolean[128]; //Assuming ASCII
    
    //Brute Force. Complexit: O(n^2)
    public static boolean unique1(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    //Brute Force - Improved. Complexit: O(n^2)
    public static boolean unique2(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.indexOf(str.charAt(i), i + 1) > i) return false;
        }
        return true;
    }
    
    //Hash table. Complexit: O(n)
    public static boolean unique3(String str){
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (charset[index]) return false;
            charset[str.charAt(i)] = true;
        }
        return true;
    }
    
    static BitSet alphabet = new BitSet(128);
    
    //Hash table with a BitSet. Complexit: O(n)
    public static boolean unique4(String str){
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (alphabet.get(index)) return false;
            alphabet.set(index); //[str.charAt(i)] = true;
        }
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "testing";
        System.out.println("Result: " + unique1(s));
        System.out.println("Result: " + unique2(s));
        System.out.println("Result: " + unique3(s));
        System.out.println("Result: " + unique4(s));
    }
    
}
