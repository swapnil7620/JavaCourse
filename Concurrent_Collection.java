import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.lang.model.util.Elements;

import static java.util.Arrays.*;

public class Concurrent_Collection {
  public static void main(String[] args) {

    // 1) putIfAbsent Method

    // ConcurrentHashMap m = new ConcurrentHashMap();
    // m.put(101, "Durga");
    // m.put(101, "Ravi");
    // System.out.println(m); //{101=Ravi}
    // m.putIfAbsent(101, "Siva");
    // System.out.println(m); //{101=Ravi}
    // m.putIfAbsent(102,"OK");
    // System.out.println(m);

    // 2) remove Method

    // ConcurrentHashMap m = new ConcurrentHashMap();
    // m.put(101, "Durga");
    // m.remove(101, "Ravi"); //Value Not Matched with Key So Not Removed
    // System.out.println(m); //{101=Durga}
    // m.remove(101, "Durga");
    // System.out.println(m); //{}

    // ConcurrentHashMap CHM = new ConcurrentHashMap();
    // ConcurrentHashMap<Integer, String> CHM = new ConcurrentHashMap<Integer,
    // String>();
    // CHM.put(101,"A");
    // CHM.put(102,"B");
    // CHM.put(103,"C");
    // CHM.putIfAbsent(102,"Z");
    // CHM.remove(102,"Z");
    // CHM.put(104,"D");
    // System.out.println(CHM);

    // 1) booleanaddIfAbsent(Object o): The Element will be Added if and Only if
    // List doesn’contain this Element.

    // CopyOnWriteArrayList Al = new CopyOnWriteArrayList();
    // Al.add("A");
    // Al.add("B");
    // Al.add("C");
    // Al.add("D");
    // Al.addIfAbsent("D");
    // Al.addIfAbsent("E");
    // Al.addIfAbsent("F");
    // System.out.println(Al);

    // ArrayList A = new ArrayList();
    // A.add("Z");
    // A.add("Y");
    // A.add("X");
    // A.add("A");
    // A.add("B");
    // Al.addAllAbsent(A);
    // System.out.println(Al);

    // 2)booleantaddAllAbsent(Collection c): The Elements of Collection will be
    // Added to the List if
    // Elements are Absent and Returns Number of Elements Added.

    // ArrayList l = new ArrayList();
    // l.add("A");
    // l.add("B");
    // CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
    // l1.add("A");
    // l1.add("C");
    // System.out.println(l1); // [A, C]
    // l1.addAll(l);
    // System.out.println(l1); // [A, C, A, B]
    // ArrayList l2 = new ArrayList();
    // l2.add("A");
    // l2.add("D");
    // l1.addAllAbsent(l2);
    // System.out.println(l1); // [A, C, A, B, D]


      // CopyOnWriteArrayList CP = new CopyOnWriteArrayList();// UnsupportedException will occure bcs it cannot support Remove Operation
    
    //   ArrayList<String> CP = new ArrayList<String>();
    //   CP.add("A");
    //   CP.add("B");
    //   CP.add("C");
    //   CP.add("D");
    //   CP.add("E");
    //   System.out.println(CP);
    //   Iterator I= CP.iterator();
    //   while(I.hasNext()){
    //   String S = (String)I.next();
    //   if(S.equals("E") | S.equals("F")){
    //       I.remove();
    //   }
    //  }
    //     System.out.println(CP);

  //  CopyOnWriteArrayList<String> CP = new CopyOnWriteArrayList<String>();
  //  // Happily we can add element in an aaray After iterating also
  //     CP.add("A");
  //     CP.add("B");
  //     CP.add("C");
  //     CP.add("D");
  //     CP.add("E");
  //     Iterator I= CP.iterator();
  //     CP.add("S");
  //     while(I.hasNext()){
  //     String S = (String)I.next();
  //    }
  //       System.out.println(CP);

  // CopyOnWriteArraySet CP  = new CopyOnWriteArraySet();
  // CP.add("A");
  // CP.add("X");
  // CP.add(10);
  // CP.add(20);
  // CP.add(20);
  // CP.add("E");
  // CP.add(12);
  // CP.add("10");
  // CP.add("D");
  // CP.add("C");
  // System.out.println(CP);

  


  }
}