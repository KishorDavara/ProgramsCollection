package paypalChallenge;
import java.util.Random;
import java.util.Scanner;

public final class ArrayUtil {
    
    private static Scanner input = new Scanner(System.in); 
    
    public static void input1DArray(int []array) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }        
    }
    
    public static void input2DArray(int [][]array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }        
    }
    
    public static boolean contains(String []array, String key) {
        for(String element : array) {
            if(element.equals(key))
                return true;
        }
        
        return false;
    }
    
    public static boolean contains(int []array, int key) {
        return contains(intToStringArray(array), String.valueOf(key));
    }
    
    public static boolean contains(char []array, char key) {
        return contains(charToStringArray(array), String.valueOf(key));
    }
    
    public static boolean contains(Object []array, Object key) {
        return contains(objectToStringArray(array), key.toString());
    }
    
    public static boolean contains(double []array, double key) {
        return contains(doubleToStringArray(array), String.valueOf(key));
    }
    
    public static String[] intToStringArray(int []array) {
        String []tempArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = String.valueOf(array[i]);
        }
        return tempArray;
    }
    
    public static String[] charToStringArray(char []array) {
        String []tempArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = String.valueOf(array[i]);
        }
        return tempArray;
    }
    
    public static String[] objectToStringArray(Object []array) {
        String []tempArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = (array[i]).toString();
        }
        return tempArray;
    }
    
    public static String[] doubleToStringArray(double []array) {
        String []tempArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = String.valueOf(array[i]);
        }
        return tempArray;
    }
    
    public static void shuffleArray(String []array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
          int index = rnd.nextInt(i + 1);
          // Simple swap
          String a = array[index];
          array[index] = array[i];
          array[i] = a;
        }
    }
    
    public static void shuffleArray(int []array) {
        shuffleArray(intToStringArray(array));
    }
    
    public static void shuffleArray(char []array) {
        shuffleArray(charToStringArray(array));
    }
    
    public static void shuffleArray(double []array) {
        shuffleArray(doubleToStringArray(array));
    }
    
    public static void shuffleArray(Object []array) {
        shuffleArray(objectToStringArray(array));
    }
}