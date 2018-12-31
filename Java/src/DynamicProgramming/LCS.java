package DynamicProgramming;
/**
 *
 * @author KK Davara
 */
public class LCS {

    /**
     X:ABCBDAB and Y:BDCABA
     LCS:BCBA
     * S1=ACCGGTCGAGTGCGCGGAAGCCGGCCGAA
     * S2=GTCGTTCGGAATGCCGTTGCTCTGTAAA
     * LCS=GTCGTCGGAAGCCGGCCGAA
     * @param args
     */
 
    public static void printLCS(int b[][],String str,int i,int j)
    {
        if(i==0 || j==0) return;
        if(b[i][j]==0)
        {
            printLCS(b,str,i-1,j-1);
            System.out.print(str.charAt(i-1));
        }
        else if(b[i][j]==1)
        {
            printLCS(b,str,i-1,j);
        }
        else
        {
            printLCS(b,str,i,j-1);
        }
        
        
    }
    public static int lcsLength(String str1,String str2)
    {
        int m,n;
        m=str1.length();
        n=str2.length();
        int c[][]=new int[m+1][n+1];
        int b[][]=new int[m+1][n+1];    
        for(int i=0;i<=m;i++)
        {
            c[i][0]=0;
            b[i][0]=0;
        }
            
        for(int j=0;j<=n;j++)
        {
            c[0][j]=0;
            b[0][j]=0;
        }
            
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    c[i][j]=c[i-1][j-1]+1;
                    b[i][j]=0;
                }
                else if(c[i-1][j]>=c[i][j-1])
                {
                    c[i][j]=c[i-1][j];
                    b[i][j]=1;
                }
                else
                {
                    c[i][j]=c[i][j-1];
                    b[i][j]=2;
                }
                    
            }
        }
        System.out.print("Longest common subsequence is ");
        printLCS(b,str1,m,n);
        return c[m][n];
    }
    public static void main(String[] args) {
     //String x="ABCBDAB",y="BDCABA";
      String x="ACCGGTCGAGTGCGCGGAAGCCGGCCGAA",
	         y="GTCGTTCGGAATGCCGTTGCTCTGTAAA";
     System.out.println("\n\nLongest Common subsequence of the string "+x
	                     +" and "+y +" is of length "+lcsLength(x,y));
    }
    
}
