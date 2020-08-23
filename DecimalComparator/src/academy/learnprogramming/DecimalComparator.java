package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        // condition 1: sign should be the same
        // condition 2: 3 decimal places should be the same

        if(extractThreeDecimalPlaces(num1) == extractThreeDecimalPlaces(num2)){
            return true;
        }else{
            return false;
        }
    }

    public static int extractThreeDecimalPlaces(double doubleNumber){
        return (int) (doubleNumber * 1000 - (int)doubleNumber * 1000);
    }
}
