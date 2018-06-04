package testParalle.cha02.synLockIn_1;

public class Service {
  // 说明了 syn是可重用锁
  synchronized public void service1() {
    System.out.println("servicce1");
    service2();
  }

  synchronized public void service2() {
    System.out.println("service2");
    service3();
  }

  synchronized public void service3() {
    System.out.println("service3");
  }
}
