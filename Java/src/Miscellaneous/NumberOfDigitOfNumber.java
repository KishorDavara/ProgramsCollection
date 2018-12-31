package Miscellaneous;
/**
 *
 * @author KK Davara
 */
public class NumberOfDigitOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double num=456547897;
       int digit=(int)Math.log10(num)+1;
       System.out.println("Number of digit of the given number is:"+digit);
    }
    
}
