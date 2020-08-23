package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
        /*
        1 + 2 = 3
        previousResult = 3
        3 - 1 = 3
        2 * 10 = 20
        20 / 5 = 4
        4 % 3 = 1
        */

        // result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result); // 1 + 1 = 2

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result); // 2 - 1 = 1

        //result = result + 1;
        result += 2;
        System.out.println("1 + 2 = " + result); // 1 + 2 = 3

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result); // 3 * 10 = 30

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result); // 30 / 3 = 10

        // result = result - 2
        result -= 2;
        System.out.println("10 - 2 =" + result); //10 - 2 =8

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }else{
            System.out.println("It is an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        // && = AND
        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        // || = OR
        if((topScore > 90) || (topScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50 ){ // if we put = instead of == error occurs.
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true){ // Although we put = instead of == error doesn't occur...
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false; // Ternary Operator
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Quiz
        double doubleValue = 20.00d;
        double secondDoubleValue = 80.00;
        double multiplyValue = (doubleValue + secondDoubleValue) * 100.00d; // 1000.0
        double remainderValue = multiplyValue % 40.00d; //0.0
        boolean isNoRemainder = (remainderValue == 0) ? true : false;

        System.out.println(isNoRemainder); //true
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }


    }

}
