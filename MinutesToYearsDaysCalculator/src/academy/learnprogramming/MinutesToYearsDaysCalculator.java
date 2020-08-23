package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(minutes + " min = " + (int)(minutes/(60*24*365))
                    + " y and "+(int)(minutes%(60*24*365))/(60*24) + " d");
        }

    }
}
