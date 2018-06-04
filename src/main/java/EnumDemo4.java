enum Color{GREEN,RED, BLUE}
public class EnumDemo4 {

  public static void printName(Color color) {
    switch (color) {
      case BLUE:
        System.out.println("蓝色");
        break;
      case RED:
        System.out.println("hongse");
        break;
      case GREEN:
        System.out.println("lvse ");
        break;
    }
  }

  public static void main(String[] args) {
    printName(Color.BLUE);
  }
}
