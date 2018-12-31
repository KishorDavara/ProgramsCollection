/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miscellaneous;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author KK Davara
 */
public class StringToDate {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
       SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
       String date="13/07/2015";
       Date d=sdf.parse(date);
        System.out.println(d);
    }
    
}
