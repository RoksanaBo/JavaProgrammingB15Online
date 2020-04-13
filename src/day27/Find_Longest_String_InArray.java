package day27;

public class Find_Longest_String_InArray {

    public static void main(String[] args) {

       String [] developerTeam ={ "Vladislav" , "Hasan" , "Tolkun" , "Abide"} ;
       String [] testerTeam ={"Zhibekchach" , "Mohammed Sohrabi" , "Nursultan" };
       String [] businessAnalystTeam = {"Lisa" , "Ershad" , "Naila" };

       String [] [] scrumTeam = { developerTeam , testerTeam , businessAnalystTeam  };
       String longestString = ""; // store longest string

       // find who has longest name:

        int maxLength = scrumTeam[0] [0].length(); // who has longest name in first team

        // for each loop:
        for( String[]  each1DArray   :  scrumTeam   ){
            for( String eachElement  :  each1DArray  ){
                if(maxLength < eachElement.length()  ){
                   maxLength = eachElement.length();
                   longestString=eachElement;
                }
            }
        }
        System.out.println(maxLength); // nashli longest character in string. poluchilos 16 characters
        System.out.println(longestString);

        // what String has 16 characters
        for( String[]  each1DArray   :  scrumTeam   ){
            for( String eachElement  :  each1DArray  ){
                if(maxLength == eachElement.length()  ){
                    System.out.println(eachElement);
                }
            }
        }

















    }
}
