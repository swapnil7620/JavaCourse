/*
 * class MyThread extends Thread{
 * public void run(){
 * for(int i=0;i<5;i++)
 * {
 * System.out.println("child Thread " + i);
 * }
 * }
 * }
 * public class MultiThreading {
 * 
 * public static void main(String[]args){
 * MyThread t=new MyThread();//Instantiation of Thread
 * // t.start();//starting of Thread
 * t.run();//execution is followed by (order of execution)//output provided by
 * main Thread
 * for(int i=5;i<10;i++)
 * {
 * System.out.println(" Main Thread " + i);
 * }
 * 
 * }
 * }
 * 
 */
/*
 * //overloading of run method//highly recommended
 * 
 * class MyThread extends Thread{
 * public void run(){
 * System.out.println("no- args Child method");
 * }
 * public void run(int i){
 * System.out.println(" with args Parent method");
 * }
 * }
 * class MultiThreading{
 * 
 * public static void main(String[] args) {
 * MyThread t=new MyThread();
 * t.start();//by default no -args method will call
 * //t.run(1); //explicitly need to call
 * 
 * 
 * }
 * }
 */
/*
 * //without overriding run method//not recommended//missuse of multithreading
 * 
 * class MyThread extends Thread{
 * 
 * }
 * class MultiThreading{
 * 
 * public static void main(String[] args) {
 * MyThread t=new MyThread();
 * t.start();//by default no -args method will call
 * //t.run(1); //explicitly need to call
 * 
 * 
 * }
 * }
 */

/* overriding of start method */

// In which child method does not get chance so start method will executed just
// like normal method
// It is not recommended to overriding start method
/*
 * class MyThread extends Thread{
 * public void start(){
 * System.out.println("start method");
 * }
 * public void run(){
 * System.out.println("run method");
 * }
 * 
 * }
 * class MultiThreading{
 * 
 * public static void main(String[] args) {
 * MyThread t=new MyThread();
 * t.start();
 * System.out.println("main method");
 * 
 * 
 * }
 * }
 * 
 */
// using super keyword//super.start
/*
 * class MyThread extends Thread{
 * public void start()
 * {
 * super.start();
 * System.out.println("start method");
 * }
 * public void run()
 * {
 * 
 * System.out.println("run method");
 * }
 * 
 * }
 * class MultiThreading{
 * 
 * public static void main(String[] args) {
 * MyThread t=new MyThread();
 * t.start();
 * System.out.println("main method");
 * 
 * 
 * }
 * }
 * 
 */
// Defining thread by using Runnable Interface
/*
 * class MyThread implements Runnable {
 * public void run() {
 * for (int i = 0; i < 5; i++) {
 * System.out.println("Child Thread " + i); //executed by child method
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * MyThread MT = new MyThread();
 * // Thread T = new Thread(MT);
 * Thread T1=new Thread();
 * // T1.start();
 * // T.start();//recommended to use its gives advantage of Thread
 * // T.run();//not recommended as its follows order of an execution
 * for(int i = 0; i < 5; i++) {
 * System.out.println("Main Thread " + i);//executed by main thread
 * }
 * }
 * }
 */

// getting and setting the name of a Thread
/*
 * class MyThread extends Thread{
 * 
 * }
 * class MultiThreading{
 * public static void main(String[] args) {
 * System.out.println(Thread.currentThread().getName());//current thread name
 * will display as main
 * MyThread MT=new MyThread();
 * MyThread MT1=new MyThread();
 * System.out.println(MT.getName()); //default name given by Jvm
 * System.out.println(MT1.getName());//default name given by Jvm
 * Thread.currentThread().setName("swapnil");//Use To set the name explicitly
 * System.out.println(Thread.currentThread().getName());
 * 
 * }
 * }
 */

// Thread Priority

