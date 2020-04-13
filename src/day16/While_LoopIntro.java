package day16;

public class While_LoopIntro {

    public static void main(String[] args) {

        // print Hello world 5 times and also
        // keep the count how many times you said hello

        int count = 1;
        System.out.println("Hello World");
        ++count ;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");

        System.out.println("Count is " + count);

        System.out.println("_____________________________________________");
        int cnt = 1;
        while (cnt <=5) {
            System.out.println("Hello World");
            System.out.println("cnt value is " + cnt);
            ++cnt; // increase the value by one
        }
        // 1st time in the loop: cnt = 1
        //   1<=5 ---> true
        //   hello word
        //    cnt value is 1
        //   increase the cnt value to 2

        //   2nd time:
        // check this 2<=5 ---->
         //      hello word
        //     cnt value is 2
        //    increase the cnt value to 4


        //   3rd time: cnt = 3
        // check this 3<=5 ---->
        //      hello word
        //     cnt value is 3
        //    increase the cnt value to 4


        //   4th time:  cnt = 4
        // check this 2<=5 ---->
        //      hello word
        //     cnt value is 4
        //    increase the cnt value to 5


        //   5th time: cnt = 5
        // check this 5<=5 ---->
        //      hello word
        //     cnt value is 5
        //    increase the cnt value to 6

        // 6th time in loop: cnt = 6
        // chek this 6<=5 ----> false
      //    GET OUT OF THE LOOP!!!












    }
}
