
  //   public class OPERATOR_ {
    
    //public static void main(String[]args){
     
        /*INCREMENT AND DECREMENT OPERATORS */

        //int x=10;
        //int y=++x;//aaply incre or decre to variable only
        //int y=++10;//we cannot constant to  increment or decrement operator  
        //cannot assign to nested y=++(++x)//cannot apply to final
        //System.out.println("THE VALUE OF X is "+ y);
        //INCRE AND DECRE CANNOT APPLY TO BOOLEAN
        //apply all primitive data type Except boolean
        /* 
        char c='#';
        char ch='A';
         char B=++ch;
         double D=10.5;
         double D_inc=++D;
         System.out.println(c);
         System.out.println(B);
         System.out.println(D_inc);
        */
         /*byte NO1=10;
         byte NO2=20;
         byte TOTAL=(byte)(NO1+NO2);//Explicitly need to declare byte 
         //if we apply arithmatic opeartor to any two operand it will convert into int
         System.out.println(TOTAL);
        */
        /* 
       double no1=10;
       double no2=20;
       int total=(int)(no1+no2);cannot conver directly high to low value data type
       System.out.println(total);
       */

       /*ARITHMATIC OPERATOR */
       //System.out.println('a'+'b');// output =195 '' and " " best example of both
      // System.out.println("@");
       //System.out.print(10/0);RE
      // System.out.print(0.0/0);NAN
      // System.out.print(0/0);RE
      // System.out.print(10/0.0);//infinity,-infinity
      //  System.out.print(0.0/0);// IF RESULT IS  undefine NAN (NOT A NUMBER)
       //in float and double their is way to represent infinity
       //positive and negative infinity
       /* 
       System.out.println(10<Float.NaN);
       System.out.println(10 >Float.NaN);
       System.out.println(10 <=Float.NaN);
       System.out.println(10 >=Float.NaN);
       System.out.println(10 ==Float.NaN);
       System.out.println(10 !=Float.NaN);

     */
      /* String concatination Operator (+) */

      //if  their is at least one string varible is 
      //present the it will perform concatenation 
    //and if both arguments are num  type then it will perform Addition
      
     // String a="swapnil ", E="Mahajan";
      //int b=10,c=20,d=40;

     /*  System.out.println(a+b+c+d);
      System.out.println(d+b+c+a);
      System.out.println(b+a+c+d);
      System.out.println(a+c+b+d);
      System.out.println(a+E);*/
      // a=a+b+c+d;
       //b=b+c+d;
      // a=b+c+d;//CE incompatable type required: int found: string ans vice versa

      // System.out.println(a);
       //System.out.println(b);


       /*RELATION OPERATOR (<,>,<=,>=)*/
       //CAN APPLY TO ALL PRIMITVE TYPE EXCEPT BOOLEAN
       //CANNOT APPLY FOR OBJECT TYPES //CE WILLL GET
       //NESTING OF RELATIONAL OPERATOR IS NOT ALLOEWED//CE WILL GET
       /* 
       System.out.println(10<20);
       System.out.println(10<=20);
       System.out.println(10>20);
       System.out.println(10>=20);
       System.out.println('a'<20);
       System.out.println('A'>20);
       
       */

      /*Equality Operator (==,!=)*/

      //we can also apply to object and primitive type including boolean
      /* 
      System.out.println(10==10.0);//true
      System.out.println('a'==97.0);//true
      System.out.println(true==true);//true
      System.out.println('a'!='b');//true
       */
      /* 
       String a="10";
       String b="10";
       boolean c =a==b;
       System.out.println(c);//true

      */
      /* 
      Thread t1=new Thread();
      Thread t2=new Thread();
      Thread t3=t1;
      System.out.println(t1==t2);//false
      System.out.println(t1==t3);//true// if reference object pointing towards 
      //same object then only its true otherwise it false
      System.out.println(t2==t3);//false

     */
   /*  
     Thread t1=new Thread();
     Object o1=new Object();
     String s1=new String();
     System.out.println(t1==o1);//false object is parent an thread is child
     System.out.println(s1==o1);//false
   */
      //false object is parent an String is child
    // System.out.println(t1==s1);//false compatibility error will occure
    //either parent to child or child to parent reference is neccessary
   /* 
    String s1=new String("swapnil");
    String s2=new String("swapnil");
    String s3=new String("swapnil ");
    String s4=new String();
    String s5=new String();
    System.out.println(s4.equals(s5));//true
    System.out.println(null==null);//true
    System.out.println(s1==null);//false

    System.out.println(s1==s2);//false // reference comapre
    System.out.println(s1.equals(s2));//true// compares values(containt)
    System.out.println(s1.equals(s3));//false 
   */

   /*Instance of operator ,type comparator operator */ 
   // their should be some similarity child to parent ,parent to child ,or same
   /* 
   Thread t=new Thread();
   Object o=new Object();
   String s=new String();
   System.out.println(t instanceof Thread);//true
   System.out.println(t instanceof Object);//true
   System.out.println(t instanceof Runnable);//true
   System.out.println(o instanceof Runnable);//false
   System.out.println(o instanceof String);//false
  // System.out.println(t instanceof String);//CE inconvertable type 
   System.out.println(s instanceof Object);//true
   //For any class or interface x
//null instanceof x the result is always “false”.

   */



   /* Bitwise operator & (and),|(OR), ^(XOR)*/

