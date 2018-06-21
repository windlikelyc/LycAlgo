package testLogger;

/**
 * @author lyc windlikelyc@gmail.com
 * @date 2018/6/14 17:53
 */

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 为了测试阿里手册中关于SLF4j的测试类
 */
public class HelloWorld {

    public static void main(String[] args) {


        BasicConfigurator.configure();

        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.error("hahah ");
    }
}
