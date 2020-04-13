package b12.Encapsulation;

public class TestData {

    // instance variable:
   private String Name = "Bekir";// data is not visible to any other classes


   // getter : just to read
    //  etot metod is String is return type
   public String getName(){   // read the private data only
       return Name;
   }




   private int ID = 897;
   //  getter: just to read
   public int getID(){
       return ID;
   }



  // setter: to change the value:
   public void setName(String Name){
       this.Name = Name;
   }


   public void setID(int ID){
       this.ID=ID;
   }

}
