// import java.util.*;
// public class Test5 {
// public static void main(String[] args) {
// TreeSet t = new TreeSet(new MyComparator1());
// t.add(new StringBuffer("A"));
// t.add(new StringBuffer("Z"));
// t.add(new StringBuffer("K"));
// t.add(new StringBuffer("L"));
// System.out.println(t);
// }
//  }

//   class MyComparator1<Object> implements Comparator<Object> {
// public int compare(Object obj1, Object obj2) {
// String s1 = obj1.toString();
// String s2 = obj2.toString();
// return s1.compareTo(s2); //[A, K, L, Z]
// }
// }


/*Write a Program to Insert StringBuffer Objects into the TreeSet where Sorting Order is
Alphabetical Order: */
// import java.util.*;

// public class Test5 {
//     public static void main(String[] args) {
//         TreeSet t = new TreeSet(new MyComparator1());
//         t.add(new StringBuffer("Amala"));
//         t.add(new StringBuffer("Kane"));
//         t.add(new StringBuffer("Virat"));
//         t.add(new StringBuffer("Rohit"));
//         System.out.println(t);
//     }
// }

// class MyComparator1<Object> implements Comparator<Object> {
//     public int compare(Object obj1, Object obj2) {
//         String s1 = obj1.toString();
//         String s2 = obj2.toString();
//         // String S1= (String)Obj1;Not Working
//         // String S2= (String)Obj2;Not Working
//         // return s1.compareTo(s2);//Ascending order order//[Amala, Kane, Rohit, Virat]
//         // return -s1.compareTo(s2);//[Virat, Rohit, Kane, Amala] //reverse order
//         // return -s2.compareTo(s1);
//         // return +1; //Insetion order
//         // return -1; // reverse Insetion order
//         return s1.compareTo(s2);
//     }
// }




