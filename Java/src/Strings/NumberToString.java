package Strings;

/**
 *
 * @author KK Davara
 */
public class NumberToString {

    /**
     * @param args the command line arguments
     */
     public static void translate(String result, String rem)    {
        StringBuilder result1 = new StringBuilder(result);
        StringBuilder result2 = new StringBuilder(result);
        if("".equalsIgnoreCase(rem)) {
            System.out.println( result);
            return;
        }
        if(rem.length() >= 1) {
            int singleNum = Integer.parseInt(rem.substring(0, 1));
            if(singleNum>0)
            result1.append(Character.toChars(singleNum + 64));
            translate(result1.toString() , rem.substring(1));
        }
        if(rem.length() >= 2) {
            int doubleNum = Integer.parseInt(rem.substring(0, 2));
            if (doubleNum <= 26) {
                result2.append(Character.toChars(doubleNum+64));
                translate(result2.toString(), rem.substring(2));
            }
        }
    }
    public static void main(String[] args) {
        translate("","12258");
        System.out.println();
        //translate("","02258");
    }
    
}
