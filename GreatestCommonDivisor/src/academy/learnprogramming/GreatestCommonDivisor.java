package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }else{
            int greatestNum = 1;
            for (int i = (first <= second)? first: second; i > 0 ; i--){
                if(first % i == 0 && second % i == 0){
                    greatestNum = i;
                    break;
                }
            }
            return greatestNum;
        }
    }
}
