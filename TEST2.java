/* 
class Parent
{
public void methodOne()
{
    System.out.println("method one");
}
}
class Child extends Parent
{
public void methodTwo()
{
    System.out.println("method two ");
}
}
 class TEST2 {
    
    public static void main(String[]args){
       // Parent P=new Parent();
        //P.methodOne();
       // P.methodTwo();// compile time error //by using parent reference child method cannot call
       
       // Child C=new Child();
           //C.methodOne();//
           //C.methodTwo();// by using child reference both parent and child method can call
       
           // Parent P=new Child();//by using parent reference we can hold child object but cannot call child specific method
          //P.methodOne();//fine
          //P.methodTwo();//error
       
           // Child C=new Parent();//child reference cannot used to hold parent objects
        
        }
}
*/
 
/*method overloading */
 /* 
class TEST2{
    public void m1()
    {
        System.out.println("no arguments");
      }
    public void m1(int i)
    {
        System.out.println("one int  arguments");
        System.out.println(i);
    }

    public void m1(double  d )
    {
        System.out.println("double arguments");
        System.out.println(d);
    }
    public void m1(String s){
        System.out.println("String arguments");
        System.out.println(s);
    }

      public static void main(String[]args){
      TEST2 T=new TEST2();
      T.m1();
      //T.m1(10);
     // T.m1('a');
      T.m1(10.5);
      T.m1(10.3);
      T.m1("swapnil");
}
}
*/
/* 
class TEST2
{
public void methodOne()
{
System.out.println("no-arg method");
}
public void methodOne(int i)
{
System.out.println("int-arg method"); 
}
public void methodOne(double d)
{
System.out.println("double-arg method");
}
public static void main(String[] args)
{
TEST2 t=new TEST2();
t.methodOne();//no-arg method
t.methodOne(10);//int-arg method
t.methodOne(10.5);//double-arg method
}
}
*/

/*case 2 child get higher priority than parent */
/* 
class TEST2{
    public void m1(Object o)
    {
        System.out.println("object arguments");
      }
    
    public void m1(String s){
        System.out.println("String arguments");
        System.out.println(s);
    }

      public static void main(String[]args){
      TEST2 T=new TEST2();
      T.m1("swapnil");// String will get executed
      T.m1(new Object());
      T.m1(null);
      }
    }

  */  
  /*case 3 */
