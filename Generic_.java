import java.util.*;

public class Generic_ {
    public static void main(String[] args) {

        // ArrayList L = new ArrayList<String>();
        ArrayList<String> L = new ArrayList<String>();
        L.add("A");
        L.add("B");
        L.add("C");
        L.add("D");
        // L.add(10);
       //  L.add(true);
        L.add(null);
        M1(L);
        System.out.println(L);
}
       public static void M1(ArrayList L) {

         L.add("Z");
         L.add(10);
         L.add(20);
         L.add(true);

}

}
