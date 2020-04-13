package day33;

public class ReturnKeywordPractice {

    public static void main(String[] args) {
 /*
        Create a class called ReturnKeywordPractice with main
        calculateAndReturnAge
        Write a method accept a birth year and return the age :
        the birth year should be within the range of 1900-2020
        if not return 0

        optionally : test your code against array of birthYears
        {1999,122,2019, 1987, 1978,1964,3999, 2004}
  */
           calculateAgeFromBirthYear(1985);
        System.out.println(calculateAgeFromBirthYear(1985));
    }

    public static int calculateAgeFromBirthYear(int birthYear) {

        if (birthYear <= 1900 || birthYear >= 2020) {
           return 0;
        }
        return 2019-birthYear;
    }
}
