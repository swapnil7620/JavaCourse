/* 
public class Object {
    public static void main(String[] args) {
        String S=new String("Swapnil");
        System.out.println(S);
    }
}
*/
/* 
class Object {
    String name;
    int rollno;
     Object(String name,int rollno)
  {
  this.name=name;
  this.rollno=rollno;
  }
  //most important to override to string method
  public String toString(){
    return name + " " + rollno;
  }
    public static void main(String args[]) {
        Object s1 = new Object("vijayabhaskar", 101);
        Object s2 = new Object("bhaskar", 102);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
    }
}
*/
/* 
class Object {
    int i;

    Object(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i ;
    }

    public static void main(String[] args) {
        Object t1 = new Object(10);
        Object t2 = new Object(100);
        System.out.println(t1);
        System.out.println(t2);
    }
}
    */

//to print the  orignal value 
/*  
class Object {
    int i;

    Object(int i) {
        this.i = i;
    }

    public String toString() {
        return i+" " ;
    }

    public static void main(String[] args) {
        Object t1 = new Object(10);
        Object t2 = new Object(100);
        System.out.println(t1);
        System.out.println(t2);
    }
}
    
*/

/*equals Method() */
// By defalut Object class equal  method will be executed used for reference comparison
/* 
class Object {
    String Name;
    int rollno;

    Object(String Name, int rollno) {
        this.Name = Name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        Object O1 = new Object("swapnil", 10);
        Object O2 = new Object("Durga", 100);
        Object O3 = new Object("swapnil", 10);
        Object O4 = O1;
        System.out.println(O1.equals(O2));//It use to compare object address or  for reference comaprison
        System.out.println(O1.equals(O3));//It use to compare object address or  for reference comaprison
        System.out.println(O1.equals(O4));//It use to compare object address or for reference comaprison
    }
}
*/
/* 
class Object {
    String Name;
    int rollno;

    Object(String Name, int rollno) {
        this.Name = Name;
        this.rollno = rollno;
    }
   
public static void main(String[] args) {
        Object O1 = new Object("swapnil", 10);
        Object O2 = new Object("Durga", 100);
        Object O3 = new Object("swapnil", 10);
        Object O4 = O1;
        System.out.println(O1.equals(O2));//It use to compare object address or  for reference comaprison
        System.out.println(O1.equals(O3));//It use to compare object address or  for reference comaprison
        System.out.println(O1.equals(O4));//It use to compare object address or for reference comaprison
    }
}
    */
//overrding equals method
//Not Simplified version 
/* 
class Object {
    String name;
    int rollno;

    Object(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object obj)
    {
    try{
    String name1=this.name;
    int rollno1=this.rollno;
    Object s2=(Object)obj;
    String name2=s2.name;
    int rollno2=s2.rollno;
    if(name1.equals(name2)&&rollno1==rollno2)
    {
    return true;
    }
    else return false;
    }
    
    catch(ClassCastException e)
    {
    return false;
    }
    catch(NullPointerException e)
    {
    return false;
    }
    }

    public static void main(String[] args) {
        Object s1 = new Object("vijayabhaskar", 101);
        Object s2 = new Object("bhaskar", 102);
        Object s3 = new Object("vijayabhaskar", 101);
        Object s4 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("vijayabhaskar"));
        System.out.println(s1.equals("null"));
    }
}

*/
/* 
class Object {
    String name;
    int rollno;

    Object(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object o) {
        try {
            Object s2 = (Object) o;
            if (name.equals(s2.name) && rollno == s2.rollno) {
                return true;
            } 
                else
                return false;
        } 
            catch (ClassCastException e) {
            return false;
        } 
            catch (NullPointerException e) {
            return false;
        }
    }

    public static void main(String[] args) {
            Object s1 = new Object("vijayabhaskar", 101);
            Object s2 = new Object("bhaskar", 102);
            Object s3 = new Object("vijayabhaskar", 101);
            Object s4 = s1;
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s1.equals(s4));
            System.out.println(s1.equals("vijayabhaskar"));
            System.out.println(s1.equals("null"));
        }
}

*/
