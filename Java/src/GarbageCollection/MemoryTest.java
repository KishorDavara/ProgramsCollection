/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollection;

import java.io.IOException;

/**
 *
 * @author KK Davara
 */
public class MemoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        r.exec("notepad");
      
        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());
        for (int i = 0; i < 10000; i++) {
            new MemoryTest();
        }
        System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: " + r.freeMemory());
    }
}
