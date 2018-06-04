package testSocket.TCPIPSOCKET;

import java.net.*;
import java.util.Enumeration;

public class InetAddressExample {

  public static void main(String[] args) {
    try {
      // 返回一个列表，包含了主机每一个接口所对应的NetworkInterfa实例
      Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
      if (interfaceList == null) {
        System.out.println("-- No interfaces found");
      } else {
        while (interfaceList.hasMoreElements()) {
          NetworkInterface iface = interfaceList.nextElement();
          System.out.println("Interface" + iface.getName() + ":");
          Enumeration<InetAddress> addrList = iface.getInetAddresses();
          if (!addrList.hasMoreElements()) {
            System.out.println("\t(No address for this interface)");
          }
          while (addrList.hasMoreElements()) {
            InetAddress address = addrList.nextElement();
            System.out.println("\tAddress " + (address instanceof Inet4Address ? "(v4)"
                : (address instanceof Inet6Address ? "(v6)" : "(?)")));
            System.out.println(": " + address.getHostAddress());
          }
        }
      }
    } catch (SocketException e) {
      System.out.println("error getting network interfaces:" + e.getMessage());
    }


    for (String host : args) {
      try {
        System.out.println(host + ":");
        InetAddress[] addressList = InetAddress.getAllByName(host);
        for (InetAddress address : addressList) {
          System.out.println("\t"+address.getHostName()+"/"+address.getHostAddress());
        }
      } catch (UnknownHostException e) {
        System.out.println("\tUnable to find address for"+host);
      }
    }
  }
}
