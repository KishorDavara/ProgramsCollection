/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollection;

/**
 *
 * @author KK Davara
 */
public class GCTest {

  public static void main(String[] args) throws InterruptedException {
		A a = new A("white");
 
		for (int i = 0; i < 10000000; i++) {
			if (i % 2 == 1) {
				a = new A("red");
			} else {
				a = new A("green");
			}
			a = null;
		}
	}
  Object x;
}
 
class A {
	private String color;
 
	public A(String color) {
		this.color = color;
	}
 
	@Override
	public void finalize() {
		System.out.println(this.color + " cleaned");
	}
}
