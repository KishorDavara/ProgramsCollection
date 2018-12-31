package Tester;
/**
 *
 * @author KK Davara
 */
interface T1 {
public void f1(double x);
public void f2(String x);
}
 abstract class T2{
abstract void f1(double x);
public void f2(double x) {
System.out.println("T2: f2(double)- " + x );
}
}
abstract class T3 extends T2 implements T1 {
public void f1(double x) {
System.out.println("T3: f1(double)- " + x );
}
public void f2(String x) {
System.out.println("T3: f2(String)- " + x );
}
abstract public void f4(String x);
public void f1(String x) {
System.out.println("T3: f1(String)- " + x );
}
}
class T4 extends T3 {
public void f1(double x) {
System.out.println("T4: f1(double)- " + x );
}
public void f4(String x) {
System.out.println("T4: f4(String)- " + x );
}
}
interface T5 extends T1 {
public void f1(String x);
}
class T6 implements T5 {
public void f1(double x) {
System.out.println("T6: f1(double)- " + x );
}
public void f2(String x) {
System.out.println("T6: f2(String)- " + x );
}
public void f1(String x) {
System.out.println("T6: f1(String)- " + x );
}
}
public class TTester {
public static void main (String[] args) {
T1 a = new T6();
a.f1(1.1); //S1
//a.f1("Hello"); //S2
a.f2("Hello"); //S3
a=new T4();
a.f1(1.2); //S4
a.f2("Hello"); //S5
//a.f2(1.3); //S6
T3 b=new T4();
b.f1(1.4); //S7
b.f1("Hello"); //S8
b.f2("Hello"); //S9
b.f2(1.4); //S10
b.f4("Hello"); //S11
T1 bb=(T1)b;
bb.f1(1.5); //S12
T2 cc=(T2)b;
cc.f1(1.5); //S13
//cc.f4("Hello"); //S14
}
}