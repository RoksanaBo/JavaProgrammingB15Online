package b12;

public class Remove_Duplicates_String {

    public static void main(String[] args) {


    String a = RemoveDup("abcabc");
    System.out.println(a);

        System.out.println(RemoveDup("abcabc"));


    }

    public static String RemoveDup(String str){

        String result = "";
        for (int i = 0; i <str.length() ; i++) {

            if( ! result.contains( str.substring(i, i+1))){
                result += str.substring(i,i+1);
            }

        }return result;
    }
}
