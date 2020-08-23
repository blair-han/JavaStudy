package academy.learnprogramming;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int lastDigit = 0;
        int firstDigit = 0;

        if(number < 0){
            return -1;
        }else{
            for(int i=0; number > 0;i++){
                if(i == 0) {
                    lastDigit = number % 10;
                    firstDigit = number % 10;
                }

                if(number < 10){
                    firstDigit = number;
                }

                number = (number / 10);
            }
            return (lastDigit+firstDigit) ;
        }
    }

}
