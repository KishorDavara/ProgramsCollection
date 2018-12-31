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
class ExceptionA extends java.lang.Exception {}
class ExceptionB extends java.lang.Exception {}
class ExceptionC extends ExceptionA {}
//Note Class java.lang.Exception is a checked exception
class P7 {
public static void main(String[] args) {
try {
method1(11, 9);
method1(11, 19);
}
catch(ExceptionC e) { System.out.println("ExceptionC"); }
catch(ExceptionB e) { System.out.println("ExceptionB"); }
catch(ExceptionA e) { System.out.println("ExceptionA"); }
catch(Exception e) { System.out.println("Exception"); }
}
public static void method1(int x, int y) throws Exception {
method2(x, y);
}
public static void method2(int x, int y) throws ExceptionB,ExceptionC{
if (x < y ) throw new ExceptionB();
else if (x > y ) throw new ExceptionC();
}
//void method3() {
//throw new ExceptionC();
//}
}