// class MyThread implement Runnable
/*
 * class MyThread extends Thread{
 * public void run()
 * {
 * 
 * 
 * }
 * 
 * }
 * class MultiThreading {
 * 
 * public static void main(String[] args) {
 * // System.out.println(Thread.currentThread().getPriority());
 * Thread.currentThread().setPriority(10);
 * System.out.println(Thread.currentThread().getPriority());
 * MyThread MT=new MyThread();
 * 
 * System.out.println(MT.getPriority());
 * 
 * }
 * }
 */
/*
 * class MyThread extends Thread{
 * public void run(){
 * for(int i=0;i<5;i++){
 * System.out.println("Child Thread " );
 * }
 * }
 * }
 * 
 * class MultiThreading{
 * public static void main(String[] args) {
 * MyThread MT=new MyThread();
 * MT.setPriority(10);
 * MT.start();
 * for (int i=0;i<5;i++)
 * {
 * System.out.println("Main Thread " );
 * }
 * }
 * }
 */
/*
 * class MyThread extends Thread {
 * public void run() {
 * for (int i = 0; i < 10; i++) {
 * System.out.println("child thread");
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * MyThread t = new MyThread();
 * t.setPriority(10);
 * t.start();
 * for (int i = 0; i < 10; i++) {
 * System.out.println("main thread");
 * }
 * }
 * }
 */

// Thread Yield() function //some OS my not support this functionality
/*
 * class MyThread extends Thread {
 * public void run() {
 * for (int i = 0; i < 10; i++) {
 * System.out.println("child thread");
 * //Thread.yield();
 * }
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * MyThread t = new MyThread();
 * // t.setPriority(10);
 * t.start();
 * for (int i = 0; i < 10; i++) {
 * System.out.println("main thread");
 * }
 * }
 * }
 */

// join() method must with sleep()
/*
 * class MyThread extends Thread{
 * public void run()
 * {
 * for( int i=0;i<=5;i++)
 * {
 * System.out.println("Child Thread "+ i);
 * 
 * try
 * {
 * Thread.sleep(2000);
 * }
 * catch( InterruptedException E)
 * {
 * 
 * }
 * 
 * }
 * }
 * }
 * class MultiThreading {
 * public static void main(String[] args) throws InterruptedException
 * {
 * MyThread MT=new MyThread();
 * MT.start();
 * //MT.join(10000);
 * for( int i=0;i<=5;i++)
 * {
 * System.out.println("Main Tread "+ i);
 * }
 * }
 * }
 * 
 */

// join() method with sleep ( Waiting for child Thread until Main Thread is
// completed )

/*
 * class MyThread extends Thread{
 * 
 * static Thread MT;
 * public void run() {
 * try
 * {
 * MT.join();
 * }
 * catch( InterruptedException E){}
 * for (int j=0;j<5;j++){
 * System.out.println("Child Thread  " + j );
 * 
 * }
 * 
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) throws InterruptedException
 * {
 * MyThread.MT=Thread.currentThread();
 * MyThread T=new MyThread();
 * T.start();
 * // T.join(); removing this comment deadlock will occure
 * 
 * for(int i=0;i<5;i++)
 * {
 * System.out.println("Main Thread "+ i);
 * Thread.sleep(2000);
 * }
 * }
 * }
 */

// sleep() Method
/*
 * 
 * class MultiThreading{
 * public static void main(String[] args) throws InterruptedException
 * {
 * for(int i=0;i<5;i++){
 * System.out.println(" Slide No " + i);
 * Thread.sleep(5000);
 * }
 * }
 * }
 */
/*
 * class MultiThreading {
 * public static void main(String[] args) throws InterruptedException {
 * System.out.println("M");
 * Thread.sleep(3000);
 * System.out.println("E");
 * Thread.sleep(3000);
 * System.out.println("G");
 * Thread.sleep(3000);
 * System.out.println("A");
 * }
 * }
 */
