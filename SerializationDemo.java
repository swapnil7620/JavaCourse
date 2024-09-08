import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// import java.io.Serializable;
import java.io.Serializable;

/**
 * SerializationDemo
 */
/*
 * class Dog implements Serializable{
 * // int i=100;
 * // int j=200;
 * // transient int i=100;
 * //transient int j=200;
 * //static int i=10; // will not participate in serialization , there is no use
 * in serialization
 * final int i=100;
 * transient final int j=200;
 * 
 * }
 * public class SerializationDemo {
 * public static void main(String[] args) throws Exception {
 * 
 * Dog D1=new Dog();
 * System.out.println("Serialization is started");
 * FileOutputStream FOS =new FileOutputStream("abc.txt");
 * ObjectOutputStream OOS=new ObjectOutputStream(FOS);
 * OOS.writeObject(D1);
 * System.out.println("Serialization is ended");
 * System.out.println("Deserialization is startrd");
 * FileInputStream F2=new FileInputStream("abc.txt");
 * ObjectInputStream OIS =new ObjectInputStream(F2);
 * Dog D2=(Dog)OIS.readObject();
 * System.out.println("Value of Dogs Object are : " + D2.i + " " +D2.j);
 * 
 */

/* Object Graph inserializable */

/*
 * class Dog implements Serializable {
 * 
 * Cat C = new Cat();
 * 
 * }
 * 
 * class Cat implements Serializable {
 * Rat R = new Rat();
 * }
 * 
 * class Rat implements Serializable {
 * int j = 20;
 * String S = "Abc";
 * }
 * 
 * class SerializationDemo {
 * public static void main(String[] args) throws Exception {
 * Dog D1 = new Dog();
 * FileOutputStream FOS = new FileOutputStream("abc.txt");
 * ObjectOutputStream OOS = new ObjectOutputStream(FOS);
 * OOS.writeObject(D1);
 * FileInputStream FIS = new FileInputStream("abc.txt");
 * ObjectInputStream OIS = new ObjectInputStream(FIS);
 * Dog D2 = (Dog) OIS.readObject();
 * System.out.println(D2.C.R.j + " \n " + D2.C.R.S);
 * }
 * 
 * }
 * 
 */

/* Customized Serialization */
/*
 * class Account implements Serializable {
 * String userName = "Bhaskar";
 * transient String pwd = "kajal";
 * 
 * private void writeObject(ObjectOutputStream os) throws Exception {
 * os.defaultWriteObject();
 * String epwd = "123" + pwd;
 * os.writeObject(epwd);
 * }
 * 
 * private void readObject(ObjectInputStream is) throws Exception {
 * is.defaultReadObject();
 * String epwd = (String) is.readObject();
 * pwd = epwd.substring(3);
 * }
 * }
 * 
 * class SerializationDemo {
 * public static void main(String[] args)throws Exception{
 * Account a1=new Account();
 * System.out.println(a1.userName+"........."+a1.pwd);
 * 
 * FileOutputStream fos=new FileOutputStream("abc.ser");
 * ObjectOutputStream oos=new ObjectOutputStream(fos);
 * oos.writeObject(a1);
 * FileInputStream fis=new FileInputStream("abc.ser");
 * ObjectInputStream ois=new ObjectInputStream(fis);
 * Account a2=(Account)ois.readObject();
 * System.out.println(a2.userName+"........."+a2.pwd);
 * }
 * }
 */

/* Inheritance in Serialization */
/* 
class Animal implements Serializable {

    int i = 10;

}

class Dog extends Animal {

    int j = 20;

}

class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        System.out.println(d1.i + "........" + d1.j);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.i + "........" + d2.j);
    }
}
*/

