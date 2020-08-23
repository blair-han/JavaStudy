package academy.learnprogramming;

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){
        int limitTemp  = (summer)? 45 : 35;
        if (temperature >= 25 && temperature <= limitTemp){
            return true;
        }else{
            return false;
        }
    }
}
