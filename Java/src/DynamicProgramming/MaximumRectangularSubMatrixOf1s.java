/*
link:https://www.youtube.com/watch?v=g8bSdXCG-lA&list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr&index=3
*/
package DynamicProgramming;

import java.util.Stack;

/**
 *
 * @author KK Davara
 */
public class MaximumRectangularSubMatrixOf1s {

    /**
     * @param args the command line arguments
     */
     private int maxHistogram(int []a) {
     Stack<Integer> stack=new Stack<>();
     int maxArea=-1;
     int area=0;
     int top=0;
     int i;
     for(i=0;i<a.length;) {
      if(stack.empty() || a[stack.peek()]<=a[i]) {
         stack.push(i++);
      }   
      else {
          top=stack.pop();
          if(stack.empty()) {
              area=a[top]*i;
          }
          else {
              area=a[top]*(i-stack.peek()-1);
          }
          if(area>maxArea){
              maxArea=area;
          } 
      } 
     }
     
     while(!stack.empty()) {
          top=stack.pop();
          if(stack.empty()) {
              area=a[top]*i;
          }
          else {
              area=a[top]*(i-stack.peek()-1);
          }
          if(area>maxArea){
              maxArea=area;
          } 
     }
     
     return maxArea;
    }
    public int maximumSizeSubMatrix(int [][]a) {
      int maxArea=-1;
      int histogram[]=new int[a[0].length];
      int area=0;
      for(int i=0;i<a.length;i++) {
          for(int j=0;j<histogram.length;j++) {
              if(a[i][j]==0) {
                  histogram[j]=0;
              }
              else {
                  histogram[j]+=a[i][j];
              }
          }
          area=maxHistogram(histogram);
          if(area>maxArea) {
              maxArea=area;
          }
      }
      return maxArea;
    }
    public static void main(String[] args) {
        int input[][] = {{1,1,1,0},
                         {1,1,1,1},
                         {0,1,1,0},
                         {0,1,1,1},
                         {1,0,0,1},
                         {1,1,1,1}};
        MaximumRectangularSubMatrixOf1s mrs = new MaximumRectangularSubMatrixOf1s();
        int maxRectangle = mrs.maximumSizeSubMatrix(input);
        System.out.println("Maxmimum Rectangular SubMatrix Of 1s is of size "+maxRectangle);
    }
    
}
