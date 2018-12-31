public class testThread {
 private String name;
 public testThread(String name) {
 this.name = name;
 }
 public static synchronized void staticSynchMethod() {
 System.out.print("SM1 ");
 System.out.print("SM2 ");
 }
 public synchronized void synchMethod() {
 System.out.print(name + "M1 ");
 System.out.print(name + "M2 ");
 }
 public static void main(String[] args) throws InterruptedException {
	 testThread o1 = new testThread("O1");
 Thread t1 = new Thread() {
 @Override
 public void run() {
 o1.synchMethod();
 }
 };
 Thread t2 = new Thread() {
 @Override
 public void run() {
 staticSynchMethod();
 }
 };
 Thread t3 = new Thread() {
 @Override
 public void run() {
 staticSynchMethod();
 }
 };
 t1.start();
 t2.start();
 t3.start();
 t1.join();
 t2.join();
 t3.join();
 }
}