/*
 * class MyThread extends Thread{
 * public void run(){
 * try
 * {
 * for (int i=0;i<5;i++)
 * {
 * System.out.println("Child Thread "+ i);
 * Thread.sleep(2000);
 * }
 * }
 * catch( InterruptedException e){
 * System.out.println("I got interrupted");
 * }
 * 
 * }
 * }
 * 
 * class MultiThreading{
 * public static void main(String[] args) {
 * MyThread MT=new MyThread();
 * MT.start();
 * MT.interrupt(); // loop will get execute for each iteration
 * System.out.println("End of the Method");
 * }
 * }
 * 
 */

// Synchornization
// without Synchornization

/*
 * class Display{
 * public void wish(String Name)
 * {
 * for( int i=0;i<5;i++)
 * {
 * System.out.print("Good Morning : ");
 * try
 * {
 * Thread.sleep(2000);
 * }
 * catch(InterruptedException E){}
 * System.out.println(Name);
 * }
 * }
 * }
 * public class MultiThreading{
 * public static void main(String[] args) {
 * Display D=new Display();
 * D.wish("Dhoni");
 * D.wish("Yuvraj");
 * }
 * }
 * 
 */

// with Synchornization
/*
 * class Display{
 * public synchronized void wish(String Name)
 * {
 * for( int i=0;i<2;i++)
 * {
 * System.out.print("Good Morning : ");
 * try
 * {
 * Thread.sleep(2000);
 * }
 * catch(InterruptedException E){}
 * System.out.println(Name);
 * }
 * }
 * }
 * 
 * class MyThread extends Thread{
 * Display d;
 * String Name;
 * MyThread(Display d,String Name){
 * this.d=d;
 * this.Name=Name;
 * }
 * public void run(){
 * d.wish(Name);
 * }
 * }
 * public class MultiThreading{
 * public static void main(String[] args) {
 * Display d=new Display();
 * Display d1=new Display();
 * MyThread MT=new MyThread(d,"Dhoni");
 * // MyThread MT1=new MyThread(d1,"Yuvraj");//irregular output will be
 * display,Synchornization is not required
 * MyThread MT2=new MyThread(d,"Kohli");
 * //MyThread MT3=new MyThread(d1,"Raina");//irregular output will be
 * display,Synchornization is not required//resolve using static synchronizes as
 * in below example
 * MT.start();
 * MT1.start();
 * MT2.start();
 * MT3.start();
 * }
 * }
 */

// static Synchornization

/*
 * class Display{
 * public static synchronized void wish(String Name)
 * {
 * for( int i=0;i<2;i++)
 * {
 * System.out.print("Good Morning : ");
 * try
 * {
 * Thread.sleep(2000);
 * }
 * catch(InterruptedException E){}
 * System.out.println(Name);
 * }
 * }
 * }
 * 
 * class MyThread extends Thread{
 * Display d;
 * String Name;
 * MyThread(Display d,String Name){
 * this.d=d;
 * this.Name=Name;
 * }
 * public void run(){
 * d.wish(Name);
 * }
 * }
 * public class MultiThreading{
 * public static void main(String[] args) {
 * Display d=new Display();
 * Display d1=new Display();
 * MyThread MT=new MyThread(d,"Dhoni");
 * MyThread MT1=new MyThread(d1,"Yuvraj");//irregular output will be
 * display,Synchornization is not required
 * MyThread MT2=new MyThread(d,"Kohli");
 * MyThread MT3=new MyThread(d1,"Raina");//irregular output will be
 * display,Synchornization is not required
 * MT.start();
 * MT1.start();
 * MT2.start();
 * MT3.start();
 * }
 * }
 * 
 */

