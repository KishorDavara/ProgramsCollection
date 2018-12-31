/*
 Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.

Examples:
a) For any array, rightmost element always has next greater element as -1.
b) For an array which is sorted in decreasing order, all elements have next greater element as -1.
c) For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.

Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.

  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12     -->     -1
 */
package Stack;

/**
 *
 * @author KK Davara
 */
public class NextGreaterElement {
public static void printNextGreater(int array[])
{
    StackLinkedList stack=new StackLinkedList();
    stack.push(array[0]);
    int next=0,curr=0;
    for(int i=1;i<array.length;i++) {
        next=array[i];
        if(!stack.isEmpty())
        {
          curr=stack.pop();
          while(curr<next)
          {
              System.out.println(curr+" -->"+next);
              curr=stack.pop();
              if(stack.isEmpty()) {
                  break;
              }

          }
          if(curr>next) {
              stack.push(curr);
          }
        }
        stack.push(next);
    }
    while(!stack.isEmpty())
    {
        curr=stack.pop();
        next=-1;
        System.out.println(curr+" -->"+next);
    }
}
    public static void main(String[] args) {
     int array[]={13,7,6,12,25};
        printNextGreater(array);
    }
    
}
