package lesson_class;

/**
 * Created by combo on 05.08.2016.
 */
class Box {
    double width, height, depth;
    void volume() {
        System.out.print("Объем равен = ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo {
    public static void main(String [] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        //calc )
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("V = "+vol);
    }
}

class BoxDemo2 {
    public static void main(String [] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // значения
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println(vol);
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println(vol);
    }
}

class BoxDemo3 {
    public static void main(String [] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // значения
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        mybox1.volume();
        mybox2.volume();
    }
}

class Box1 {
    double widht, height, depth;
    double volume () {
        return widht * height * depth;
    }
    void setDim(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }
}
class BoxDemo5 {
    public static void main(String [] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
        //init
        mybox1.setDim(12, 20, 15);
        mybox2.setDim(3, 6, 9);
        //calc
        System.out.println("V1 = "+mybox1.volume());
        System.out.println("V1 = "+mybox2.volume());
    }
}