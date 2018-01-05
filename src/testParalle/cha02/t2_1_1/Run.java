package testParalle.cha02.t2_1_1;

public class Run {

  public static void main(String[] args){
    HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
    ThreadA a = new ThreadA(hasSelfPrivateNum);
    a.start();
    ThreadB b = new ThreadB(hasSelfPrivateNum);
    b.start();

  }
}
