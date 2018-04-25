package testParalle.cha06.singleton_7_1;

import java.io.*;

public class SaveAndRead {
  public static void main(String[] args) {
    try {
      MyObject myObject = MyObject.getInstance();
      FileOutputStream fos = new FileOutputStream(
          new File("myObjectFile.txt")
      );
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(myObject);
      oos.close();
      fos.close();
      System.out.println(myObject.hashCode());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


    try{
      FileInputStream fin = new FileInputStream(
          new File("myObjectFile.txt")
      );
      ObjectInputStream ios = new ObjectInputStream(fin);
      MyObject myObject = (MyObject) ios.readObject();
      ios.close();
      fin.close();
      System.out.println(myObject.hashCode());

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}
