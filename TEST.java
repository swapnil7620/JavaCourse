/*public class TEST {
    public static void main(String[]args){
        SUM();
        SUM(10,20);
        SUM(10,20,30);

    }

     public static void  SUM(int...x){
      int  total=0;
      for(int x1:x){
           total=total+x1;
           System.out.println("the sum of integer is  " + total);

           }

     }
    
}*/

/* 
public class TEST{
    public static void m1(int...x){
            System.out.println(" var_args method");
    }
      public static void m1(int x){
        System.out.println("General Method");
      }
    public static void main(String []args){
         m1();// var args can accept zero argument
         m1(10,20);//speciality of var-args
         m1(10);//general method get more priority rather than var-args because of comptability of language or its older than var_args
    }
}
*/

 /*  public class TEST{

    public static void main(String[]args){
      int []a={10,20,30};
      int []b={40,50,60};
       m1(a,b);
    }

   public static void m1(int[]...x){
    for( int []x1:x){
      System.out.println(x1[2]);

    }

   }

 }
*/

//Trick to print without using semicolan
/*public class  TEST{
  public static void main(String[]args){
    if(System.out.printf("its fine")==null){

    }

    
  }

}
*/



/* for using main method ,method hiding is possible but not overriding
 explicitly need to class ,child class inheritance,
 method  overloading is possible

 */
/* 
public class  TEST{
  public static void main(String[]args){
     System.out.println("parent class");
     
  }
   class child extends TEST{
       public static void main(String[]args){
        System.out.println(" child class");
       }

     
  }

}
*/
//COMMAND LINE ARGUMENT
//public  class TEST{
/*   public static void main(String[]args){
    int n= Integer.parseInt(args[0]);
    System.out.println("The square of given " + n  + " is " + ( n*n));
  }*/
// }
    /*final megthod cannot be overide  */
    /* 
public  class Test{
  
    public   void marriage(){
      System.out.println("subbalakshmi");
    }
  
}
class child extends Test
{
  public static void main(String[]args){
      public void marriage(){
            System.out.println("Thamanna");
}
}
}
*/

/*abstract class cannot be instantiation */

// abstract class Test{
//   public static void main(String[]args){
//     Test T1=new Test();
//   }
// }

/*Abstract class  */
/* 
 abstract class TEST{
  
           public abstract int getNoOfWheel();
     
     }
   class Bus extends TEST {
        public  int getNoOfWheel(){
         return 7;
  }
 }

*/
/*FINAL INSTANCE VARIABLE */// at the time of declearation
/* 
class TEST
{
int i;
public static void main(String args[]){
TEST t=new TEST();
System.out.println(t.i);
}}
*/
/*final instance variable */ //inside instance block 
/* 
class TEST{
  final int x;
  {
    x=10;
  }
  public static void main(String[]args){
    TEST t=new TEST();
    
  System.out.println(t.x);
}
}
*/
/* final instance  variable// inside the constructor before constructor complition */
/* 
class TEST {
  final int i;
  TEST(){
    i=10;
  }
  public static void main(String[]args){
    TEST t=new TEST();
    System.out.println(t.i);
  }
}
*/

/*final static variable // at time of declearation */
/* 
class TEST
{
final static int i=10;
public static void main(String[] args) {
  TEST t=new TEST();
  System.out.println(t.i);
}
}
*/

/*final static variable inside the Static block */
/* 
class TEST
{
final static int i;
static
{
i=10;
}
public static void main(String[]args){
  System.out.println(i);

}}
/* */
/*final local variable */
/* 
class TEST{
public static void main(String[] args) {
  final int x;
  System.out.println("All ok");
//System.out.println(x);// CE WILLL OCCURE about initialization

}
  
}
*/
/*static modifier// static variable  and difference betn STATIC VARIABLE AND INSTANCE VARIABLE*/
/*
class TEST{
  static int x=10;
  int y=20;
  public static void main(String[] args) {
    TEST t1=new TEST();
    t1.x=100;
    t1.y=200;
    TEST t2=new TEST();
    System.out.println(t1.x+" "+ t1.y);
    System.out.println(t2.x+" "+ t2.y);
  }
}
*/ 

/*for static method inheritance concept is applicable */

/*class TEST{
  public static void main(String args[]){
  System.out.println("parent main() method called");
  }
  }
  class child extends TEST{
  }
  */

/*for static method // method hiding is possible //not method overriding */
  /*class TEST{
    public static void main(String args[]){
    System.out.println("parent main() method called");
    }
    }
    class child extends TEST{
      public static void main(String args[]){
        System.out.println("child main() method called");
        }
    }
*/

/*for static method overloading is possible */
/* 
class TEST{
  public static void main(String args[]){
  System.out.println("parent main() method called");
  }
  }
  class child extends TEST{
    public static void main(int args[]){
      System.out.println("child main() method called");
      }
  }
  */

  /* interface decleare and implimentation */
  /* 
  interface inter{
    void m1();
    void m2();  
  }
  abstract class TEST implements inter{
      abstract public void m1();   
    }
    abstract class subTest extends TEST{
     abstract public void m2();   
     }
 */
/*interface variable */// decleration is expected x=10

/* 
  
  interface interface1 {
  int x=100;
  void display();
 }
  
//   interface interface2{
  
//   int x=200;
//    void display();
// }

public class TEST implements interface1{
  public void display(){
    System.out.println(x);
  }
	public static void main(String[] args)
	{
    TEST obj=new TEST();
    obj.display();
				}
}

  */
  /*constructor parent constructor will be called but Parent object won't be created */
  /* 
  class Parent{
    Parent()
    {
      System.out.println("parent class");
    System.out.println(this.hashCode());
    }
    }
    class child extends Parent{
    child(){
      System.out.println("child class");
      System.out.println(this.hashCode());
    
    }
    }
    class TEST{
    public static void main(String args[]){
    child c=new child();
    System.out.println("Test class");
    System.out.println(c.hashCode());
    }
    }
    */