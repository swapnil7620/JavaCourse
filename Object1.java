/*
class Object1 {

   public static void main(String[] args) {
      /*
       * //Case: 1) -- Mutable And Imutable
       * // String
       * String S="System & ";
       * // S.concat("Solution");
       * // System.out.println(S);
       * //need to create new object
       * String A = S.concat("Solution");
       * System.out.println(A);
       */
      /* StringBuffer */
      /*
       * StringBuffer SB=new StringBuffer("System & ");
       * SB.append("Solution");
       * System.out.println(SB);
       */

      // Case: 2) -- equals operator and method // StringBuffer not overriden equals
      // method for content comparison

      /*
       * String s1=new String("bhaskar");
       * String s2=new String("bhaskar");
       * System.out.println(s1==s2);//false
       * System.out.println(s1.equals(s2));//true
       * 
       * StringBuffer sb1=new StringBuffer("bhaskar");
       * StringBuffer sb2=new StringBuffer("bhaskar");
       * System.out.println(sb1==sb2);//false
       * System.out.println(sb1.equals(sb2));//false
       */

      /*
       * byte[] b={100,101,102};
       * String s=new String(b);
       * System.out.println(s);//def
       * }
       */

      // Important Method of String Class:

      // 1) public char charAt(int index);
      // Returns the character locating at specified index.
      /*
       * String S=("Swapnil");
       * System.out.println(S.charAt(0));
       * System.out.println(S.charAt(3));
       * System.out.println(S.charAt(5));
       */

      // 2) public String concat(String str);
      /* 
      String S = ("Swapnil");
      S = S.concat(" Mahajan");//All Three Ways Re valid for String Concatnation
      // S = S + " Mahajan";//All Three Ways Re valid for String Concatnation
      // S += " Mahajan";//All Three Ways Re valid for String Concatnation
      System.out.println(S);
      */

     // 3)  public boolean equals(Object o);
       //For content comparision , where case is important.
       //For Email validation used equalIgnoreCase but for Password use equals Method
/* 
       String S=("SWAPNIL");
       System.out.println(S.equals("swapnil"));
       System.out.println(S.equalsIgnoreCase("swapnil"));
*/

//5) public String substring(int begin);
  //Return the substring from begin index to end of the string.
  /* 
  String S="Swapnil";
  System.out.println(S.substring(2));
   */

  // 6) public String substring(int begin, int end);
  // Returns the substring from begin index to end-1 index.
  /* 
  String S="Swapnil";
  System.out.println(S.substring(2,5));
  */

  // 7) public int length();
  //Returns the no of characters present in the string.
  /* 
      String S="Swapnil";
      System.out.println(S.length());
 */


 //8) public String replace(char old,char new);
// To replace every old character with a new character.
/* 
 String S="SSSS";
 System.out.println(S.replace('S','B'));
*/
//9)public String toLowerCase();
// Converts the all characters of the string to lowercase.
/* 
String s="SWAPNIL";
System.out.println(s.toLowerCase());

//10) public String toUpperCase();
// Converts the all characters of the string to uppercase.
String S="swapnil";
System.out.println(S.toUpperCase());
*/

/* 11) trim() Method use for to remove spaces from begining and ending */
/* 
String S="   swapnil ";
System.out.println(S.trim());
System.out.println(S);
System.out.println(S.length());
*/

/* 12) indexOf() to find the index of an string */
/* 
String S="Swapnil";
System.out.println(S.indexOf('a'));
System.out.println(S.lastIndexOf('S'));
*/

// StringBuffer class
// 1) Empty StringBuffer() constructor
/*
StringBuffer SB= new StringBuffer();
System.out.println(SB.capacity());
SB.append("abcdefghijklmnopq");
System.out.println(SB.capacity());
 */
// 2) StringBuffer sb=new StringBuffer(int initialcapacity);
/* 
StringBuffer SB=new StringBuffer(20);
System.out.println(SB.capacity());
*/

//3) StringBuffer sb=new StringBuffer(String s);
/* 
StringBuffer SB=new StringBuffer("Swapnil");
System.out.println(SB.capacity());//23
*/

/*Important methods of StringBuffer:

1) public int length();
 Return the no of characters present in the StringBuffer.
2) public int capacity();
 Returns the total no of characters but a StringBuffer can accommodate(hold).
3) public char charAt(int index);
 It returns the character located at specified index. 
4) public void setCharAt(int index,char ch);
 To replace the character locating at specified index with the provided character.
5) public StringBuffer insert(int index,String s);
   To insert at the specified location.
6) public StringBuffer reverse();
  To Reverse the order of sequence
7) public void setLength(int length);
   Consider only specified no of characters and remove all the remaining characters.  
8) public void ensureCapacity(int initialcapacity);
   To increase the capacity dynamically based on our requirement.
9) public void trimToSize();
   To deallocate the extra free memory such that capacity and size are equal.   
 
   }
}
   */
