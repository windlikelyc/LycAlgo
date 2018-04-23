package testParalle.cha03.TwoThreadTransDdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList {
  private List list = new ArrayList<>();
  public void add(){
    list.add(new Random().nextInt());
  }

  public int size(){
    return list.size();
  }
}
