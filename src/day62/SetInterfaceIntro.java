package day62;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {

    public static void main(String[] args) {


        //set is a data structure to store unique element.
        // HashSet implement Set interface and always default choice.

        // IT DOES NOT KEEP INSERTION ORDER      ЭТО НЕ СОХРАНЯЕТ ПОРЯДОК ВСТАВКИ
        // IT DOES NOT HAVE INDEX                ЭТО НЕ ИМЕЕТ ИНДЕКСА

        Set<Integer> myNums = new HashSet<>(); //HashSet implements the interface

        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums = " + myNums);  // printind unique elements,not duplicates!


        



    }

}
