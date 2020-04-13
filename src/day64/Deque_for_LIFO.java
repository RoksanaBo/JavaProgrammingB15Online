package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        // how do we implement a lifoQue if not using old class
        // called Stack,we can use any of Deque interface implementation
        // Deque is a double ended Queue so we can add item as always
        // and when we remove we can use removeLast() method
        // to achieve last in first out.


        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say bye to java");

        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());







    }
}
