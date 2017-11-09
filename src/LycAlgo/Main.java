package LycAlgo;

import java.io.IOException;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 * 难道国内的算算法题已经这么简单了吗？
 * 还有这种手动IO的？
 * 出自牛客网，瞎写的
 */
public class Main {

   // say hello
   public static void main(String[] args) {

       try {

           testConsumer();
       } catch (Exception e) {

           e.printStackTrace();

       } finally {


           System.out.print("异常已处理，可以继续运行");

       }
       System.out.print("程序结束，并无错误");



    }

    public static void testConsumer() throws IOException {
        String tmp = "wocao";
        throw new IOException("haha");

    }

}
