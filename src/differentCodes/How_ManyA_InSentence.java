package differentCodes;

public class How_ManyA_InSentence {

    public static void main(String[] args) {

        String name = "Roksana Botcieva Bars Gadiati";

        int countOfA = 0;

        for (int i = 0; i < name.length(); i++) {

                                                     // mojno pisat chtob bilo poniatnee:
            if(name.charAt(i) == 'a'){               // char currentChar = name.charAt( i );
                ++countOfA;                            // if(currentChar == 'a ) {...........
            }
        }
        System.out.println("count of a = " + countOfA);





    }
}
