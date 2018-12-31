/*
 *Write a simple PHP program
              which takes a string as input and breaks the string into
              words and prints them in ascending order of word length.
              Use dictionary order in case of a tie. Don’t use any
              native PHP functions.
              - Example: 
Input: 

              Raj is the best programmer in the world 
Output:

              in is Raj the the best world programmer
 */
package Tester;

/**
 *
 * @author KK Davara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static int length(String str) {
        int count = 0;
        try {
            while (str.charAt(count++) != '\0');
        } catch (Exception e) {
        }
        count -= 1;
        return count;
    }

    public static int myStrCmp(String a, String b) {
        if(length(b)<length(a))
            return 1;
        if(length(b)==length(a))
        {
           for(int i=0;i<length(b);i++)
           {
               if(a.charAt(i)>b.charAt(i))
                  return 1; 
           }
                
        }
        return 0;
    }
    
    public static void sortArray(String[] str, int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (myStrCmp(str[j], str[j + 1]) == 1) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
       
        System.out.println("Sorted Array is: ");
        for (int i = 0; i < length; i++) {
            System.out.println(str[i]);
        }

    }

    public static void main(String[] args) {
        String str = "Raj is the best programmer in the world";
        int i = 0;
        int length = length(str);
        int countWord = 0;

        System.out.println("length " + length);
        for (i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                countWord++;
            }
        }
        countWord++;
        System.out.println("Words are " + countWord);
        String[] array = new String[countWord];
        String s = "";
        int j = 0;

        for (i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                s += str.charAt(i);
            } else {
                array[j++] = s;
                s = "";
            }
        }
        array[j] = s;
       
        sortArray(array, countWord);
    }

}
