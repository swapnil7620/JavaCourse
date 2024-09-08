/* 
//for Runtime stack machanism
public class Exception_Handling {

    public static void main(String[] args) {
        dostuff();
    }
    public static void dostuff(){
        doMoreStuff();
    }
   public  static void doMoreStuff(){
      System.out.println("hello");
   }
}
*/

//Default Exception Handling

/*  
public class Exception_Handling {

    public static void main(String[] args) {
        dostuff();
    }
    public static void dostuff(){
        doMoreStuff();
    }
   public  static void doMoreStuff(){
      System.out.println(10/0);
     // System.out.println(0/10);//fine
   }
}
*/
// public class Exception_Handling {

//     public static void main(String[] args) {
//         dostuff();
//     }
//     public static void dostuff(){
//         doMoreStuff();
//         System.out.println(10/0);
//     }
//    public  static void doMoreStuff(){
//       System.out.println("hello ");
     
//    }
// }

/* in different blocks  */
/* 
public class Exception_Handling {

    public static void main(String[] args) {
        dostuff();
        System.out.println(10/0);
    }
    public static void dostuff(){
        doMoreStuff();
        System.out.println("ok");
    }
   public  static void doMoreStuff(){
      System.out.println("hello ");
     
   }
}
*/
/*without try catch */
/* 
public class Exception_Handling{
    public static void main(String[] args) {
    
        System.out.println("First line");
        System.out.println(10/0);
        
    }
}

*/
/*with try catch (for Normal Termination) */
/*
public class Exception_Handling{
    public static void main(String[] args) {
    
        System.out.println("First line");
        try{
        System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(10/1);
        }
        System.out.println("Normal Termination");
    }
}

*/
//method to print exception information
/* 
public class Exception_Handling{
    public static void main(String[] args) {
    
        System.out.println("First line");
       try{
            System.out.println(10/0);
       }
       catch(ArithmeticException e){
         //e.printStackTrace();//To print all information about exception
        // System.out.println(e);//to print name and decription
        //System.out.println(e.toString());//same as above just alternative way to print
         //System.out.println(e.getMessage());//to print the decription only
       }
       System.out.println("Normal Termination");
        
    }
}
*/

/*exception handlin using (parent exception) keyword */
/* 
public class Exception_Handling{
    public static void main(String[] args) {
    
        System.out.println("First line");
        try{
        System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(10/1);
        }
        System.out.println("Normal Termination");
    }
}
*/
/*using multiple catch block */
/* 
public class Exception_Handling{
    public static void main(String[] args) {
    
        System.out.println("First line");
        try{
        System.out.println(10/0);
        }
        catch(NullPointerException e){
            System.out.println(10/1);
            System.out.println("null point exception");
        }
        catch(Exception e){
        System.out.println("Normal Termination");
        }
    }
}

*/
/*different cases */
/* 
public class Exception_Handling{
    public static void main(String[] args) {
    
        System.out.println("First line");
        try{
        System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(10/1);

        }
        catch(Exception e){
         System.out.println("compile succesfully");
        }
        System.out.println("Normal Termination");
    }
}
*/

/*Finally Block */


/*throw */
/* 
public class Exception_Handling{
    public static void main(String[] args) {
        throw new ArithmeticException("/ divide by zero");

    }
}
*/
/* 

public class Exception_Handling{
    static ArithmeticException e= new ArithmeticException();
    public static void main(String[] args) {
        throw e;

    }
}

*/
//throw keyword
/* 
public class Exception_Handling{
    static ArithmeticException e;
    public static void main(String[] args) {
        throw e;//if e refer null then we wil get NullPoint Exception

    }
}
*/
/*Example about throws */
/* 
import java.io.*;

public class Exception_Handling{
    public static void main(String[] args) {
        PrintWriter out=new PrintWriter("abc.txt");
        out.println("hello abc file");
    }
}

*/
/* EXample 2*/
/* 
public class Exception_Handling{
    public static void main(String[] args) {
       Thread.sleep(10000);

    }
  }

 */
/*By using try catch */
/* 
public class Exception_Handling{
    public static void main(String[] args) {
        try{
            Thread.sleep(10000);
        }
       catch(InterruptedException I){
         I.printStackTrace();
         System.out.println("hello");
         
       }
           System.out.println("Normal Termination");

    }
  } 
  */
/*using throws */
/* 
  public class Exception_Handling{
    public static void main(String[]args)
        throws InterruptedException  {
            Thread.sleep(5000);
            
        }
        
     }
 */ 
/*Best Example to explain//at least removing one throws we will face compile time error */
/*  
public class Exception_Handling{
    public static void main(String[]args) throws InterruptedException{
       DoStuff();
       System.out.println("hello");
    }
    public static void DoStuff() throws InterruptedException{
        System.out.println("hello Dostuff Methood");
        DoMoreStuff();
    }
    public static void DoMoreStuff() throws InterruptedException{
        Thread.sleep(3000);
    }
 }

 */


/*

class TOOYoungException extends RuntimeException{
    TOOYoungException(String s){
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
class Exception_Handling{
    public static void main(String[]args) {
        int age =Integer.parseInt(args[0]);
        if (age>60){
            throw new  TOOYoungException("Wait some time ");
        }
        else if(age<18){
            throw new TooOldException("your age is Gone");
            }

        else{
            System.out.println("now you can ready to marriage");
          }    
        }
    }

*/