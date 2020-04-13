package day58;

public class RuntimeErrorDemo {

    static int num = 0;

    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        // call main method again
        main(null);


        // whenever method is called in Java, a frame is
        // placed in Stack memory for that method
        // call. If method calls itself recursively,  рекурсивно
        // another frame is placed on existing frame.
        // If it keeps continuing,
    }
}
