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
class X {
public X(int pa, int pb) { a += pa; b += pb; }
public int getA() { return a + b; }
private int a;
protected static int b;
}
class Y {
public Y(int pc, int pd) { c += pc; d += pd; }
public int getC() { return c + d; }
private int c = 10;
protected int d = 20;
}
class P6 extends X {
public static void main(String[] args) {
P6 z = new P6(11, 28);
System.out.println(z.getA()); //S1
System.out.println(z.b); //S2
System.out.println(z.x.getA()); //S3
System.out.println(z.x.b); //S4
System.out.println(z.y.d); //S5
}
public P6(int a, int b) {
super(a,b);
x = new X(a+1, b+2);
y = new Y(a+1, b+2);
}
private X x;
private Y y;
}
