package LycAlgo.utils.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by lyc on 2017/9/22.
 */
public class Test {
    public static void main(String[] args) {
//        ForumService forumService = new ForumServiceImpl();
//        forumService.removeForum(30);
//        forumService.removeForum(1000);

        ForumService target = new ForumServiceImpl();

        PerformanceHandler handler = new PerformanceHandler(target);

        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );

        proxy.removeForum(10);
        proxy.removeTopic(200);

    }
}
