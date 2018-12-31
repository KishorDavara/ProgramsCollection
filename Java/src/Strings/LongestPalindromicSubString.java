package Strings;
/**
 *
 * @author KK Davara
 */
public class LongestPalindromicSubString {

    /**
     * @param args the command line arguments
     */
    public static String longestPalindromic(String str) {
       if(str.length()==0)
           return "";
       if(str.length()==1)
           return str;
       String palindromicString=str.substring(0,1);
       for(int i=0;i<str.length()-1;i++) {
           String p1=findPalindromicString(str, i, i);
           if(p1.length()>palindromicString.length()) {
               palindromicString=p1;
           }
           String p2=findPalindromicString(str, i, i+1);
           if(p2.length()>palindromicString.length()) {
               palindromicString=p2;
           }
       }
       return palindromicString;
    }
    
    public static String findPalindromicString(String str,int startIndex,int endIndex) {
     int l=startIndex;
     int r=endIndex;
     while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)  )
     {
       l--;
       r++;
         //System.out.println(startIndex+" "+endIndex);
     }
     return str.substring(l+1,r-l-1);
    }
    public static void main(String[] args) {
       //String str="abcdbefebxyzhowareyouoyerawohxyz";
        String str="forgeeksskeegfor";
        System.out.println("Longest palindromic string is "+str.length()+" "+longestPalindromic(str));
    }
    
}
