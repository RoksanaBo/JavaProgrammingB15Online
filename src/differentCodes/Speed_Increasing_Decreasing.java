package differentCodes;

public class Speed_Increasing_Decreasing {

    public static void main(String[] args) {

        int start = 10;
        int end =30;


        if(start<end) {
            for(int i = start; i<=end ; i++) {
                System.out.print(i+",");
            }


        }else if(start>end){
            for(int x = start; x>end ; x--){
                System.out.print(x + ",");
            }


        }else {
            System.out.println("no action needed,same speed");
        }




    }
}
