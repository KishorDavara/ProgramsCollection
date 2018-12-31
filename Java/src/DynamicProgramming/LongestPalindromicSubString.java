package DynamicProgramming;

/**
 *
 * @author KK Davara
 */
public class LongestPalindromicSubString {

    /**
     * @param args the command line arguments
     */
    public static String longestPalindromicString(String str) {
        String result="";
        int N=str.length();
        int maxLength=1;
        int startIndex=0;
        boolean [][]table=new boolean[N][N];
        
        //Make the respective index into matrix for palindrome string of length 1
        for(int i=0;i<N;i++) {
            table[i][i]=true;
        }
        
        //Find palindrome of length 2
        for(int i=0;i<N-1;i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                table[i][i+1]=true;
                startIndex=i;
                maxLength=2;
            }
        }
        
        //Find palindrome string of length 3 to n
        //l represents length of string i represents the index of left boundary and j represents the index of right boundary
        for(int l=3;l<=N;l++) {
            for(int i=0;i<=N-l;i++) {
                int j=i+l-1;
                if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)) {
                    table[i][j]=true;
                    if(l>maxLength) {
                        maxLength=l;
                        startIndex=i;
                    }
                }
            }
        }
        
        for(int i=startIndex;i<startIndex+maxLength;i++) {
            result+=str.charAt(i);
        }
        
        System.out.println("Maxlength of the palindromic string is "+maxLength);
        return result;
    }
    public static void main(String[] args) {
        String str="abcdbefebxyzhowareyouoyerawohxyz";
        //String str="forgeeksskeegfor";
        System.out.println("Longest palindromic string is "+longestPalindromicString(str));
    }
    
}