/*String and stringBuffer has a no relation bet them both are present under the object class */
  /*class TEST2{
    
    public void m1(String S){
        System.out.println("String arguments");
        System.out.println(S);
    }
    public void m1(StringBuffer SB){
        System.out.println("StringBuffer  arguments");
        System.out.println(SB);
    }

      public static void main(String[]args){
      TEST2 T=new TEST2();
      T.m1("swapnil");// String will get executed
      T.m1(new StringBuffer("swapnilmahajan"));//StringBuffer get executed
    //  T.m1(null);//error will occure not relation betn them(String and StringBuffer)
     
      }
    }
*/
/*  case 4 general method has highest priority over var-args method  */
/* 
class TEST2
{
 public void methodOne(int x)
 {
   System.out.println("general method");
   System.out.println(x);
}
   public void methodOne(int...i)
{
    System.out.println("var-arg method");
    System.out.println(i);
}
    public static void main(String[] args)
{
   TEST2 t=new TEST2();
    t.methodOne();//var-arg method//print addred out that metod not value
     t.methodOne(10,20);//var-arg method
    t.methodOne(10);//general method

}
}
*/
/*case 5 //check code get clearity */
/* 
 class TEST2{
    public void m1(int i,float f){
        System.out.println("method first");
        System.out.println(i+" "+f);
    }
    public void m1(float f,int i){
        System.out.println("method second");
        System.out.println(f+" "+i);
    }
    public static void main(String[] args) {
        TEST2 t=new TEST2();
        //t.m1(10,10.5f);
         //t.m1(10.5f,10);
               //t.m1(10,10);/error will occure becuase of ambigity m1 method
              // t.m1(10.5f,10.5f);//error lossy conversion
    }
   
 }
  */

  /*case 5 parent class get highest priority */
  /* 
  class Animal{
  }
  class Tigher extends Animal{
    }
    class TEST2{
    public void m1(Animal A){
        System.out.println("Animal Method");
    }
    public void m1(Tigher T){
        System.out.println("Tigher Method");
    }

    public static void main(String[] args) { 
    TEST2 t=new TEST2();
    
    Animal a=new Animal();
    t.m1(a);
   
    Tigher ti=new Tigher();
    t.m1(ti);
   
    Animal a1=new Tigher();
    t.m1(a1);//parent class will get priority

    }
}
*/
/* 
/*method overriding */
/* 
class Parent{
    public void marry(){
      System.out.println("parent mathod:Subhalaxmi");
    }
}
    class Child extends Parent{
        public void marry(){
            System.out.println("child method :Tamana");
          }
        }
         public class TEST2{
            public static void main(String[]args){
            Parent p=new Parent();
            p.marry();
            Child c=new Child();
            c.marry();
            Parent p1=new Child();
            p1.marry();//child class will execute at runtime//compiler only check reference of object
            }
        }
    */
  /*method hiding (it seems to be a method overriding but if the both parent and child class conatain static method  
  then its known as method hiding) */
  /* 
    class Parent{
        public static void m1(){

        }
    }
    class child {
        public static void m1(){
     }
    }

    class TEST2{
        public static void main(String[]args){

        }
    }

   */ 

 /* 
   class Parent{
    public static void m1(){
        System.out.println("parent class");
    }
}
class Child extends Parent{
    public static void m1(){
        System.out.println("child class");
 }
}
class TEST2{
    public static void main(String[]args){
       Parent p=new Parent();
       p.m1();

       Child c=new Child();
       c.m1();

       Parent p1=new Child();
        p1.m1();//parent method will be execute(at compile time )its based on reference type which is p1)
            }
}
*/
/*oveeriding with var-ags method//(overloading check it ) */
/* 
class Parent{
    public static void m1(int...i){
        System.out.println("parent class");
    }
}
class Child extends Parent{
    public static void m1(int i){
        System.out.println("child class");
 }
}
class TEST2{
    public static void main(String[]args){
       Parent p=new Parent();
       p.m1(10);

       Child c=new Child();
       c.m1(10);//if not passing arument then result will be different//parent method will execute

       Parent p1=new Child();
        p1.m1(10);//parent methhod will execute because its overloading not overriding
            }
}

*/
/* Both method have same type of arument var=args is here in this exapmle*/
/* 
class Parent{
    public  void m1(int ..i){
        System.out.println("parent class");
    }
}
class Child extends Parent{
    public  void m1(int ..i){
        System.out.println("child class");
 }
}
class TEST2{
    public static void main(String[]args)
    {
       Parent p=new Parent();
       p.m1();

       Child c=new Child();
       c.m1();

       Parent p1=new Child();
        p1.m1();//child method will execute
  }
}

*/
/* 
class Parent{
    String s="Parent";
}
class Child extends Parent{
   String s="child";
}
class TEST2{
    public static void main(String[]args)
    {
       Parent p=new Parent();
       System.out.println(p.s);
      
       Child c=new Child();
       System.out.println(c.s);
             
       Parent p1=new Child();
       System.out.println(p1.s);//parent variable execute (because of reference(copile will take care of it ))
       //use static to non-sattic or vice versa result will be same
  }
}
*/
/* 
class TEST2
{
    int x=10;
{
   methodOne();
    System.out.println("Parent first instance block");
}
    TEST2()
{
    System.out.println("parent class constructor");
}
   public static void main(String[] args)
{
   TEST2 T1=new TEST2();
   System.out.println("parent class main method");
}
   public void methodOne()
{
   System.out.println(y);
}
   int y=20;
}
   class Child extends TEST2
{
   int i=100;
{
   methodTwo();

  System.out.println("Child first instance block");
}
  Child()
{
   System.out.println("Child class constructor");
}
  public static void main(String[] args)
{
  Child c=new Child();
  System.out.println("Child class main method");
}
   public void methodTwo()
{
  System.out.println(j);
}
{
   System.out.println("Child second instance block");
}
   int j=200;
}

*/