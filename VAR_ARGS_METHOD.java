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





/* public class VAR_ARGS_METHOD {

    //public static void m1(int... x){
      //System.out.println("VAR_ARGS_METHOD");
      //System.out.println("the no of arguments"+x.length);
    }
        //public static void main(String[]args){
          public static void main(String...args){ //valid syntax 
            System.out.println("VAR-args");
            //m1();
            //m1(10,30,40);
            //m1(10,20);
         

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