/*    System.out.println(true&false);//false
   System.out.println(true|false);//true
   System.out.println(true^false);//true//both must be different
   // applicable for both boolean and integer 

    System.out.println(4&5);//4
    System.out.println(4|5);//5
    System.out.println(4^5);//1
    System.out.println(4&6);//4
    System.out.println(4|6);//6
    */
    /* bitwies compliment operator
     System.out.println(~5);//-6 bitwies compliment negation operator only applied for integer not for boolean
     System.out.println(~-5);//4//second compliment used
     System.out.println(~4);//-5// only apply on integer
    */

    
     /*Boolean compliment operator (!)*/
     /* 
     System.out.println(!true);//false
     System.out.println(!false);//true//csn only apply on boolean
     */
     
     /* short circuit operators (&&,||)*/

     //applicable for boolean operato
     //most important example
     /* 
     int x=10;
     int y=20;
     if (++x< 10 & ++y >20 ){// just replace operator with(&&,||,|)
        x++;
        }
    else{

          y++;
        
        }
        System.out.println("the value of x is " + x + " the value of y is " + y);
     */

     /*Type Casting(implicite and explicite ) */
     //implicite type casting also known as wildering or upcasting //no data will loss
     // int x='a';
    //  System.out.println(x);//implicite type casting
      //double d=10;     
      //System.out.println(d);//implicite from smaller to bigger data type casting 

      //explicitly type casting
      //programeer is responsible for explicite type casting
      // also known as down casting
      /*int z=140;
      int z=-130;
      System.out.println((byte)z);//data loss will be perform
      int a=100;
      System.out.println((char)a);

      */ 
      
      /* Assignment operator */ 
      //simple assignment operator
     // int NO1=10;//= is assignment value to the variable
     
     // chained assignment

   /*  int a,b,c,d;
    a=b=c=d=20;
    System.out.println(a+" " +b+" "+c+" "+d+" ");//We can’t perform chained assignment directly at the time of declaration.
   */

     /*Composite operator*/     
       //combination of assignment operator with one more  type of operator

       //int a=10; int b=20; int c=30; int d=30;

    /* a+=20;
       b*=20;
       c/=20;
       d-=20;
       d%=20
       byte b=20;
       b +=1;//internal type casting will be perfrom //their is loop hole
       System.out.println(b);*/

     /*   a&=20;
       b^=20;
       c|=20;
       d>>=20;
       
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
      */
      /* 
         int a,b,c,d;
         a=b=c=d=20;
         a+= b-= c*= d/=5;//4,80,-60,-40//IMP
         System.out.println(a+" "+b+" "+" "+c+" "+d);
        */

        /*Condition operator (?)(ternary operator)*/

        /*int x=(10>20)? 30:40;
        int y=(10<20)? 30:40;
        int z=(10>20)? 30 :((40>50)?60:70);//nesting of condition operator is possible also
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        */
       
       /*New Operator */

      // String s=new  String();//used to creat an object
      
      /*[] operator */
      //used to declare and create array
     
      /*  
     int []a = new int [5]; 
     a[0]=2;
     a[1]=4;
     a[2]=5;
     a[3]=8;
     a[4]=10;
     //a[5]=9;
     for(int i:a){
      System.out.print(" "+ i );
    }
     */

   /* 
     System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(6));
     
     }
        
     
    }    
}
     */


     /*operator prcedence and operand precedence */
    
    /*  public class OPERATOR_ {
    
      public static void main(String[]args){
  
     System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(6));
     
     }
        
     public static int m1(int i){
      System.out.println(i);
      return(i);

    }    
}
     */
   
     
     
  //  }
//}  
