/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_5;

/**
 *
 * @author yfimia
 */
public class Main {

    private static int counter = 0;

    //Version 1: Despite to be recursive the bounds make the tree to generate only N levels and single node each level. 
    //However, complexity becomes O(N^2) due to the substring and equals commands
    private static boolean simpleEdit(String a, String b, boolean change) {
        if (a.equals(b)) {
            return true;
        } else {
            return ((a.length() > 0) && (b.length() > 0) && (a.charAt(0) == b.charAt(0)) && (simpleEdit(a.substring(1), b.substring(1), false))) //igual
                    || ((!change) && (a.length() > 0) && (a.length() == b.length()) && (a.charAt(0) != b.charAt(0)) && (simpleEdit(a.substring(1), b.substring(1), true))) //Modify a character
                    || ((!change) && (b.length() > a.length()) && (simpleEdit(a, b.substring(1), true))) //Remove from original
                    || ((!change) && (a.length() > b.length()) && (simpleEdit(a.substring(1), b, true))); //Insert in the new string
        }
    }

    public static boolean isSimpleEdit(String a, String b) {
        return simpleEdit(a, b, false);
    }

    //Version2: Removing the substring comands to improve it a little
    private static boolean equals(String a, String b, int startA, int startB) {
        if (a.length() - startA == b.length() - startB) {
            for (int i = 0; i < a.length() - startA; i++) {
                if (a.charAt(startA + i) != b.charAt(startB + i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private static boolean simpleEdit1(String a, String b, int startA, int startB, boolean change) {
        if (equals(a, b, startA, startB)) {
            return true;
        } else {
            return ((a.length() - startA > 0) && (b.length() - startB > 0) && (a.charAt(startA) == b.charAt(startB)) && (simpleEdit1(a, b, startA + 1, startB + 1, false))) //igual
                    || ((!change) && (a.length() - startA > 0) && (a.length() - startA == b.length() - startB) && (a.charAt(0) != b.charAt(0)) && (simpleEdit1(a, b, startA + 1, startB + 1, true))) //Modify a character
                    || ((!change) && (b.length() - startB > a.length() - startA) && (simpleEdit1(a, b, startA, startB + 1, true))) //Remove from original
                    || ((!change) && (a.length() - startA > b.length() - startB) && (simpleEdit1(a, b, startA + 1, startB, true))); //Insert in the new string
        }
    }

    public static boolean isSimpleEdit1(String a, String b) {
        return simpleEdit1(a, b, 0, 0, false);
    }

    //Version3: Iterative version and with complexity O(n)
    public static boolean isSimpleEdit2(String a, String b) {
        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }
        boolean change = false;

        String menor, mayor;

        if (a.length() < b.length()) {
            menor = a;
            mayor = b;
        } else {
            menor = b;
            mayor = a;
        }

        int startMenor = 0;
        int startMayor = 0;

        while (startMenor < menor.length()) {

            if (menor.charAt(startMenor) == mayor.charAt(startMayor)) {
                startMenor++;
                startMayor++;
            } else {
                if (!change) {
                    //if the length of both strings are equal the there is only one option: a Modification
                    if (menor.length() == mayor.length()){
                        startMayor++;
                        startMenor++;
                    }
                    else{
                        startMayor++;
                    }
                    change = true;
                }
                else
                    return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pale, ple -> " + isSimpleEdit2("pale", "ple"));
        System.out.println("pales, pale -> " + isSimpleEdit2("pales", "pale"));
        System.out.println("pale, bale -> " + isSimpleEdit2("pale", "bale"));
        System.out.println("pale, bae -> " + isSimpleEdit2("pale", "bae"));
        String a = "Yoilan";
        String b = "Yoiilan";
        System.out.println(a + "," + b + " -> " + isSimpleEdit2(a, b));

    }

}
