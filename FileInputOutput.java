import java.io.*;

public class FileInputOutput {

  public static void main(String[] args) throws Exception {
        // File
 //1) File f=new File(String name);
   //Creates a java File object that represents name of the file or directory.

    /*     File F= new File("Abc1234.txt");
        System.out.println(F.exists());
        F.createNewFile();
        System.out.println(F.exists());
        System.out.println(F.isFile());
        System.out.println(F.isDirectory());
   */
      /*----------------------------------- */
  //Creates a java File object that represents name of the directory.
  /* 
         File f=new File("AbcFile");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.list());
        System.out.println(f.length());

    // it stored in form of an array 
        String[] files = f.list(); 
        System.out.println("Files are:"); 
        // Display the names of the files 
        int count=0;
        for (int i = 0; i < files.length; i++) { 
            count++;
            System.out.println(files[i]); 
            System.out.println(count);
        } 
    */

      /*------------------------------- */
        
    //2) File f=new File(String subdirname,String name);
    // Creates a File object that represents name of the file or directory present in specified
    //sub directory.  
   /*     File F1=new File(f,"abc12.txt");
        F1.createNewFile();
        System.out.println(F1.exists()); */
      /*------------------------------ */

      /*3) File f=new File(File subdir,String name);
         Requirement: Write code to create a file named with demo.txt in current working
         directory. */
      
   /*    File F2=new File("AbcFile","abc12.txt");
      F2.createNewFile();
      System.out.println(F2.exists());
      
   */
      /*-------------------------------- */
      //Write code to create a file named with demo.txt present in E:\xyz folder. 
/* 
      File f5=new File("E:\\swapnil","demo.txt");
      f5.createNewFile();
      System.out.println(f5.exists());
      System.out.println(f5.delete());
    */    

    /*----------FileWriter------------- */
    
    /* 
    FileWriter fw=new FileWriter("cricket1.txt",true);
   fw.write(100);//adding a single character
   fw.write("urga\nsoftware solutions");
   fw.write("\n");
   char[] ch={'a','b','c'};
   fw.write(ch);
   fw.write("\n");
   fw.flush();
   fw.close();
  */

  /*-------------FilerReader--------------- */

  /* 
   
   FileReader FR=new FileReader("cricket1.txt");
   int i=FR.read();
   while(i!=-1)
   {
         System.out.print((char)i);
           i=FR.read(); 
   }
  // System.out.println(FR.read()); 
  // System.out.println(FR.read()); 

  */

  /* -----------BufferWriter-------- */
  /* 

      FileWriter fw=new FileWriter("cricket1.txt",true);
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write(100);
      bw.newLine();
      char[] ch={'a','b','c','d'};
      bw.write(ch);
      bw.newLine();
      bw.write("Durga");
      bw.newLine();
      bw.write("software solutions");
      bw.flush();
      bw.close();
      */

      /*---------BufferReader------- */
    /* 
      FileReader Fr=new FileReader("cricket1.txt");
      BufferedReader br=new BufferedReader(Fr);
      String line = br.readLine();
      while (line !=null)
       {
          System.out.println(line);
           line = br.readLine();
        }
        br.close();

      */  

      /*--------PrintWriter------- */
/* 
    FileWriter fw=new FileWriter("cricket1.txt");
    PrintWriter PW = new PrintWriter(fw);
    PW.println(100);
    PW.println("100");
    PW.println("Swapnil");
    PW.println('A');
    PW.flush();
    PW.close();
    
   */



      }
}




