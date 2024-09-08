import java.text.*;
import java.util.*;

class Internationalization_ {

    public static void main(String args[]) {
        /*
         * Locale l1 = Locale.getDefault();
         * System.out.println(l1.getCountry() + "....." + l1.getLanguage());
         * System.out.println(l1.getDisplayCountry() + "....." +
         * l1.getDisplayLanguage());
         * 
         * Locale l2 = new Locale("pa", "IN");
         * Locale.setDefault(l2);
         * System.out.println(l2.getCountry() + "....." + l2.getLanguage());
         * System.out.println(l2.getDisplayCountry() + "....." +
         * l2.getDisplayLanguage());
         * 
         * String[] s3 = Locale.getISOLanguages();
         * for (String s4 : s3)
         * {
         * System.out.print("ISO language is :");
         * System.out.println(s4);
         * }
         * String[] s4 = Locale.getISOCountries();
         * for (String s5 : s4)
         * {
         * System.out.print("ISO Country is:");
         * System.out.println(s5);
         * }
         * // Locale[] s = Locale.getAvailableLocales();
         * // for (Locale s1 : s)
         * // {
         * // System.out.print("Available locales is:");
         * // System.out.println(s1.getDisplayCountry() + "......" +
         * s1.getDisplayLanguage());
         * // }
         * 
         */
        /*
         * double d=123456.789;
         * String s="1234,457";
         * NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
         * System.out.println("ITALY form is :"+nf.format(d));
         * NumberFormat nf1 = NumberFormat.getInstance(Locale.UK);
         * System.out.println("UK form is :"+ nf1.format(d));
         * 
         * NumberFormat nf2 = NumberFormat.getInstance(Locale.US);
         * System.out.println("US form is :"+ nf2.format(d));
         * NumberFormat nf3 = NumberFormat.getInstance(Locale.CANADA);
         * System.out.println("CANADA form is :"+ nf3.format(d));
         */
        // Write a program to print a java number in INDIA, UK, US and ITALY currency
        // formats.
        /*
         * 
         * double d=100.123;
         * Locale INDIA = new Locale("hi", "IN");
         * NumberFormat nf = NumberFormat.getCurrencyInstance(INDIA);
         * System.out.println("INDIA notation is :" + nf.format(d));
         * 
         * NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.UK);
         * System.out.println("UK notation is :" + nf1.format(d));
         * 
         * NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
         * System.out.println("US notation is :" + nf2.format(d));
         * 
         * NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);
         * System.out.println("ITALY notation is :" + nf3.format(d));
         */
        
 /*
        NumberFormat nf = NumberFormat.getInstance();

        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(123.4));//124.4
        System.out.println(nf.format(123.4567));//123.457

        nf.setMinimumFractionDigits(3);
        System.out.println(nf.format(123.4));//123.400
        System.out.println(nf.format(123.4567));//123.457

        nf.setMaximumIntegerDigits(3);
        System.out.println(nf.format(1.234));//1.234
        System.out.println(nf.format(123456.789));//456.789

        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(1.234));//001.234
        System.out.println(nf.format(123456.789));//456.789
 */       

        // DateFormat UK=DateFormat.getDateInstance(0,Locale.UK);
        // DateFormat US=DateFormat.getDateInstance(0,Locale.US);
        // DateFormat ITALY=DateFormat.getDateInstance(0,Locale.ITALY);
        // System.out.println("UK style is :"+UK.format(new Date()));
        // System.out.println("US style is :"+US.format(new Date()));
        // System.out.println("ITALY style is :"+ITALY.format(new Date()));

        // DateFormat UK=DateFormat.getDateInstance(1,Locale.UK);
        // DateFormat US=DateFormat.getDateInstance(1,Locale.US);
        // DateFormat ITALY=DateFormat.getDateInstance(1,Locale.ITALY);
        // System.out.println("UK style is :"+UK.format(new Date()));
        // System.out.println("US style is :"+US.format(new Date()));
        // System.out.println("ITALY style is :"+ITALY.format(new Date()));

        // DateFormat UK=DateFormat.getDateInstance(2,Locale.UK);
        // DateFormat US=DateFormat.getDateInstance(2,Locale.US);
        // DateFormat ITALY=DateFormat.getDateInstance(2,Locale.ITALY);
        // System.out.println("UK style is :"+UK.format(new Date()));
        // System.out.println("US style is :"+US.format(new Date()));
        // System.out.println("ITALY style is :"+ITALY.format(new Date()));

        /*----------------Date and Time------ */
/*
        DateFormat UK=DateFormat.getDateTimeInstance(0,0,Locale.UK);
        DateFormat US=DateFormat.getDateTimeInstance(0,0,Locale.US);
        DateFormat ITALY=DateFormat.getDateTimeInstance(0,0,Locale.ITALY);
        System.out.println("UK style is :"+UK.format(new Date()));
        System.out.println("US style is :"+US.format(new Date()));
        System.out.println("ITALY style is :"+ITALY.format(new Date()));
   
   */
  
    }
}
