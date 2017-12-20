package LycAlgo;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 */
public class Main {

    public static Integer nul;
   // say hello
   public static void main(String[] args) throws IOException {
       mySqrt(1);


    }

    public static int mySqrt(int x) {

       for(int i = 0 ; i < x ; i ++){
           if(i*i > x){
               return i-1;
           }
       }
       System.out.println(46340*46340);
        return 0;

    }

    public static void testConsumer() throws IOException {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

    }

}
