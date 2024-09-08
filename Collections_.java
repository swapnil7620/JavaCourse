import java.util.*;
import static java.util.Arrays.*;

public class Collections_ {
  public static void main(String[] args) throws InterruptedException {
    // System.out.println("Collection");

    /*------------ArraysList--------- */
    // ArrayList<String> Cars = new ArrayList<String>();

    // Cars.add("BMW");
    // Cars.add("WW");
    // Cars.add("VERNA");
    // Cars.add("CIAZ");
    // Cars.add("JAGUAR");
    // // Cars.add("Noun");
    // Cars.add(5, "Mazda");// to add at perticular index
    // System.out.println(Cars.get(4));
    // System.out.println(Cars.indexOf("WW"));
    // Collections.sort(Cars);
    // for (String car : Cars) {
    // System.out.println(car);
    // // Collections.sort(Cars);

    // }

    /*-----------------LinkedList------------- */

    // Creating object of the
    // class linked list
    // LinkedList<String> ll = new LinkedList<String>();

    // // Adding elements to the linked list
    // ll.add("A");
    // ll.add("B");
    // ll.addLast("C");
    // ll.addFirst("D");
    // ll.add(2, "E");
    // // ll.add(3);

    // System.out.println(ll);
    // for (String string : ll) {
    // System.out.println(string);

    // }

    // ll.remove("B");
    // ll.remove(3);
    // ll.removeFirst();
    // ll.removeLast();

    // System.out.println(ll);

    /*-------------------Vector------------------------- */

    // Vector V = new Vector(10,2);
    // System.out.println(V.capacity());

    // for ( int i =0;i<=13;i++)
    // {
    // V.addElement(i);
    // }
    // System.out.println(V);
    // V.add(15);
    // V.add(25);
    // V.add(35);
    // System.out.println(V.capacity());

    /*-------------Stack--------------- */

    // Stack s = new Stack();
    // s.push("A");
    // s.push("B");
    // s.push("C");
    // s.push(10);
    // System.out.println(s); // [A, B, C]
    // System.out.println(s.search("A")); // 3
    // System.out.println(s.search("Z")); // -1
    // System.out.println(s.peek());
    // System.out.println(s.empty());
    // s.pop();
    // System.out.println(s);

    /*--------Enumeration cursor------ */

    // Vector v = new Vector();
    // for (int i = 0; i <= 10; i++) {
    // v.addElement(i);
    // }
    // System.out.println(v);
    // Enumeration e = v.elements();
    // while (e.hasMoreElements()) {
    // Integer I = (Integer) e.nextElement();
    // if (I % 2 == 0)
    // System.out.println(I);
    // }
    // System.out.println(v);

    /*--------Iterator Cursror------- */

    // ArrayList AL = new ArrayList();

    // for (int i = 0; i <= 10; i++) {
    // AL.add(i);
    // }
    // System.out.println(AL);
    // Iterator Itr = AL.iterator();
    // while (Itr.hasNext()) {
    // Integer I = (Integer) Itr.next();
    // if (I % 2 == 0)
    // System.out.println(I);
    // else
    // Itr.remove();
    // }
    // // System.out.println(AL);

    /*-------------------ListIterator Cursor---------------  */

    // LinkedList l = new LinkedList();
    // l.add("Baala");
    // l.add("Venki");
    // l.add("Chiru");
    // l.add("Naag");
    // System.out.println(l);
    // ListIterator ltr = l.listIterator();
    // while (ltr.hasNext()) {
    // String s = (String) ltr.next();
    // if (s.equals("Venki"))
    // ltr.remove();
    // if (s.equals("Naag"))
    // ltr.add("Chaitu");
    // if (s.equals("Chiru"))
    // ltr.add("Charan");
    // }
    // System.out.println(l);

    /*-------------------HashSet LinkedHashSet-------------- */

    // HashSet<Integer> H = new HashSet<Integer>();// By Defining Integer Data type
    // we cannot add Another data type values
    // HashSet H = new HashSet();
    // LinkedHashSet H = new LinkedHashSet();//to preserved the order of insertion
    // linkedHashSet is best choice
    // //Hybride data structure is used LinkedList + Hashtable

    // H.add(1);
    // H.add("A");
    // H.add(2);
    // H.add(4);
    // H.add("M");
    // H.add(null);
    // // H.clear();

    // System.out.println(H);
    // System.out.println(H.add(1));

    /*------------------------TreeSet------------------ */
    /*
     * Must be Homogeneous And Comaparable Interface by deafult must be Implimented
     */
    // TreeSet T = new TreeSet();
    // T.add("A");
    // T.add("a");
    // T.add("B");
    // T.add("C");
    // T.add("D");
    // T.add("b");
    // System.out.println(T);
    // // T.add(new Integer(10));//class Cast Exception will occur Hetrogeneous
    // Values
    // // are not allowed in TreeSet And TreeMap , cause of comapartor
    // T.add(new String("10"));
    // T.add(new StringBuffer("hi"));
    // T.add(new StringBuffer("hello"));
    // T.add(new StringBuilder("h"));
    // T.add(new StringBuilder("hi"));
    // T.add(null);//Not allowed
    // System.out.println(T);

    /*--------------Comparable---------- */

    /*
     * Comparable meant for default natural sorting order.
     * Comparator meant for customized sorting order.
     */

    // System.out.println("A".compareTo("Z"));//-25
    // System.out.println("Z".compareTo("A"));//+25
    // System.out.println("Z".compareTo("Z"));//0

    /*-------------------Comparator------------- */

    // TreeSet T = new TreeSet(new MyComparator());
    // T.add(10);
    // T.add(0);
    // T.add(15);
    // T.add(5);
    // T.add(20);
    // T.add(20);
    // System.out.println(T);

    // }
    // }
    // class MyComparator implements Comparator
    // {
    // public int Compare(Object obj1, Object obj2)
    // {
    // Integer I1 = (Integer)obj1;
    // Integer I2 = (Integer)obj2;

    // if (I1 < I2)
    // return +1;
    // else if (I2 < I1)
    // return -1;
    // else
    // return 0;

    // not working

    // TreeSet t=new TreeSet(new MyComparator());
    // t.add(10);
    // t.add(0);
    // t.add(15);
    // t.add(5);
    // t.add(20);
    // System.out.println(t);//[20, 15, 10, 5, 0]
    // }
    // }
    // class MyComparator<Object> implements Comparator<Object>{
    // public int compare(Object obj1 , Object obj2){
    // Integer i1 = (Integer)obj1;
    // Integer i2 = (Integer)obj2;

    // return i1.compareTo(i2);

    // if (i1 < i2)
    // return +1;

    // else if (i1 > i2 )
    // return -1;

    // else
    // return 0;

    /*---------------Map------------ */

    /*
     * HashMap m = new HashMap();
     * m.put("Chiru", 700);
     * m.put("Bala", 800);
     * m.put("Venki", 200);
     * m.put("Nag", 500);
     * m.put("swapnil", null );
     * System.out.println(m.put("swapnil", 10000));//value updated here
     * System.out.println(m);
     * Set s = m.keySet();
     * System.out.println(s);
     * Collection c = m.values();
     * System.out.println(c);
     * 
     * Set S = m.entrySet();
     * Iterator itr = S.iterator();
     * 
     * while(itr.hasNext()){
     * Map.Entry m1 = (Map.Entry)itr.next();
     * System.out.println(m1.getKey() +" "+ m1.getValue());
     * if(m1.getKey().equals("Nag")){
     * m1.setValue("10000");
     * 
     * }
     * 
     * }
     * System.out.println(m);
     * 
     */

    /*----------LinkedHashMap----------- */

    // LinkedHashMap LHM = new LinkedHashMap();
    // LHM.put("Chiru", 700);
    // LHM.put("Bala", 800);
    // LHM.put("Venki", 200);
    // LHM.put("Nageshwar", 500);
    // LHM.put("swapnil", null );
    // System.out.println(LHM);
    // Set S = LHM.keySet();
    // System.out.println(S);
    // Collection C = LHM.values();
    // System.out.println(C);

    /*---------------IdentityHashMap----------- */
    // It goes for reference comparison ,and its override equals method with ==
    // operator
    // IdentityHashMap m = new IdentityHashMap();
    // Integer I1 = new Integer(10);
    // Integer I2 = new Integer(10);
    // m.put(I1, "Pawan");
    // m.put(I2, "Kalyan");
    // System.out.println(m);

    /*------------------WeakHashMap--------------- */
    // it makes object illgible for Grabage Collector

    // WeakHashMap m = new WeakHashMap();
    // // HashMap m = new HashMap();
    // Temp t = new Temp();
    // m.put(t, "OK");
    // System.out.println(m);
    // t=null;
    // Thread.sleep(5000);
    // System.gc();
    // System.out.println(m);
    // }
    // }

    // class Temp {
    // public String toString(){
    // return "t";
    // }

    // public void finalize(){
    // System.out.println("Gc has arrive");

    /*------------Sorted Map-------- */

    // SortedMap<String, Integer> sortedMap = new TreeMap<>();

    // // Adding elements to the sorted map
    // sortedMap.put("A", 1);
    // sortedMap.put("C", 3);
    // sortedMap.put("B", 2);

    // // Getting values from the sorted map
    // int valueA = sortedMap.get("A");
    // System.out.println("Value of A: " + valueA);

    // // Removing elements from the sorted map
    // sortedMap.remove("B");

    // // Iterating over the elements of the sorted map
    // for (String key : sortedMap.keySet()) {
    // System.out.println("Key: " + key + ", Value: " + sortedMap.get(key));
    // }

    /*---------------TreeMap------------- */

    /* Default sorting */
    // TreeMap<Integer, String> TM = new TreeMap<Integer, String>();
    // TM.put(100, "A");
    // TM.put(102, "B");
    // TM.put(103, "C");
    // TM.put(104, "D");
    // // TM.put("Abcd", "D");// Class Cast Exception
    // // TM.put(null, "D");// NullPointer Execption
    // System.out.println(TM);

    // --------- Coustmize Sorting--------//

    // TreeMap<String, Integer> t = new TreeMap<String, Integer>(new
    // MyComparator());
    // t.put("XXX", 10);
    // t.put("AAA", 20);
    // t.put("ZZZ", 30);
    // t.put("LLL", 40);
    // System.out.println(t);// {ZZZ=30, XXX=10, LLL=40, AAA=20}
    // }
    // }

    // class MyComparator<Object> implements Comparator<Object> {
    // public int compare(Object obj1, Object obj2) {
    // String s1 = obj1.toString();
    // String s2 = obj2.toString();
    // return s2.compareTo(s1);

    /*-----------------HashTable-------------- */

    // Hashtable<Integer, String> HT= new Hashtable<Integer, String>();
    // HT.put(10," A");
    // HT.put(12," B");
    // HT.put(13," C");
    // HT.put(14," D");
    // System.out.println(HT);
    // }
    // }

    // Hashtable HT = new Hashtable();
    // HT.put(new Temp(10)," A");
    // HT.put(new Temp(11)," B");
    // HT.put(new Temp(12)," C");
    // HT.put(new Temp(20)," D");
    // HT.put(new Temp(22)," E");
    // System.out.println(HT + " ");
    // }
    // }
    // class Temp{
    // int i;
    // Temp(int i){
    // this.i=i;
    // }

    // public int hashCode(){
    // // return i;
    // return i%9;

    // }
    // public String toString(){
    // return i + " ";
    // }

    // }

    /*--------------------Queue--------------- */
    // PriorityQueue<Integer> PQ= new PriorityQueue<Integer>();
    // Some for system not providing support for priorityQueue & ThreadPriority
    // PQ.offer(10);
    // PQ.offer(20);

    // System.out.println(PQ.size());
    // System.out.println(PQ.poll());
    // System.out.println(PQ.isEmpty());
    // for(int i=0; i<=10;i++)
    // {
    // PQ.offer(i);

    // }
    // System.out.println(PQ);
    // System.out.println(PQ.peek());
    // System.out.println(PQ.remove());
    // System.out.println(PQ);
    // System.out.println(PQ.peek());
    // System.out.println(PQ.poll());
    // System.out.println(PQ.poll());

    // PriorityQueue q = new PriorityQueue(15, new MyComparator());
    // 15, new MyComparator() can try to remove in above Constructor for
    // alphabetical order
    // q.offer("A");
    // q.offer("Z");
    // q.offer("L");
    // q.offer("B");
    // System.out.println(q); // [Z, B, L, A]

    // class MyComparator<Object> implements Comparator<Object> {
    // public int compare(Object obj1, Object obj2) {
    // String s1 = (String) obj1;
    // String s2 = obj2.toString();
    // return s2.compareTo(s1);

    // TreeSet<Integer> TS = new TreeSet<Integer>();
    // TS.add(10);
    // TS.add(20);
    // TS.add(80);
    // TS.add(40);
    // TS.add(90);
    // TS.add(60);
    // System.out.println(TS);
    // System.out.println(TS.ceiling(70));
    // System.out.println(TS.floor(30));
    // System.out.println(TS.lower(30));
    // System.out.println(TS.contains(10));
    // System.out.println(TS.higher(40));
    // System.out.println(TS.descendingSet());
    // System.out.println(TS.pollFirst());
    // System.out.println(TS.pollLast());

    /*---------------TreeMap----------- */

    // TreeMap<String, Integer> TM = new TreeMap<String,Integer>();
    // TM.put("A", 10);
    // TM.put("B", 20);
    // TM.put("C", 30);
    // TM.put("D", 40);
    // TM.put("E", 50);
    // System.out.println(TM);
    // System.out.println(TM.firstKey());
    // System.out.println(TM.lastKey());
    // System.out.println(TM.containsKey("A"));
    // System.out.println(TM.containsValue(30));
    // System.out.println(TM.floorKey("D"));
    // System.out.println(TM.lowerKey("D"));
    // System.out.println(TM.higherKey("C"));
    // System.out.println(TM.pollFirstEntry());
    // System.out.println(TM.lastEntry());
    // System.out.println(TM.descendingMap());

    // System.out.println(TM.reversed());

    /*--------------Searching----------- */

    // Default Searching , It uses Binary Search Algorithm.
    // ArrayList<Integer> Al = new ArrayList<Integer>();
    // Al.add(10);
    // Al.add(50);
    // Al.add(110);
    // Al.add(120);
    // Al.add(30);
    // System.out.println(Al);
    // Collections.sort(Al);
    // System.out.println(Al);
    // System.out.println(Collections.binarySearch(Al, 110));
    // System.out.println(Collections.binarySearch(Al, 40));
    // System.out.println(Al.reversed());
    // Collections.sort(Al, Collections.reverseOrder());
    // System.out.println(Al);

    // }
    // }

    // -------------------BinarySearch---------------//

    // ArrayList<Integer> al = new ArrayList<Integer>();
    // al.add(15);
    // al.add(0);
    // al.add(20);
    // al.add(10);
    // al.add(5);
    // System.out.println(al); //[15, 0, 20, 10, 5]
    // Collections.sort(al, new MyComparator());
    // System.out.println(al); //[20, 15, 10, 5, 0]
    // System.out.println(Collections.binarySearch(al, 10, new MyComparator())); //2
    // System.out.println(Collections.binarySearch(al, 13, new MyComparator()));
    // //-3
    // System.out.println(Collections.binarySearch(al, 17)); //-6
    // }

    // }
    // class MyComparator<Object> implements Comparator<Object>{

    // public int compare(Object obj1, Object obj2) {
    // Integer I1 = (Integer) obj1;
    // Integer I2 = (Integer) obj2;
    // return I1.compareTo(I2);
    // }
    // }

    /*------------------Arrays---------- */

    // Searching in an Array
    
    /*
     * 1)public static void sort(primitive[] p); To Sort According to Natural
     * Sorting Order.
     * 2) public static void sort(Object[] o); To Sort According to Natural Sorting
     * Order.
     * 3) public static void sort(Object[] o, Comparator c);To Sort According to
     * Customized Sorting
     * Order.
     */

 // 1)public static void sort(primitive[] p); only Sort According to Natural Sorting Order.
   
    // int A[] = { 10, 12, 11, 100, 50 };
    // System.out.println("Array Before sort");
    // for (int A1 : A) {
    //   System.out.println(A1);
    // }
    // Arrays.sort(A);
    // System.out.println("Arrays After Sorting");
    // for (int A2 : A) {
    //   System.out.println(A2);
    // }


    //2) public static void sort(Object[] o); To Sort According to Natural Sorting  Order.
     
  //  String A[] = { "A", "Z", "B" };
  //  String A[] = { "A", "Z", "B", "b" ,"a" , "10","970" ,"98"};
  //   System.out.println("Array Before sort");
  //   for (String A1 : A) {
  //     System.out.println(A1);
  //   }
  //   Arrays.sort(A);
  //   System.out.println("Arrays After Sorting");
  //   for (String A2 : A) {
  //     System.out.println(A2);
  //   }


/* Searching the Elements of Array: 
 
    1) public static int binarySearch(primitive[] p, primitive target);
    If the Primitive Array Sorted According to Natural Sorting Order then we have to Use this
    Method.

    2) public static int binarySearch(Object[] a, Object target);
    If the Object Array Sorted According to Natural Sorting Order then we have to Use this
    Method.

    3) public static int binarySearch(Object[] a, Object target, Comparator c);
    If the Object Array Sorted According to Comparator then we have to Use this Method.

    Note: All Rules of Array Class binarySearch() are Exactly Same as Collections Class
    binarySearch(). */


    // int[] a = {10, 5, 20, 11, 6};
    // Arrays.sort(a); //Sort By Natural Order
    // System.out.println(Arrays.binarySearch(a, 6)); //1
    // System.out.println(Arrays.binarySearch(a, 5)); //-5

    // String[] s = {"A", "Z", "B"};
   // Arrays.sort(s);
   // System.out.println(Arrays.binarySearch(s, "Z")); //2
    //System.out.println(Arrays.binarySearch(s, "S")); //-3


    
  //   String[] s = {"A", "Z", "B"};
  //   Arrays.sort(s, new MyComparator());
  //   System.out.println(binarySearch(s, "Z", new MyComparator())); //0 // used static in import  
  //   System.out.println(binarySearch(s, "S", new MyComparator())); //-2 //used static in import
  //   System.out.println(binarySearch(s, "N")); //-4
  //   }

  // }
  // class MyComparator<Object> implements Comparator<Object>{

  // public int compare(Object obj1, Object obj2) {
  //   String s1 = obj1.toString();
  //   String s2 = obj2.toString();
  //   return s2.compareTo(s1);

/*-----------Arrays to List------ */

//  String []S = {"A", "C","B","Z", "A"};
//    List L = Arrays.asList(S);
//    System.out.println(L);
   
  }
}
