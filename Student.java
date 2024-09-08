/*public class Student {
    
    String Name;
    int  RollNo;
    Student(String Name , int RollNo)
    {
        this.Name=Name;
        this.RollNo=RollNo;
    }
     public static void main(String args[]){

     Student s1=new Student("swapnil",88);
     Student s2=new Student("Nishant",44);
     System.out.println(" student Name: "+s1.Name +" ... "+"Student RollNo: "+s1.RollNo);
     System.out.println(" student Name: "+s2.Name +" ... "+"Student RollNo: "+s2.RollNo);
   }
}

*/

class Student{
    Student(Double d){
        this(10);
        System.out.println("double argument constructor");
    }
    Student(int i){
    this();
    System.out.println("int argument constructor");
}
   Student(){
    
    System.out.println("no argument constructor");
   }

   public static void main(String[]args){
    Student s1=new Student(10.5);
    //Student s2=new Student(100);
  // Student s3=new Student();
   }
}