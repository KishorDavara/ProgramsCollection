/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;
import java.io.Serializable;
/**
 *
 * @author KK Davara
 */
public class Student implements Serializable{
 int id;  
 String name;  
 transient int age;//Now it will not be serialized  
 public Student(int id, String name,int age) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
 }  
}
