package day27;

public class Find_Shortest_String {

    public static void main(String[] args) {

        String [] developerTeam ={ "Vladislav" , "Hasan" , "Tolkun" , "Abide"} ;
        String [] testerTeam ={"Zhibekchach" , "Mohammed Sohrabi" , "Nursultan" };
        String [] businessAnalystTeam = {"Lisa" , "Ershad" , "Naila" };

        String [] [] scrumTeam = { developerTeam , testerTeam , businessAnalystTeam  };

        // FIND SORTEST STRING of text:

        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for(int i = 0; i <scrumTeam.length; i++) {
            for(int j=0; j< scrumTeam[i].length; j++) {
                if(minLength > scrumTeam[i][j].length()  ){
                    minLength = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);






    }
}
