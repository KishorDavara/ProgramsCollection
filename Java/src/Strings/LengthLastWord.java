package Strings;

/**
 *
 * @author KK Davara
 */
public class LengthLastWord {
 public static int lengthOfLastWord(String s) {
     if(s.equals(" "))
         return 0;
      if(s.length()==1)
        return 1;
      int count=0;
      int ans=0;
      for(int i=0;i<s.length();i++) {
          if(s.charAt(i)!=' ') {
              count++;
              ans=count;
          }
          else if(s.charAt(i)==' ') {
              count=0;
          }
       }
      return ans; 
    }
    public static void main(String[] args) {
        String s="b   andf    ";
        //String s="a ";
        //String s="hello world";
        System.out.println("Length of the last word is "+lengthOfLastWord(s));
    }   
}
