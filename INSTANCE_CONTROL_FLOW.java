
/*
   public class INSTANCE_CONTROL_FLOW {
 
    int i=10;{
    methodone();
    System.out.println("first instance block");
   }
     INSTANCE_CONTROL_FLOW(){
     System.out.println("parent class constructor");
   }

     public static void main(String[]args){
     INSTANCE_CONTROL_FLOW T1=new INSTANCE_CONTROL_FLOW();
    //if object is not(above is object creation) created then only main method will executed
     System.out.println("main method");
     //INSTANCE_CONTROL_FLOW T=new INSTANCE_CONTROL_FLOW();
     //if we craeted one more object then ouput will printed two times

  }
     public void methodone()
  {
    //int j=10; //0 will replace by 10 
    System.out.println(j);
  }
  {
    System.out.println("second instance block");
  }
      int j=20;
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

/* //static ,instance flow control
public class INSTANCE_CONTROL_FLOW
{
private static String methodOne(String msg)
{
System.out.println(msg);
return msg;
}
public INSTANCE_CONTROL_FLOW()
{
   m=methodOne("1");
}
{
    m=methodOne("2");
}
   String m=methodOne("3");
public static void main(String[] args)
{
Object obj=new INSTANCE_CONTROL_FLOW();
}
}
*/

/* 
public class INSTANCE_CONTROL_FLOW
{
private static String methodOne(String msg)
{
System.out.println(msg);
return msg;
}
static String m=methodOne("1");
{
m=methodOne("2");
}
static
{
m=methodOne("3");
}
public static void main(String[] args)
{
Object obj=new INSTANCE_CONTROL_FLOW();
}
}
*/

 /* 
public class INSTANCE_CONTROL_FLOW
{
private static  String methodOne(String msg)
{
  System.out.println(msg);
 return msg;
}
static String m=methodOne("1");
{
m=methodOne("2");
}
static
{
m=methodOne("3");
}
{
    m=methodOne("4");
}
public static void main(String[] args)
{
Object obj=new INSTANCE_CONTROL_FLOW();
}
}
*/
