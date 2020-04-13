package office_hour.Prac_2_3;

public class BankOfAmerica {

    public static void main(String[] args) {

        BusinessAnalyst Mohamed = new BusinessAnalyst("Mohamed",156000);
        Mohamed.getEmployeeInfo();

        BusinessAnalyst Parvin = new BusinessAnalyst("Parvin",145000);

        Testers Sevim = new Testers("Sevim", "QA",120000);
        Testers Gunel = new Testers("Gunel","Manual Tester",110000);
        Testers Serife = new Testers("Serife","SDET",115000);


        Testers[] testers = { Sevim, Gunel, Serife  };

        BusinessAnalyst[] BATeam = {  Mohamed, Parvin };

        ScrumTeam[][] scrum = {testers, BATeam};

        for(ScrumTeam[]  eachArray :  scrum  ){

            for(ScrumTeam eachMember  : eachArray){
                eachMember.getEmployeeInfo();
            }
        }













    }
}
