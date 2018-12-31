package DynamicProgramming;

/**
 *
 * @author KK Davara
 */
public class MinJumpToReachEnd {

    /**
     * @param args the command line arguments
     */
    public int minJump(int []a,int []result) {
     int jump[]=new int[a.length];
     for(int i=1;i<a.length;i++) {
         jump[i]=Integer.MAX_VALUE;
     }
     
     for(int i=1;i<a.length;i++) {
         for(int j=0;j<i;j++) {
             if(a[j]+j>=i) {
                 if(jump[i]>jump[j]+1) {
                 //jump[i]=Math.min(jump[i],jump[j]+1);
                     jump[i]=jump[j]+1;                 
                     result[i]=j;
                }
             }
         }
     }
    
     return jump[a.length-1];
    }
    public static void main(String[] args) {
       // int []input={2,3,1,1,2,4,2,0,1,1};
        int []input={10,0,1,1,0};
        int []result=new int[input.length];
        MinJumpToReachEnd mj=new MinJumpToReachEnd();
        int minjump=mj.minJump(input,result);
        System.out.println("Minimum jump required to reach end is "+minjump);
        System.out.println("Steps are: ");
        int i=result.length-1;
        while(i>0) {
            System.out.println(result[i]);
            i=result[i];
        }
    }
    
}
