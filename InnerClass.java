
/*class University {
    class Deparment {

    }
}

class Bank {
    class Account {

    }
}
interface Map{
    interface Entry{

    }
}
*/

// Types of inner class 
//1)Normal or Regular inner class 
//2)Method local inner class 
//3) Anonymous inner class 
//4) static nested inner class

// 1)Normal or inner class

/*class Outer {
    class Inner {
    }
}
*/

/*
class InnerClass {
    class Inner {
    }
    public static void main(String[] args) {
        System.out.println(" outer Class");
    }

}
 */
/* 

//Accessing inner class code from static area of outer class:

class InnerClass {
    class Inner {
        public void m1(){
            System.out.println("Method One");
        }
    }
    public static void main(String[] args) {
       // System.out.println(" outer Class");
       /////////
       /* 
       InnerClass IC=new InnerClass();
       InnerClass.Inner I= IC.new Inner();
       I.m1();
       */
/////////
/* 
InnerClass.Inner I=new InnerClass().new Inner();
I.m1();

/////////////////

// new InnerClass().new Inner().m1();
}

}

*/

//Accessing inner class code from instance area of outer class:
/* 
class InnerClass {
    class Inner {
        public void methodOne() {
            System.out.println("inner class method");
        }
    }

    public void methodTwo() {

        Inner i = new Inner();
        i.methodOne();
    }

    public static void main(String[] args) {
        InnerClass o = new InnerClass();
        o.methodTwo();
    }
}
*/

//Accessing inner class code from outside of outor class
/* 
class Outer{
    class Inner{
        public void MethodOne(){
            System.out.println("Inner Class");
        }
    }
}
class InnerClass{
    public static void main(String[] args) {
        // Outer O=new Outer();
        // Outer.Inner OI= O.new Inner();
        // OI.MethodOne();
        //  new Outer().new Inner().MethodOne();
    }
}
*/

// From inner class we can access all members of outer class (both static and non-static,
// private and non private methods and variables) directly.

/* 
class Outer{
    int x=10;
    static int y=20;
      class Inner{
         public void M1(){
         System.out.println(x);
         System.out.println(y);
        }
    }
}

class InnerClass{
    public static void main(String[] args) {
        new Outer().new Inner().M1();
    }
}
*/
//Within the inner class ”this” always refers current inner class object. To refer current
//outer class object we have to use “outer class name.this”.
/* 
class InnerClass {
   int x = 10;
  // static y = 1;
   class Inner {
       int x = 100;
       static int y = 1;
       public void M1() {
           int x = 1000;
           System.out.println(x);
           System.out.println(this.x);
           System.out.println(Inner.this.x);
           System.out.println(InnerClass.this.x);
           System.out.println(Inner.this.y);

       }
   }
   public static void main(String[] args) {
       new InnerClass().new Inner().M1();
   }
}
*/

// Method Local Inner Classes

/* 
class InnerClass{
    int z=100;
      public void m1(){
        class Inner
        {
           public void Sum(int x,int y)
           {
                System.out.println("Sum of Num is : " +(x+y));
                System.out.println(z);
            
            }
            
        }
         Inner I=new Inner();
          I.Sum(10,10);
          I.Sum(10,20);
          I.Sum(10,30);
          I.Sum(10,40);
    }
    public static void main(String[] args) {
        InnerClass IC=new InnerClass();
        IC.m1();

    } 
 }
 */

//Anonymous inner class

// 1) Anonymous inner class which extends class

/* 
class PopCorn {
    public void Taste() {
        System.out.println("Salty");
    }
}
class InnerClass {
    public static void main(String[] args) {
        PopCorn P = new PopCorn() {
            public void Taste() {
                System.out.println("Spicy");
                
            }
        };
        
        P.Taste();
        PopCorn P1 = new PopCorn()
        //We are creating child class without name for the PopCorn class and for that child class
        // we are creating an object with Parent PopCorn reference.
        
        {
            public void Taste() {
                System.out.println("Sweet");
            }
        };
        P1.Taste(); 
        PopCorn P2 = new PopCorn();
        P2.Taste();
        
        System.out.println(P1.getClass().getName());
        System.out.println(P1.getClass().getName());
        System.out.println(P2.getClass().getName());
    }
}
*/

//Defining a Thread by extending a Thread class 
/*
class InnerClass extends Thread {
    public static void main(String[]args) throws Exception{
        InnerClass IC=new InnerClass()
        {    
            public void run(){
             for(int i=0;i<10;i++){
                System.out.println("Child Class " + i);
            }
        }
        };
        IC.start();
       // IC.join();
      // IC.yield();
        for(int i=0;i<10;i++){
            System.out.println("Main Class " + i);
        }
    }

}
 */

// Anonymous Inner Class that implements an interface
/* 
class InnerClass {
    public static void main(String[] args) throws Exception{
        Runnable R = new Runnable() {
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Child Thread " + i);
                }
            }
        };

        Thread T = new Thread(R);
        T.start();
        // T.yield();
        // T.setPriority(1);
        // T.join();
    
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread " + i);

        }
        
    }
 }
*/

// Anonymous Inner Class that define inside method arguments

/* 
class InnerClass {
    public static void main(String[] args) {
            new Thread(new Runnable() {
                public void run(){
                    for(int i=0;i<10;i++){
                        System.out.println("Child Thread " + i);
                }
             }
            }).start();
               for(int i=0;i<10;i++){
                   System.err.println("Main Method " + i);
            }
    }
}
*/

//In normal class we can write any  no of constructor but in inner class we cannot write constructor
//because name of class and constructor must be same but Anonymous inner class doesnt have any name

// Normal top level Class
//if requiredment is standard and required saveral times then we should go for normal class

//if requiredmentbis temporary then we should go for inner class 
// It best suitable for  event handling

/* 
class InnerClass{
    static class Nested{
        public void M1(){
            System.out.println("Static nested class");
        }
    }
    public static void main(String[] args) {
        InnerClass.Nested N = new  InnerClass.Nested();//Both are same
        // Nested N = new  Nested();//Both are same
         N.M1();
    }
}
*/

/*Inside static nested classes we can declare static members including main() method
also. Hence it is possible to invoke static nested class directly from the command
prompt.
 */

// Not working properly
/* 
class InnerClass {
   static class Nested {
       public static void main(String[] args) {
           System.out.println("nested class main method");
       }
   }
       public static void main(String[] args) {
       System.out.println("outer class main method");
   }
}
*/

/*
     various possible combination of nested class and interfaces

 */

// Interface inside class
/*
class InnerClass {
    public static void main(String[] args) {
        interface vechicle {
            public int getnoofwheel();
        }
        class Bus implements vechicle {
            public int getnoofwheel() {
                return 9;
            }
        }
        class Auto implements vechicle {
            public int getnoofwheel() {
                return 3;
            }
        }
        class Car implements vechicle {
            public int getnoofwheel() {
                return 4;
            }
        }
        Bus B = new Bus();
        Auto A = new Auto();
        Car C = new Car();
        System.out.println(B.getnoofwheel());
        System.out.println(A.getnoofwheel());
        System.out.println(C.getnoofwheel());
    }
}

 */