/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_6;

/**
 *
 * @author yfimia
 */
public class Main {

    public static String zip(String str){
        if (str.equals("")) return str;
        StringBuilder zipStr = new StringBuilder();
        int index = 0;
        char currentChar = str.charAt(index);
        char nextChar;
        int count = 0;

        do{
            nextChar = str.charAt(index++);
            if (nextChar == currentChar) {
                count++;
            }
            else{
                zipStr.append(currentChar);
                zipStr.append(count);
                currentChar = nextChar;
                count = 1;
            }
        } while(index < str.length());
        zipStr.append(currentChar);
        zipStr.append(count);
        return (zipStr.length() < str.length()) ? zipStr.toString() : str;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "aaa";
        System.out.println(a + ": " + zip(a) );
    }
    
}
