import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringTokenizer;
import java.util.regex.*;

/* 
public class RegularExpression {
    public static void main(String[] args) {
        int count = 0;
        Pattern P = Pattern.compile("abc");
        Matcher M = P.matcher("abcdabcdacab");
        while (M.find()) 
        {
            ++count;
            System.out.println(M.start() + ".... " + M.end() + "..." + M.group());
        }
        System.out.println("Total Number of match pattern is  " + count);
    }

}
*/

/* 

public class RegularExpression {
    public static void main(String[] args) {
        int count = 0;
       // Pattern P = Pattern.compile("[abc]");//including abc
       // Pattern P = Pattern.compile("[^abc]");//excluding abc
     //   Pattern P = Pattern.compile("[a-z]"); lowercase a to z
      //  Pattern P = Pattern.compile("[A-Z]");//capital A to Z 
     //   Pattern P = Pattern.compile("[a-zA-z]");//including all upper and lower case 
       // Pattern P = Pattern.compile("[^0-9a-zA-Z]");//Except any AlphabetNumeric means spacial symbol
    //    Pattern P = Pattern.compile("\\s");//for finding space
    //    Pattern P = Pattern.compile("\\S");//for Spliting value
    //    Pattern P = Pattern.compile("\\d");//for any digit
    //    Pattern P = Pattern.compile("\\D");//for Except a digit
    //    Pattern P = Pattern.compile("\\w");// Any AlphaNumeric(AnyWord Character)
    //      Pattern P = Pattern.compile("\\W");// Except Except AlphaNumeric
        // Pattern P = Pattern.compile(".");// Any Character
        //   Pattern P = Pattern.compile("a");// Exactly Onc 'a'
        //  Pattern P = Pattern.compile("a+");// At least One 'a'
        // Pattern P = Pattern.compile("a*");// Any number including Zero 'a'
        Pattern P = Pattern.compile("a?");// At most one 'a'
      
        Matcher M = P.matcher("eABAfbaace14a8b9 ca234@#$");
        while (M.find()) {
            ++count;
            System.out.println(M.start() + " " + M.end() + " " + M.group());         
          }
          
          System.out.println(count);
       }
    }
       */

/* 
public class RegularExpression {
    public static void main(String[] args) {
        // Split() Method

        // Pattern P = Pattern.compile("a");
        // Pattern P = Pattern.compile("\\s");
        // Pattern P = Pattern.compile("\\@");
           Pattern P = Pattern.compile("[.]");//or \\.

        String S[] = P.split("www.Swapnil Kishor Mahajan");
        for (String S1 : S) {
            System.out.println(S1);

        }
    }
}
    */
/* 
//StringTokenizer  // default used to split the string
public class RegularExpression{
    public static void main(String[]args){
        // StringTokenizer ST= new StringTokenizer("Swapnil Kishor Mahajan");
        StringTokenizer ST= new StringTokenizer("10-10-2010", "-");
        while(ST.hasMoreTokens()){
        System.out.println(ST.nextToken());
        }
    }
}
    */

// Write a program to represent all valid 10 digit mobile Number    

public class RegularExpression {
    public static void main(String[] args) {

        Pattern P = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher M = P.matcher(args[0]);
        if (M.find()&&M.group().equals(args[0])) 
        {
            System.out.println("Valid Mobile Number");
        }
        else 
        {
            System.out.println("Invalid Mobile Number");
        }
    }
}

/* 
class RegularExpression {
    public static void main(String[] args) {

       // Pattern p=Pattern.compile("[7-9][0-9]{9}");
       Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");

        Matcher m = p.matcher(args[0]);
        if (m.find() && m.group().equals(args[0])) 
        {
            System.out.println("valid number");
        }
         else {
            System.out.println("invalid number");
        }
    }
}

*/
