package testOffer.mogujie.quanpailie;

import java.util.*;

public class Main {

  private static Set<String> stringSet = new HashSet<>();
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    Permutation(s.toCharArray(), 0, s.length()-1);
    Object[] tmp =  stringSet.toArray();
    Arrays.sort(tmp);
    for(int i = 0 ; i < tmp.length-1;i++) {
      System.out.print(tmp[i]+" ");
    }
    System.out.println(tmp[tmp.length-1]);

  }


  public static void Permutation(char[] s, int from, int to) {
    if(to<=1)
      return;
    if(from == to){
      stringSet.add(new String(s));
    }
    else{
      for(int i=from;i<=to;i++){
        swap(s,i,from);
        Permutation(s,from+1,to);
        swap(s,from,i);
      }
    }
  }

  public static void swap(char[] s, int i, int j) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }

}
