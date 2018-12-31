/*
Input:"a+b*(c^d-e)^(f+g*h)-i"
Output:abcd^e-fgh*+^*+i-
 */
package Stack;

/**
 *
 * @author KK Davara
 */
public class InfixToPostfix {
   public static String postfixConversion(String infix)
   {
       String postfix="";
       StackLinkedList stack=new StackLinkedList();
       int i=0;
       while(i<infix.length())
       {
          char c=infix.charAt(i);
          if(isOperand(c)) {
              postfix+=c;
          }
          else {
              if(c=='(') {
                  stack.push(c);
              }
              else if ( c == ')' ) {
                  while ( stack.peek()!='(' && !stack.isEmpty())
                  {
                      postfix+=(char)stack.pop();
                  }
                  stack.pop();
              }
              else {
                  if(precedence(c)>precedence((char)stack.peek())) {
                      stack.push(c);
                  }
                  else {
                      while ( precedence(c)<= precedence((char)(stack.peek())) && !stack.isEmpty() ) 
                      {
                          postfix+=(char)stack.pop();
                      }
                      stack.push(c);
                  }
              }
                 
          }
          i++;
       }
       while(!stack.isEmpty()) {
           postfix+=(char) stack.pop();
       }
       return postfix;
   }
   public static boolean isOperand(char ch)
   {
      return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch>='0' && ch<='9');
   }
   public static int precedence(char a)
   {
       switch(a)
       {
           case '+':
           case '-':
                     return 1;
           case '*':
           case '/':
           case '%':
                    return 2;
           case '^':
                    return 3;
       }
       return 0;
   }
    public static void main(String[] args) {
        //String infix="a+b*(c^d-e)^(f+g*h)-i";
        //Output:abcd^e-fgh*+^*+i-
        //String infix="(4+8)*(6-5)/((3-2)*(2+2))";
        //Output:48+65-*32-22+*/
        String infix="a+b*c-d^e^f";
        System.out.println(postfixConversion(infix));
    }
    
}
