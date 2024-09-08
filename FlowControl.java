public class FlowControl{
    
    public static void main(String[]args){
        System.out.println();
 // argument  to the if statement should be  boolean type
     /* 
       boolean b=false;

        if (b=false){
            System.out.println("b is  :" + b);
        }
    
        else {
            System.out.println("b is true :" );
        }

    boolean c=true;

        if (c|false){
            System.out.println("hello");
        }
    
        else {
            System.out.println("hi" );
        }

        */

    /*  if(false);
       System.out.println("hello");
       System.out.println("hi");
       System.out.println("i am ok");
     */  
    
     /*switch statement in selection statement */
     /* 
     int x=10;
     int y=20;
     switch(y+1)
     {
        case 10:
                 System.out.println("first case x: "+ x);
                 break;
        case 20:
                 System.out.println("first case y: "+ y);  
        default:
                 System.out.println("choose valid option");             
     }

     */
    /* iteravite statement while()*/
    /* 
    int a=10, b=20;
       while(a<b){
        
        System.out.println("hello");
        break;      
    }
       System.out.println("hi");
       */

   /* do while loop */
   /* 
   int i=0;
   do{
       
    System.out.println("hi");
    i=i+1;
    }
       while(i<0);
     System.out.println("ok");

   */
   /*for loop */ 

  /*  int i=0;
   for(System.out.println("Today is my Interview");i<3;i++)//initialization section is sop  can be
    System.out.println("NO Boss now u are in Interview");
   

    int j=0;
    for(System.out.println("Today is my Interview");j<3;
    System.out.println("NO Boss now u are in Interview")){ //increment and decremeent section can be sop also
        j++;
        
    }
       
    */
    /* 
    int []a={10,20,30,40,50};
    for(int i=0;i<a.length;i++)
    {
         System.out.print(" "+a[i]);
        }
    }
       */
      
       /*for each loop */
       /* 
       int []a={10,20,30,40,50};
          for(int x:a) {
            System.out.print(" "+x);
           }
      */
        /* 
      int [][]x={{10,20,30,40,50},{60,70,80,90,100}};
         for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(" "+x[i][j]);
            }
            System.out.println(" ");
         }
        */ 

    /* 
       int [][]x={{10,20,30,40},{60,70,80,90}};
      for(int x1[]:x){
        for(int x2:x1){
            System.out.print(" " +x2);
        }
        System.out.println(" ");
    }
    */
  
    /*3D array using for each loop */
    /* 
    int [][][]x={{{10,20,30,40},{60,70,80,90},{20,30,40,70}}};
     for(int [][]x1:x){
         for(int []x2:x1){
             for(int x3:x2){
                 System.out.print(" "+x3);
            }
            System.out.println(" ");
        }
          System.out.println(" ");
    }
   */

  /* reverse array using normal for loop */
  /* 
   int a[]={1,2,3,4,5,6,7,8,9};
   for(int i=a.length-1;i>=0;i--){
    System.out.print(" "+ a[i]);
   }
  */

     /*interable and interator */
     /////////////////////////



     /*Transfer statement  */
    //break statement 
     //use inside  switch to stop fall throught 
     //Inside loops to break the loop based on some condition.
      //Inside label blocks to break block execution based on some condition.
    
      //inside the label
      
   /*  int x=10;
      l1:{
        System.out.println("begin");
        if(x==10)
            break l1;
            System.out.println("hi");
        
        }
        System.out.println("end");
      */
     /* 
      for(int i=0;i<=10;i++){
           if(i % 2 !=0)
           continue;
           System.out.println(i);
      }
       */
         
       /*Label break and continue */
       /* 
       l1:
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j)
                   // break l1;
                   continue l1;
                System.out.println(i+" "+j);
                
            }
         }
       */



  }
}