// Synchronized Block
/*
 * class Display {
 * public void wish(String Name) { //make sure its cannot be static
 * synchronized(this){
 * for (int i = 0; i < 5; i++) {
 * System.out.print("Good Morning : ");
 * try{
 * Thread.sleep(2000);
 * }
 * catch(InterruptedException E) {}
 * System.out.println(Name);
 * 
 * 
 * }
 * }
 * }
 * }
 * 
 * class MyThread extends Thread {
 * Display d;
 * String Name;
 * 
 * MyThread(Display d, String Name) {
 * this.d = d;
 * this.Name = Name;
 * }
 * 
 * public void run() {
 * d.wish(Name);
 * }
 * }
 * 
 * public class MultiThreading {
 * public static void main(String[] args) {
 * Display d = new Display();
 * MyThread MT = new MyThread(d, "Dhoni");
 * MyThread MT2 = new MyThread(d, "Kohli");
 * MT.start();
 * MT2.start();
 * 
 * }
 * }
 */

// To get class level lock we have to declare synchronized block as follows
/*
 * class Display {
 * public void wish(String Name) { // make sure its cannot be static
 * synchronized (Display.class) {
 * for (int i = 0; i < 5; i++) {
 * System.out.print("Good Morning : ");
 * try {
 * Thread.sleep(2000);
 * } catch (InterruptedException E) {
 * }
 * System.out.println(Name);
 * 
 * }
 * }
 * }
 * }
 * 
 * class MyThread extends Thread {
 * Display d;
 * String Name;
 * 
 * MyThread(Display d, String Name) {
 * this.d = d;
 * this.Name = Name;
 * }
 * 
 * public void run() {
 * d.wish(Name);
 * }
 * }
 * 
 * public class MultiThreading {
 * public static void main(String[] args) {
 * Display d = new Display();
 * MyThread MT = new MyThread(d, "Dhoni");
 * MyThread MT2 = new MyThread(d, "Kohli");
 * MT.start();
 * MT2.start();
 * 
 * }
 * }
 */

// Internal Thread Communication wait(),notify(),notifyAll()

// Example is best to understand start ,join, sleep
// good work you done here using join by self // but not recommended
/*
 * 
 * class MultiThreadingB extends Thread{
 * int Total=0;
 * public void run()
 * {
 * for (int i=0;i<=100;i++)
 * {
 * Total=Total+i;
 * }
 * }
 * }
 * 
 * class MultiThreading{
 * public static void main(String[] args) throws InterruptedException
 * {
 * MultiThreadingB A = new MultiThreadingB();
 * 
 * A.start();
 * //A.join();//BOTH work ,perform same work but both has different
 * functionality//not recommended
 * // A.sleep(1000);//BOTH work, perform same work but both has different
 * functionality//not recommended
 * System.out.println(A.Total);
 * }
 * }
 * 
 */
/*
 * class MultiThreadingB extends Thread{
 * int Total=0;
 * public void run()
 * {
 * for (int i=0;i<=100;i++)
 * {
 * Total=Total+i;
 * }
 * }
 * }
 * 
 * class MultiThreading{
 * public static void main(String[] args) throws InterruptedException
 * {
 * MultiThreadingB A = new MultiThreadingB();
 * A.start();
 * // A.sleep(1000);//one second //using sleep for wating updation is not good
 * used we not required this much amount of time
 * // A.sleep(100);//100 milesecond
 * // A.sleep(10);//10 milisecond
 * // A.sleep(1);//one milisecond
 * A.sleep(0,1);// zero milisecond ,1 nano second
 * System.out.println(A.Total);
 * }
 * }
 * 
 */

/*
 * //wait(),notify(),notifyAll()
 * 
 * class MultiThreadingB extends Thread {
 * int Total = 0;
 * 
 * public void run() {
 * synchronized (this) {
 * System.out.println("Child thread start calculating");
 * for (int i = 0; i <= 100; i++) {
 * Total = Total + i;
 * }
 * 
 * System.out.println("Child thread giving notification");
 * this.notify();
 * //this.notifyAll();//use to notify of all threads of perticular object
 * }
 * 
 * }
 * }
 * 
 * 
 * class MultiThreading {
 * public static void main(String[] args) throws InterruptedException {
 * MultiThreadingB A = new MultiThreadingB();
 * A.start();
 * // Thread.sleep(1000); //use wait(100) if main thread want to sleep as
 * mention
 * // below
 * 
 * synchronized (A) {
 * System.out.println("Main thread trying to call wait method");
 * A.wait();
 * // A.wait(1000);//Time bound is always good programing practice
 * System.out.println("Main thread got notification");
 * System.out.println(A.Total);
 * 
 * }
 * }
 * }
 * 
 */

