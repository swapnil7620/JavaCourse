import java.util.*;
/* public class ARRAYS {
    public static void main(String[]args){
       /*  int []x= new int[3];//ARRAYS DECLARATION  ONE DIMENTION//[I
        System.out.println(x.getClass().getName());

        int [][]A= new int[3][2];//ARRAYS DECLARATION TWO DIMENTION//[[I
        System.out.println(A.getClass().getName());


        int []ab= new int['B'];//ARRAYS DECLARATION//char to int
        //System.out.println(B.getClass().getName());
        System.out.println(ab);

        short s=30;
        int d[] =new int[s];//short to int //ARRAYS DECLARATION
        System.out.println(d.getClass().getName());
        System.out.println(d);
        
        byte b=20;
        int z[]= new int[b];//ARRAYS DECLARATION byte to short
        System.out.println(z.getClass().getName());
        System.out.println(z);
        */

      // ARRAY INITIALIZATION
     /*    int x[]=new int[3];
        System.out.println(x);//By deafult value will be consider
        System.out.println(x[0]);

        int [][]A = new int[2][3];
        System.out.println(A);//BY DEFAULT
        System.out.println(A[0]);//BY DEFAULT
        System.out.println(A[0][0]);//0
      */

       /*  int [][]B = new int[2][];
        System.out.println(B);//BY DEFAULT
        System.out.println(B[0]);//NULL
        System.out.println(B[0][0]);//RE (RAISE EXCEPTION)

       */
      
      /*    int []a = new int[5];
         a[0]=10;
         a[1]=20;
         a[2]=30;
         a[3]=40;
         a[4]=50;
        // a[5]=60;
         System.out.println(a.length);
         //for(int i=0;i<=a.length;i++)// error occur if semicolan is provided 
           //  System.out.println(a[i]);
             //System.out.println(a.length);

         for( int b:a)//using enhance loop method you won't get error like  //array outof bound exception will occur with output
         System.out.println(b);         
         
*/

    /*    int Num[] =new  int[4];
      // int Nums[] ={4,5,7,8,9};// declaration with Initialization
       Num[0]=10;
       Num[1]=20;
       Num[2]=30;
       Num[3]=40;
       */ 
       /*for(int i=0;i<=4; i++){
          System.out.println(Num[i]);

          System.out.println(Num.length);
          System.out.println();
       }*/
          
       /*  for ( int Nums:Num){//ANOTHER WAY TO PRINT ARRAY
          System.out.println(Nums);

        }*/
   
       /*  for(int i=0;i<=Num.length; i++){//another way to print
          System.out.println(Num[i]);

          System.out.println(Num.length);
       }*/
       /*for(int i=Num.length -1;i>=0; i--){// to reverse the order 
        System.out.println(Num[i]);

       }*/


      // MULTI -DIMENTION ARRAY
  /*      int Num[][]= new int[3][4];
        for (int i=0;i<3;i++)
        {
          for (int j=0;j<4;j++)
          {
            System.out.print(Num[i][j] + " ");//WITH NO VALUE ASSIGN//int used for type casting
          }
            System.out.println(" ");
        }

   */
        // MULTI DEMNTION ARRAY


  /*        int Nums[][]= new int[3][4];
        for (int i=0;i<3;i++)
        {
          for (int j=0;j<4;j++)
          {
             Nums[i][j]=(int) (Math.random() *10);//USING MATH RANDOM FUNCTION
            System.out.print(Nums[i][j] + " ");
          }
            System.out.println(" ");
        } 
             //Another way to print mult dimention array using enhance loop called for each loop 
        for (int n[]:Nums)
        {
                  for(int m:n)
          {
            System.out.print(m+" ");
          }
          System.out.println();
        }

   */

   //jagged array (arrays of array)//in which each array size is different

/*    int Num[][]=new int[3][];
   Num[0]=new int[3];//first array size 
   Num[1]=new int[2];//second array size
   Num[2]=new int[4];//thired array size
         for(int i=0;i<Num.length;i++)
         {
               for(int j=0;j<Num[i].length;j++)
               Num[i][j]=(int)(Math.random() *10);

         }
           
         for(int []n:Num)
         {
             for(int m : n)
             {
             System.out.print(m + " ");
             }
           
             System.out.println();
          }   
   */       

         /*     int Nums[][]=new int[3][4];
          
               for (int i=0;i<3;i++)
                 {
                       
                     for(int j=0;j<4;j++)
                       {
                         Nums[i][j]=(int) (Math.random() *10);
                       } 
                 }     

                          for (int n[]:Nums)
                             {
                        
                                for(int m:n)
                                {
                                   // Nums[n][m]=(int) (Math.random() *10);
                                    System.out.print(m+" ");
                                }
                                    System.out.println();
                              }

         
     

      }

}
*/