package day50;

public class Subtraction extends Question {


 //    it's own field:
    public Subtraction(int num1, int num2){

//
        super("Subtraction question", "-");


        if(num1<num2){
            int temp = num1;
            num1=num2;
            num2 = temp;
        }

//     after making sure num1 is more than num2,we set the field value
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override// CALCULATE RESULT FOR SUBTRACTION
    public void calculate(){
        answer = num1-num2;

        calculated = true;  // calculated is the instance field to keep track of the Question
                            //  is calculated or not.
    }


    @Override
    public String toString() {

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }

    }
}
