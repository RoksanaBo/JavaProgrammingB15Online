package differentCodes;

public class Find_NonDublicated_String_InArray {

    public static void main(String[] args) {

        String fiveMinutes = "abcabcdeedddeeefffffjjjj";
        String[] EachChar = fiveMinutes.split("");
        String result = "";  // to store all non duplicated String objects of the array

        for (String each : EachChar) {
            if (!result.contains(each)) {
                result += each;
            }
        }

        System.out.println(result);

    }
}
