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
class Class3 
{
public void setX(int ax) {
x = ax;
}
public int getX() {
return x;
}
private int x;
}
class P2 {
public static void main(String[] args) {
Class3[] c3 = new Class3[5];
for (int i=1; i <= c3.length; i++) {
c3[i-1].setX(i*2);
}
for (Class3 x : c3) {
System.out.println(x.getX());
}
}
}