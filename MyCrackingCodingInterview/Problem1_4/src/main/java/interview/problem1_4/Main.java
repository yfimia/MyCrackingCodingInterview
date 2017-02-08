/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_4;

import java.util.BitSet;

/**
 *
 * @author yfimia
 */
public class Main {

    public static boolean isPermutationOfPalindrome(String s){
        BitSet alphabet = new BitSet(128);
        //O(n)
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (Character.isLetter(x)){
                x = Character.toLowerCase(x);
                alphabet.flip(x);
            }
        }
        //System.out.println("" + alphabet.cardinality());
        //System.out.println("" + alphabet.toString());
        return (alphabet.cardinality()<= 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        java.io.BufferedReader br;
        br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String input;
        System.out.print("Input String?: ");
        //input = br.readLine();
        input = "n i e r Re I";
        System.out.println("Output: " + isPermutationOfPalindrome(input));
        
    }
    
}
