package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        /*
        Integer Minimum Value = -2147483648
        Integer Maximum Value = 2147483647
        Busted Minimum Value = 2147483647
        Busted Maximum Value = -2147483648
         */

        int myMaxIntTest = 2_147_483_647;


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        /*
        Byte Minimum Value = -128
        Byte Maximum Value = 127
         */

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); 
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        /*
        Short Minimum Value = -32768
        Short Maximum Value = 32767
        */

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinLongValue);
        System.out.println("long Maximum Value = " + myMaxLongValue);
        /*
        long Minimum Value = -9223372036854775808
        long Maximum Value = 9223372036854775807
         */
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        /*
        Primitive Types Challenge
         */
        byte byteNum = 100;
        short shortNum = 32000;
        int intNum = 300;
        long longNum = 50000L;
        System.out.println(longNum + (byteNum + shortNum + intNum) * 10);

    }
}
