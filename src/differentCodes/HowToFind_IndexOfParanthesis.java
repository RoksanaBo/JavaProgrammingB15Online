package differentCodes;

public class HowToFind_IndexOfParanthesis {

    public static void main(String[] args) {
//                     012345678901234567890123456
        String item = "Echo Dot (3rd Gen) Charcoal";

        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");

        String wordInsideParenthesis

                = item.substring(indexOfOpeningParenthesis + 1, indexOfEndingParenthesis);

        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);


    }
}