// DeadLock

/*
 * class A {
 * public synchronized void D1(B b) {
 * System.out.println("Thread t1 start executing D1( B b) method");
 * try {
 * Thread.sleep(2000);
 * } catch (InterruptedException E) {
 * }
 * System.out.println("Thread t1 trying to call B's last method");
 * b.last();
 * }
 * 
 * public synchronized void last() {
 * System.out.println("inside a this is last method");
 * }
 * }
 * 
 * class B {
 * public synchronized void D2(A a) {
 * System.out.println("Thread t2 start executing D2(A a)");
 * try {
 * Thread.sleep(2000);
 * } catch (InterruptedException E) {
 * }
 * System.out.println("Thread t2 trying to call A'a last method");
 * a.last();
 * }
 * 
 * public synchronized void last() {
 * System.out.println("inside b this is last method");
 * }
 * }
 * 
 * class MultiThreading extends Thread {
 * A a = new A();
 * B b = new B();
 * 
 * public void m1()
 * {
 * this.start();
 * a.D1(b);
 * }
 * 
 * public void run() {
 * b.D2(a);
 * }
 * public static void main(String[]args) {
 * 
 * MultiThreading MT = new MultiThreading();
 * MT.m1();
 * }
 * }
 * 
 */

// Deamon Thread
/*
 * 
 * class MyThread extends Thread {
 * public void run() {
 * for (int i = 0; i <= 10; i++) {
 * System.out.println("MyThread " + i);
 * try {
 * Thread.sleep(2000);
 * } catch (InterruptedException e) {
 * }
 * // System.out.println("MyThread " + i );
 * 
 * }
 * 
 * }
 * }
 * 
 * class MultiThreading {
 * public static void main(String[] args) {
 * 
 * MyThread MT = new MyThread();
 * System.out.println(MT.isDaemon()); // false
 * MT.setDaemon(true);// To make a Deamon Thread
 * // MT.setDaemon(false);//To revoke as Deamon Thread
 * System.out.println(MT.isDaemon());// true
 * MT.start();
 * System.out.println("Main Thread ");
 * 
 * System.out.println(Thread.currentThread().isDaemon());// false
 * 
 * // Thread.currentThread().setDaemon(true);//illegalThreadstate exception will
 * // occure
 * 
 * // Thread.currentThread().setDaemon(false);//illegalThreadstate exception
 * 
 * }
 * }
 * 
 */

// Enhancement in MultiThreading

/*
 * public class MultiThreading{
 * public static void main(String[] args) {
 * System.out.println(Thread.currentThread().getThreadGroup().getName());
 * System.out.println(Thread.currentThread().getThreadGroup().getParent().
 * getName());
 * ThreadGroup TG = new ThreadGroup("MyThread_Group");
 * System.out.println(TG.getParent().getName());
 * }
 * }
 */

// coustmized group name
/*
 * public class MultiThreading{
 * public static void main(String[] args) {
 * // System.out.println(Thread.currentThread().getThreadGroup().getName());
 * ThreadGroup TG = new ThreadGroup("MyThread");
 * System.out.println(TG.getParent().getName());
 * ThreadGroup TG1=new ThreadGroup(TG, "FirstThread");
 * System.out.println(TG1.getParent().getName());
 * }
 * }
 * 
 */

