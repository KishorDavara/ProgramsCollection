package Strings;

/**
 *
 * @author KK Davara
 */
public class CountAndSay {

    public static String countAndSay(int n) {
       if(n==0) 
         return "";
       if(n==1) 
          return "1";
       StringBuilder str=new StringBuilder("11");
       StringBuilder ans=new StringBuilder();
       if(n==2)
          return str.toString();
       int i=3;
       char prev=0;
       int count=0;
       while(i<=n) {
           ans=new StringBuilder("");
           prev=str.charAt(0);
           count=1;
           for(int j=1;j<str.length();j++) {
              if(prev==str.charAt(j))
              {
                count++;  
              }
              else{
                 ans.append(count+"").append(prev+"");
                 count=1;
                 prev=str.charAt(j);
              }
           }
           ans.append(count+"").append(prev+"");
           str=new StringBuilder(ans);
           //str=ans;     Not using this because it copy the refernce of ans from into str so str will also change when ans change 
           i++;
       }
     return ans.toString();      
    }
    public static void main(String[] args) {
     System.out.println(countAndSay(6));
    }
    
}
