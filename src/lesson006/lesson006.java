package lesson006;

/**
 * Created by combo on 01.08.2016.
 */
public class lesson006 {
    public static void main (String [] args) {
        double mm[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        double aver = 0;
        int i;
        for (i=0; i<=4; i++)
            aver = aver + mm[i];
        System.out.println("Среднее значение - "+aver/i);
    }
}
