/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_3;

/**
 *
 * @author yfimia
 */
public class Main {

    public static String URLify(String str){
        char[] a = str.toCharArray();
        int cSpace = 0;
        //Counting spaces O(n)
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') cSpace++;
        }
        
        //Creating a new array with enough memory for the new extra characters
        char[] b = new char[a.length + 2 * cSpace];
        
        int p = b.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == ' ') {
                b[p--] = '0';
                b[p--] = '2';
                b[p--] = '%';
            }
            else{
                b[p--] = a[i];
            }
        }
        return new String(b);
    }

    //To make it in place
    public static void URLify(char[] str, int realLength){
        //Counting spaces O(n)
        int cSpace = 0;
        for (int i = 0; i < realLength; i++) {
            if (str[i] == ' ') cSpace++;
        }
        
        int newLength = realLength + 2 * cSpace;
        int index = newLength - 1;
        for (int i = realLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index--] = '0';
                str[index--] = '2';
                str[index--] = '%';
            }
            else{
                str[index--] = str[i];
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("[" + URLify("http://h.com/hi my fiend great dog") + "]");
        
        char[] s = {'h','t','t', 'p',':','/','/','h','.','c','o','m','/','h','i',' ','m','y',' ','f','r','i','e','n','d',' ',' ',' ',' '};
        URLify(s,25);
        System.out.println("New String: [" + new String(s) + "]");
        
        
        
    }
    
}
