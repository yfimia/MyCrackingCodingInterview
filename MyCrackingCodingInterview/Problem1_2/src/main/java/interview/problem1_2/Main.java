/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_2;

/**
 *
 * @author yfimia
 */
public class Main {


    //Sorting solution - O(N log N)
    public static boolean isPermutation1(String a, String b){
        if (a.length() != b.length()) return false;
        String sortedA = stringSort(a);
        String sortedB = stringSort(b);
        return sortedA.equals(sortedB);
    }
    
    public static String stringSort(String a){
        //O(N)
        char[] arr = a.toCharArray();
        //O(N log N)
        java.util.Arrays.sort(arr);
        //O(N)
        return new String(arr);
    }
    
    
    //Hash table - O(n)
    public static boolean isPermutation2(String a, String b){
        if (a.length() != b.length()) return false;
        // O(n) where n is the length of the strings
        int[] counter = new int[128]; //assuming ASCII 
        for (int i = 0; i < a.length(); i++){
            counter[a.charAt(i)]++;
            counter[b.charAt(i)]--;
        }
        //O(c) where c is the length of the alphabet 
        for (int j = 0; j < counter.length; j++){
            if (counter[j] != 0) return false;
        }
        return true;
    }

    //Hash table - Improvement - O(n)
    public static boolean isPermutation3(String a, String b){
        if (a.length() != b.length()) return false;
        // O(n) where n is the length of the strings
        int[] counter = new int[128]; //assuming ASCII 
        int compensations = 0;
        for (int i = 0; i < a.length(); i++){
            if (counter[a.charAt(i)] < 0) compensations++;
            counter[a.charAt(i)]++;
            if (counter[b.charAt(i)] > 0) compensations++;
            counter[b.charAt(i)]--;
        }
        return compensations == a.length();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "yoilan";
        String b = "lanyoi";
        System.out.println("Result: " + isPermutation1(a, b));
        System.out.println("Result: " + isPermutation2(a, b));
        System.out.println("Result: " + isPermutation3(a, b));
    }
    
}
