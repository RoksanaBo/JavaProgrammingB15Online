package office_hour;

public class Prac_12_18_Get_word_from_Sentence {

    public static void main(String[] args) {

        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";

        // print job title from this String: Electrical Engineer
        // logic: title is between [and ] so we need to find index of [and]
        //and use substring( right after index of  [   ,  index of]  )

        int startingIndex = employee.indexOf("[") + 1;
        int endingIndex = employee.indexOf("]");
        String title = employee.substring(startingIndex,endingIndex);
        System.out.println(title);

        // print first name-last name jobTitle:
        // String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        // logic: get first name-first word in sentence
        //        get last name - second word in sentence
        //        then concatenate with title
        //this will break if we have name more than 2 words

        // logic 2: get the full name directly using substring
        //          replace all the space in full name with-
        //          concatenate with title

        String fullName = employee.substring(0,employee.indexOf("[") );
        System.out.println(fullName);

        //Philipa Salthouse Electrical Engineer

        String fullNameWithDash = fullName.replace(" ","-");
        System.out.println(fullNameWithDash);
        System.out.println(fullNameWithDash + " "+ title);

        // logic :   get the first word and last word of your full name and get first characters of both
        ///          a full name might contains more than 2 words but we only want 2 characters for initials
        // I already have variable fullname that contains fullname
        // Bruce D Wayne  -->> BW
        // get first character using charAt(0) ,
        // get lastname first character using charAt( lastIndexOfSpace +1    )














    }
}