// TO set the priority and many more
/*
 * 
 * public class MultiThreading{
 * public static void main(String[] args) {
 * ThreadGroup g1 = new ThreadGroup("MyThread");
 * Thread t1=new Thread(g1,"Thread1");
 * Thread t2=new Thread(g1,"Thread2");
 * g1.setMaxPriority(4);
 * Thread t3=new Thread(g1,"Thread3");
 * // System.out.println(TG.getParent().getName());
 * System.out.println(t1.getPriority());
 * System.out.println(t2.getPriority());
 * System.out.println(t3.getPriority());
 * System.out.println(g1.activeGroupCount());
 * g1.list();
 * }
 * }
 * 
 */

/*
 * class MultiThreading{
 * public static void main(String[] args) {
 * 
 * ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
 * Thread[] t = new Thread[system.activeCount()];
 * system.enumerate(t);
 * for(Thread t1:t)
 * {
 * System.out.println(t1.getName() +"...."+ t1.isDaemon());
 * }
 * }
 * }
 * 
 */

// LOCK(I), ReentrantLock(c):

// How to use ReentrantLock //

/*
* import java.util.concurrent.locks.*;

 class MultiThreading {
  public static void main(String[] args) {
  ReentrantLock RL=new ReentrantLock(true);
  RL.lock();
  RL.lock();
  System.out.println(RL.isLocked());//True
  System.out.println(RL.isHeldByCurrentThread());//True
  System.out.println(RL.getHoldCount());//2
  System.out.println(RL.getQueueLength());//0
  
  
  RL.unlock();
  
  System.out.println(RL.isLocked());//True
  System.out.println(RL.isHeldByCurrentThread());//True
  System.out.println(RL.getQueueLength());//0
  
  // RL.unlock();
  
  System.out.println(RL.isLocked());//False
  System.out.println(RL.isHeldByCurrentThread());//False
  System.out.println(RL.isFair());//False
  
  
 
  }
  }
  
 */

/* 
import java.util.concurrent.locks.*;
class Display {
   ReentrantLock RE=new ReentrantLock();
   public   void wish(String Name)  {
       RE.lock();
       for (int i = 0; i < 5; i++) {
           System.out.print("Good Morning " );
           try {
               Thread.sleep(2000);
           } catch (InterruptedException E) {
           }
           System.out.println(Name);
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
           System.out.println("Thanks a lot swapnil");
       }
        RE.unlock();
   }
}
class MyThread extends Thread {
   Display D;
   String Name;
   MyThread(Display D, String Name) {
       this.D= D;
       this.Name = Name;
   }
   public void run() {
       D.wish(Name);
   }
}
class MultiThreading {
   public static void main(String[] args) {
       Display D = new Display();
       MyThread MT1 = new MyThread(D, " Dhoni");
       MyThread MT2 = new MyThread(D, " Rohit");
       MyThread MT3 = new MyThread(D, " Yuvraj");
       MT1.start();
       MT2.start();
       MT3.start();
   }
}

*/

//Demo program for try-lock method

/* 
import java.util.concurrent.locks.*;

class MyThread extends Thread{
   static  ReentrantLock RE=new ReentrantLock();
    MyThread(String Name)
    {
        super(Name);
    }
    public void run()
    {
         if(RE.tryLock())
          {
           System.out.println(Thread.currentThread().getName()+ "got lock and performing safe operation");
           try
           {
                Thread.sleep(2000);
           }
           catch(InterruptedException E){}
           RE.unlock();
         }  
         else
             {
              System.out.println(Thread.currentThread().getName()+ " Unable to get a lock performing alternative operation");
            }
    }
} 
class MultiThreading {
    public static void main(String[] args) {
        MyThread m1=new MyThread("First Thread");
        MyThread m2=new MyThread("Second Thread");
        m1.start();
        m2.start();
    }
}

 */

