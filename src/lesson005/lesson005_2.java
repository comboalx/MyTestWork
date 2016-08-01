package lesson005;

/**
 * Created by combo on 01.08.2016.
 */
public class lesson005_2 {
    public static void main (String args []) {
        byte b;
        int a = 257;
        double d = 323.142;
        System.out.println("Преобразование типа int в byte");
        b = (byte) a;
        System.out.println("int = "+a+" byte = "+b);
        System.out.println("Преобразование типа double в byte");
        b = (byte) d;
        System.out.println("double = "+d+" byte = "+b);
    }
}
