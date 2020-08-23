package academy.learnprogramming;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        int sum = 0;
        int remainder = 0;
        if(number<0){
            return -1;
        }else{
            for(int i=1 ; number > 0 ; i++) {
                remainder = number % 10;
                number = number / 10;
                if (remainder % 2 == 0) {
                    sum = sum + remainder;
                }
            }
            return sum;
        }
    }
}
