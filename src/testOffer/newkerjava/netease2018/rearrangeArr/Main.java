package testOffer.newkerjava.netease2018.rearrangeArr;

import java.util.Scanner;
public class Main {
  public static void  main(String[] args){
    Scanner in = new Scanner(System.in);
    //ArrayList<String> list = new ArrayList<String>();
    while(in.hasNext()){
      int t = in.nextInt();
      for(int i = 0;i<t;i++){
        int n = in.nextInt();
        int a[] = new int[n];
        for(int j = 0;j<n;j++){
          a[j] = in.nextInt();
        }
        int mod4_num=0 , mod2_num=0,odd=0;
        for(int k = 0;k<a.length;k++){
          if(a[k] % 4 ==0){
            mod4_num++;
          }else if(a[k] % 2 ==0){
            mod2_num++;
          }else{
            odd++;
          }
        }
        if(mod2_num > 0){
          if(mod4_num >= odd){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }else{
          if(mod4_num >=(odd-1)){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }
      }
    }

  }
}