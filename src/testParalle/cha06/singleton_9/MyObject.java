package testParalle.cha06.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//public enum MyObject {
//  connectionFactory;
//  private Connection connection;
//  private MyObject(){
//    try{
//      System.out.println("掉用了myObject构造");
//      String url = "jdbc:mysql://39.106.39.216/doubandb";
//      String username = "root";
//      String password = "admin123";
//      String driveName = "com.mysql.jdbc.Driver";
//      Class.forName(driveName);
//      connection = DriverManager.getConnection(url, username, password);
//
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }
//  }
//
//  public Connection getConnection() {
//    return connection;
//  }
//}

public class MyObject{
  public enum MyEnumSingleton{
    connectionFactory;
    private Connection connection;
    private MyEnumSingleton(){
      try{
        System.out.println("创建MyObject对象");
        String url = "jdbc:mysql://39.106.39.216/doubandb";
      String username = "root";
      String password = "admin123";
        String driveName = "com.mysql.jdbc.Driver";
      Class.forName(driveName);
      connection = DriverManager.getConnection(url, username, password);

      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    public Connection getConnection() {
      return connection;
    }
  }

  public static Connection getConnection(){
    return MyEnumSingleton.connectionFactory.getConnection();
  }
}