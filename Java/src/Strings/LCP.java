package Strings;


import java.util.ArrayList;

/*
Longest Common Prefix In the array of string
 */

/**
 *
 * @author KK Davara
 */
public class LCP {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
          return "";
        if(strs.length==1)
          return strs[0];
        if(strs[0].equals(""))
              return "";
        ArrayList<String> list=new ArrayList<String>();
        list.add("");
        for(int i=0;i<strs[0].length();i++) {
            list.add(strs[0].substring(0,i+1));
        }
        int j=0;
        for(int i=1;i<strs.length;i++) {
            if(list.size()<1)
                     break;
            if(strs[i].equals(""))
            {
                  return "";
            }
            if((list.get(list.size()-1)).equals(strs[i])) 
              continue;
            while(strs[i].length()<list.get(list.size()-1).length()) {
                list.remove(list.size()-1);
            }
            j=(list.get(list.size()-1)).length();
            while(!((strs[i].substring(0,j)).equals(list.get(list.size()-1))) )//&&(list.size()-1)>1 && j>1) 
            {
                //j--;
                list.remove(list.size()-1);
                j=(list.get(list.size()-1)).length();
                if(list.size()<1)
                     break;
            }
        }
        if(list.size()==0)
             return "";
    return list.get(list.size()-1);    
    }
    public static void main(String[] args) {
       String strs[]={"flower","flight","flow"};
       System.out.println(longestCommonPrefix(strs));
    }
    
}
