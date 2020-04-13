package differentCodes;

public class Turn_StringIntoNumber {

    public static void main(String[] args) {

        String empID = "FB-457";

        String[] empIDsplit = empID.split("-");
        String idStr = empIDsplit[1];
        int id = Integer.parseInt(idStr);

        System.out.println("id = " + id);

        // OR in one shot :
        //  int id = Integer.parseInt( empID.split("-")[1] ) ;

        System.out.println("-------------------------------------------------------------------------");



//     add them and give the result 700
        String num1Str = "100";
        String num2Str = "600";

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        System.out.println("sum of num1 and num2 = " + (num1 + num2));




    }
}
