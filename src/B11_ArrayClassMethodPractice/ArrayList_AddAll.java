package B11_ArrayClassMethodPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_AddAll {

    public static void main(String[] args) {


        String[] allNames = {"Hakan","Roksana","Bars"};

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Almaz", "Ibrahim", "Tabi"));

        names.addAll( Arrays.asList(allNames));
        System.out.println(names);










    }
}
