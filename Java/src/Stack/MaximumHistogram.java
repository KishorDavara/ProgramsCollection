/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import java.util.Stack;
/**
 *
 * @author KK Davara
 */
public class MaximumHistogram {

    /**
     * @param args the command line arguments
     */
    public int maxHistogram(int []a) {
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
    public static void main(String[] args) {
        MaximumHistogram mh=new MaximumHistogram();
        int input[] = {2,2,2,6,1,5,4,2,2,2,2};
        int maxarea=mh.maxHistogram(input);
        System.out.println("Maximum Histogram is "+maxarea);
        //assert maxarea==12;
    }
    
}
