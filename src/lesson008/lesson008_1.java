package lesson008;

/**
 * Created by combo on 03.08.2016.
 */
public class lesson008_1 {
    public static void main (String [] args)
        throws java.io.IOException {
        char choice;
        do {
            System.out.println("Справка по оператору:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do while");
            System.out.println("    5. for\n");
            System.out.println("Сделайте свой выбор:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("if:\n");
                break;
        }
    }
}
