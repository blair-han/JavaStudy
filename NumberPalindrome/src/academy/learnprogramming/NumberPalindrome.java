package academy.learnprogramming;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int reverseNum = 0;
        int originalNum = number;

        while(Math.abs(number)>0) {
            int remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number = number / 10;
        }

        if (reverseNum == originalNum) {
            return true;
        }else{
            return false;
        }
    }
}
