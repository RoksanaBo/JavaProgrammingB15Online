package differentCodes;

public class How_ManyA_InWord {

    public static void main(String[] args) {

        String name = "Roksana Botcieva";
        int countOfA = 0;

        for (int i = 0; i < name.length(); i++) {

            System.out.println(name.charAt( i ));

            if(name.charAt(i) == 'a'){
                System.out.println("found it!!!");
                ++countOfA;
            }

        }
        System.out.println("count of a = " + countOfA);






    }
}
