package LamdaExpressions;

interface Drawable{  
    public void draw();  
}  
//A functional interface is an interface that has just one abstract method, and thus represents a single function contract.
interface Sayable{  
    public String say();  
    //public String greet(String name);  
}  

public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
      //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();
        
      //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
        
        
       //Lambda expression with no parameter.  
        Sayable s=()->            "I have nothing to say.";  
        System.out.println(s.say());  
        
        // Lambda expression with single parameter.  
//        Sayable s1=(name)->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s1.greet("Guys..!")); 
        
    }
    
}  
