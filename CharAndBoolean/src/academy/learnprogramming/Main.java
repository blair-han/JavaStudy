package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9'; // no double quotes
        System.out.println(myCopyrightChar);
        /*
        D
        D
        ©
         */

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        /*
        true
        false
         */

        boolean isCustomerOverTwentyOne = true;

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString +  ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // string + int = string
        System.out.println("LastString is equal to " + lastString);
        /*
        myString is equal to This is a string
        myString is equal to This is a string, and this is more.
        myString is equal to This is a string, and this is more. © 2019
        250.5549.95
        LastString is equal to 1050
         */
    }
}
