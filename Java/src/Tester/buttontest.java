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
import java.awt.*;
class Main extends Frame{
public static void main(String argv[]){
    Main fa=new Main();
    fa.setSize(400,300);
    fa.setVisible(true);
   
}

Main(){
        add(new Button("One"));
        add(new Button("Two"));
        add(new Button("Three"));
        add(new Button("Four"));
    }//End of constructor



}//End of Application