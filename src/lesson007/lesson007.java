package lesson007;

/**
 * Created by Owner on 02.08.2016.
 */
public class lesson007 {
    public static void main (String [] args) {
        int month = 13;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "fol";
        else
            season = "it's a dreams";
        System.out.println(month + " month - " + season);
    }
}
