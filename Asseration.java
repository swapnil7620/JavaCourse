public class Asseration {
    public static void main(String[] args)  {
        int x = 10;
        System.out.println(x);
        System.out.println("hi");

        // assert (x > 10);// simple version
        // assert (x > 10):"x value should be greater than 10 but is not";//Agumented version (in which we can add description , using Agumented version colon is necessary )
    //   Note: 1)  //    assert (x ==  10):++x; if its true then second case (++x) will not perform if it is false then it will perform ++x operation
        
        System.out.println(x);

    }

}
