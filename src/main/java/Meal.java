public enum Meal{

  APPETIZER(Food.Appetizer.class),
  MAINCOURSE(Food.MainCourse.class),
  DESSERT(Food.Dessert.class),
  COFFEE(Food.Coffee.class);
  private Food[] values;

  private Meal(Class<? extends Food> kind) {
    values = kind.getEnumConstants();
  }
  }
 interface Food {
  enum Appetizer implements Food{
    SALAD,SOUP,SPRING_ROLLS;
  }
  enum MainCourse implements Food{
    LASAGNE,BURRITO,PAD_THAI,
    LENTILS,HUMMOUS,VINDALOO;
  }
  enum Dessert implements Food{
    TIRAMISU,GELATO,BLACK_FOREST_CAKE,
    FRUIT,CREME_CARAMEL;
  }
  enum Coffee implements Food{
    BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,
    LATTE,CAPPUCCINO,TEA,HERB_TEA;
  }
}
 class TypeOfFood{
  public static void main(String[] args) {
    Food food = Food.Appetizer.SALAD;
    food = Food.MainCourse.LASAGNE;
    food = Food.Dessert.GELATO;
  }

}
