/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;
/**
 *
 * @author KK Davara
 */
class X1 {
X1() { a += 10; b += 10; }
X1(int pa, int pb ) {
a += pa;
b += pb;
}
public int getA() { return a; }
static int getB() { return b; }
private int a=10;
private static int b=20;
}
class Y1 extends X1 {
Y1(int a, int b) {
super(a,b);
x = new X1(a,b);
}
public X1 getX() { return x; }
private X1 x;
}
class P9 {
public static void main(String[] args) {
P9 z = new P9(10,20);
System.out.println(z.x.getA()); //Ans:_______________
System.out.println(z.x.getB());//Ans:_______________
System.out.println(z.y.getX().getA());//Ans:____________
System.out.println(z.y.getX().getB());//Ans:____________
System.out.println(z.y.getA()); //Ans:_______________
System.out.println(z.y.getB()); //Ans:_______________
}
P9(int a, int b) {
x = new X1(a, b-2);
y = new Y1(a+2, b);
}
private X1 x;
private Y1 y;
}
