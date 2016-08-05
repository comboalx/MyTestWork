package lesson_stack;

/**
 * Created by combo on 05.08.2016.
 */
class Stack {
    int stck[] = new int[10];
    int tos;
    //инит. вершину стека
    Stack() {
        tos = -1;
    }
    //размещение элемента в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }
    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class TestStack {
    public static void main(String [] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //размещение числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        //извлечение чисел из стека
        System.out.println("Содержимое стека");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Содержимое стека");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}