package b12.Encapsulation;

public class Test {

    public static void main(String[] args) {

        TestData obj = new TestData();
      //  System.out.println(obj.Name);  // hide this data-encapsulaton. BECAUSE ACCESS MODIFIER IS private

        System.out.println(obj.getName());  //

        String str = obj.getName();

     //   System.out.println(obj.ID);
        System.out.println(obj.getID());
        int a = obj.getID();



        // modify:
        obj.setName("Muhtar");
        System.out.println(obj.getName());


        obj.setID(400);
        System.out.println(obj.getID());












    }
}
