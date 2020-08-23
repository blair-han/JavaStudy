package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        /*
        Float minimum value = 1.4E-45
        Float maximum value = 3.4028235E38
         */
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        /*
        Double minimum value = 4.9E-324
        Double maximum value = 1.7976931348623157E308
         */

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        /*
        MyIntValue = 2
        MyFloatValue = 1.6666666
        MyDoubleValue = 1.6666666666666667
         */


        /*
        Convert lb to kg
        1 lb = 0.45359237 kg
        */
        double poundValue = 200;
        double kilogramValue = poundValue * 0.45359237;
        System.out.println("converted killograms : " + kilogramValue );
        /*
        converted killograms : 90.718474
        */

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        /*
        3.1415927
        3000000.456789
        */


    }
}
