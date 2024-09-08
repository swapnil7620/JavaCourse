/* public class Garbage_Collector {
    public static void main(String[] args) {

         // To make a eligebal for garbage collector
        // 1) Nullifying the reference variable //if object no longer required

        /* 
        String S1=new String("Swapnil");
        String S2=new String("Mahajan");
        System.out.println(S1);
        System.out.println(S2);
        S1=null;
        S2=null;
        */

/* 2) Reassign the reference variable */
/* 

String S1 = new String("Swapnil");
String S2 = new String("mahajan");
System.out.println(S1);
System.out.println(S2);

S1 = new String("Abhijeet");
S2 = new String("Mahajan");

System.out.println(S1);
System.out.println(S2);

}

}
*/
// 3) Objects created inside a method: 
/* 
 public class Garbage_Collector {
    
     public static void m1() 
     {

     String S1 = new String("Swapnil");
     String S2 = new String("Mahajan");
     System.out.println(S1);
     System.out.println(S2);

    }
    public static void main(String[] args) {
        m1();
}

}
*/

// 4) Island of isolation. (Island of Isolation all references are internal references ) 
/* 
public class Garbage_Collector{

    Garbage_Collector i;
    public static void main(String[] args) {
        Garbage_Collector T1 = new  Garbage_Collector();
        Garbage_Collector T2 = new Garbage_Collector();
        Garbage_Collector T3 = new Garbage_Collector();

        T1.i=T2;
        T2.i=T3;
        T3.i=T1;

        T1=null;
        T2=null;
        T3=null;
    }
}
*/

/*----------------The ways for requesting JVM to run Garbage Collector----------- */

/* 
class Garbage_Collector{
    public static void main(String[] args) {
        Runtime R = Runtime.getRuntime();

        System.out.println("TotalMemory is : " + R.totalMemory());
        System.out.println("freeMemory  is : " + R.freeMemory());
        for(int i=0;i<10;i++){
            String S= new String();
            S=null;
        }
       

        System.out.println("TotalMemory is : " + R.freeMemory());
        System.gc();
        System.out.println("freeMemory  is : " + R.freeMemory());
    }
}
   */

/*-----------Finalization--------- */
/* 

class Garbage_Collector {
    public static void main(String[] args) {
        Garbage_Collector GC = new Garbage_Collector();
        GC=null;
        System.gc();
        System.out.println("Main Method Executed");
    }

    public void finalize() {
        System.out.println("Finalize Method is Executed");
    }

}
    */

    /*Proof of Garbage collector run By Default whenever memory problem is occur */
    
    class Garbage_Collector {
        static int Count =0;
        public static void main(String[] args) {
            for(int i=0; i<100;i++){
                  Garbage_Collector GC= new Garbage_Collector();
                  GC= null;
            }

        }
        public void finalize(){
            System.out.println("Finalize method get executed "+ ++Count);
        }
    }
