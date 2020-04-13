package office_hour.Prac_1_13;

public class AtTheBank2_OfficeHour {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();
        ba1.balance = 5000;
        ba1.deposit(10000);

//       not good -  ba1.balance = ba1.balance + 10000;

    }
}
