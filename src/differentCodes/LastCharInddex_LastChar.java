package differentCodes;

public class LastCharInddex_LastChar {
    public static void main(String[] args) {


        String name = "Roksana";
        int charCount = name.length();

        int lastCharIndex = charCount-1;
        System.out.println("last char index = " + lastCharIndex);

        char lastChar = name.charAt((lastCharIndex));
        System.out.println("last char = " + lastChar);

        System.out.println("last character in one shot = " + name.charAt(name.length()-1));
    }
}
