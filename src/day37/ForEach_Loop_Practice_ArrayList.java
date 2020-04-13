package day37;

import java.util.ArrayList;

public class ForEach_Loop_Practice_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnuri");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");

        for (String currentName : nameLst) {
            System.out.println("current name - "+ currentName);
        }


    }
}
