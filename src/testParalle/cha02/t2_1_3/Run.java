package testParalle.cha02.t2_1_3;

public class Run {
  public static void main(String [] a){
    HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
    HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
    ThreadA aa = new ThreadA(numRef1);
    aa.start();
    ThreadB bb= new ThreadB(numRef2);
    bb.start();

  }

}
