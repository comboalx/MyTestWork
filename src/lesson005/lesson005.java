package lesson005;

/**
 * Created by combo on 01.08.2016.
 */
public class lesson005 {
    public static void main (String args []) {
        int day, lspeed = 3_000_000;
        long seconds, distance;
        day = 15;
        seconds = day * 24 * 60 * 60;
        distance = lspeed * seconds;
        System.out.println("За "+day+" дней, солнечный свет пройдет - "+distance+" метров");
    }
}
