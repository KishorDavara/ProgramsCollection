package Stack;
import java.util.Stack;
/**
 *
 * @author KK Davara
 * @param <E>
 */
public class SpecializedStack_GetMin<E> {
   private final Stack<E> original;
   private final Stack<E> auxilliary;
   public SpecializedStack_GetMin()
   {
       original=new Stack<>();
       auxilliary=new Stack<>();
   }
   public void push(E val)
   {
     if(original.isEmpty()) {
         original.push(val);
         auxilliary.push(val);
     }
     else {
         original.push(val);
         E y=auxilliary.pop();
         auxilliary.push(y);
         if(Integer.parseInt(val+"")<=Integer.parseInt(y+"")) {
          auxilliary.push(val);
         }
         
     }
   }
   
   public E pop()
   {
     E x=original.pop();
     E y=auxilliary.pop();
     if(y!=x) {
         auxilliary.push(y);
     }
     return x;
   }
   
   public boolean isEmpty()
   {
       return original.empty() && auxilliary.empty();
   }
   
   public E getMin()
   {
       return auxilliary.peek();
   }
   
    public static void main(String[] args) {
        SpecializedStack_GetMin<Integer> stack=new SpecializedStack_GetMin<>();
        stack.push(18);
        stack.push(19);
        System.out.println("Minimum element is "+stack.getMin());
        stack.push(29);
        stack.push(15);
        stack.push(16);
        System.out.println("Minimum element is "+stack.getMin());
        System.out.println("Element deleted was "+stack.pop());
        System.out.println("Element deleted was "+stack.pop());
        System.out.println("Minimum element is "+stack.getMin());
    }
    
}
