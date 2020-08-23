package academy.learnprogramming;

public class LastDigitChecker {

    public static boolean isValid(int num) {
        if (num < 10) {
            return false;
        } else if (num > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            num1 = num1 % 10; // num1 last digit
            num2 = num2 % 10; // num2 last digit
            num3 = num3 % 10; // num3 last digit

            if (num1 == num2) {
                return true;
            } else if (num1 == num3) {
                return true;
            } else if (num2 == num3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
