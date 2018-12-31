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
class F {
public F(int x ) {
value = x;
System.out.println("F Constructed with value: " + value);
}
private int value;
}
class P5 extends F {
public static void main(String[] args) {
P5 g = new P5(11, 28);
    System.out.println(g.value);
}
public P5(int x, int y){
super(x);
value = new F(y);
}
private F value;
}