// try-lock with TimeBound
/* 
import java.util.concurrent.*;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{
    static  ReentrantLock RE=new ReentrantLock();
     MyThread(String Name)
     {
         super(Name);
     }
     public void run()
     {
        do{
            try{
                if(RE.tryLock(3000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + "this thread releases the lock");
                    RE.unlock();
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName() + "this thread is trying and waiting for to get the lock ");
                }
              }
               catch(InterruptedException E){}
            }
        while(true);    
    }
}
 
class MultiThreading{
    public static void main(String[] args) {
        MyThread MT1=new MyThread("First Thread ");
        MyThread MT2=new MyThread("Second Thread ");
        MT1.start();
        MT2.start();
    }
}

*/

// Thread Pool 

/* 
import java.util.concurrent.*;
class PrintJob implements Runnable{
    String name;
    PrintJob(String name){  
        this.name= name;
     }
       public void run(){
          System.out.println(name + " ....JOB started by Thread "+Thread.currentThread().getName());
         try{
             Thread.sleep(4000);
         }
         catch(InterruptedException E){}
    
         System.out.println(name + ".... JOB executed succesfully By Thread "+ Thread.currentThread().getName());
    }
}
class MultiThreading{      
    public static void main(String[] args) {
        PrintJob[] jobs={
            new PrintJob("swapnil"),
            new PrintJob("Nishant"),
            new PrintJob("Suyog"),
            new PrintJob("Mihir"),
            new PrintJob("Harshal"),
            new PrintJob("Chetan")};
            ExecutorService Service = Executors.newFixedThreadPool(2);  

        for(PrintJob job :jobs){
            Service.submit(job);
        }
        Service.shutdown();

    }       
    
}
   
*/

//callable and future
/* 
import java.util.concurrent.*;
 class MyCallable implements Callable {
    int num;
    MyCallable(int num) {
        this.num = num;
    }
    public Object call() throws Exception 
    {
        System.out.println(Thread.currentThread().getName()+ "is responsible to find sum of first "+ num + "Number");
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}
class MultiThreading {
    public static void main(String[] args) throws Exception {
        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40)};

        ExecutorService service = Executors.newFixedThreadPool(2);
        for(MyCallable job : jobs) {
            Future f = service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}

*/
//Thread Local
/* 
class MultiThreading{
    public static void main(String[] args)  {
        ThreadLocal TL=new ThreadLocal()
        {
             public Object initialValue()
             {
                return "Swapnil";
             }
        };

        System.out.println(TL.get());
        TL.set("Durga");
        System.out.println(TL.get());
        TL.remove();
        System.out.println(TL.get());
    }
}
*/

/* 
// use to generate the id for each new Thread

class Customer extends Thread {
    static Integer custId = 0;
    private static ThreadLocal TL=new ThreadLocal(){
        protected Integer initialValue(){
            return ++ custId;
        }
    };
     Customer(String Name) {
        super(Name);
    }
     public void run(){
    System.out.println(Thread.currentThread().getName() + "Executing Current Thread ID " + TL.get());
  }
}
  class MultiThreading{
     public static void main(String[] args) {
        Customer c1=new Customer("Current coustmer -1 ");
        Customer c2=new Customer("Current coustmer - 2 ");
        Customer c3=new Customer("Current coustmer - 3 ");
        Customer c4=new Customer("Current coustmer - 4 ");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
     }
  }
*/
 

/*  

class ParentThread extends Thread { 	 
	public static InheritableThreadLocal tl = new InheritableThreadLocal() { 
		public Object childValue(Object parentValue) 
		{ 
			return "CC"; 
		} 
	}; 
	public void run() 
	{ 
		tl.set("PP"); 
		System.out.println("Parent Thread Value :" + tl.get()); 
		ChildThread CT = new ChildThread(); 
		CT.start(); 
	} 
} 
class ChildThread extends Thread { 
	public void run() 
	{ 
		System.out.println("Child Thread Value :" + ParentThread.tl.get()); 
	} 
} 
class MultiThreading { 

	public static void main(String[] args) 
	{ 
		ParentThread pt = new ParentThread(); 
		pt.start(); 
	} 
} 

*/