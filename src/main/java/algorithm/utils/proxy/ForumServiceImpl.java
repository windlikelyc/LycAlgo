package algorithm.utils.proxy;

/**
 * Created by lyc on 2017/9/22.
 */
public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId) {

        //这些代码污染了纯粹的逻辑
//        PerformanceMonitor.begin("LycAlgo.utils.proxy.ForumServiceImpl.removeTopic");

        System.out.println("模拟删除Topic记录" + topicId);

        try {
            Thread.currentThread().sleep(20);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
//        PerformanceMonitor.begin("LycAlgo.utils.proxy.ForumServiceImpl.removeForum");
        System.out.println("模拟删除Forum记录" + forumId);
        try {
            Thread.currentThread().sleep(20);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        PerformanceMonitor.end();
    }

}
