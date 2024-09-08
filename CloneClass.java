
/* class CloneClass implements Cloneable{
    
    //int i=10;
    //int j=20;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneClass C1= new CloneClass();
        CloneClass C2=(CloneClass)C1.clone();// Type Casting is important
        C2.i=100;
        C2.j=200;
        System.out.println(C1.i +"....." +C1.j);
        System.out.println(C2.i + "...."+ C2.j);
      
         


        
    }
}
*/
/*error occuring */
/*
class Cat{
    int j;
    Cat(int j){
        this.j=j;
    }
}
    class Dog implements Cloneable{
     Cat c;
     int i;
     Dog(Cat c, int i){
        this.c=c;
        this.i=i;
     }
     public Object clone() throws CloneNotSupportedException{
        return super.clone();
     }
    }

class CloneClass{

        public static void main(String[] args) throws CloneNotSupportedException {
            Cat c=new Cat(20);
            Dog D1=new Dog(c, 10);
            System.out.println(D1.i +"...."+ D1.c.j);
            Dog D2=(Dog)D1.clone();
            D2.i=888;
            D2.c.j=999; 
            System.out.println(D2.i +"...."+ D2.c.j);



        }

    }
 */
