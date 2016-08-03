package lesson008;

/**
 * Created by combo on 03.08.2016.
 */
public class lessons008_4 {
    public static void main(String [] args) {
        int nums[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int sum = 0;
        for (int i : nums) {
            System.out.print(" "+i+" + ");
            sum += i;
        }
        System.out.println("Сумма равна"+sum);
    }
}
