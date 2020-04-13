package differentCodes;

public class Find_longest_Word_In_Array {

    public static void main(String[] args) {


        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String longestWord = words[0];

        for (String currentWord : words) {
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        System.out.println(longestWord);


    }
}
