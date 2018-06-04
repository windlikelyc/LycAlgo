package testDesignPattern.designRookie.Builder;

public class Run {
  public static void main(String[] args) {
    MealBuilder mealBuilder = new MealBuilder();

    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg meal:");
    vegMeal.showItems();

    Meal novegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("NoVeg meal:");
    novegMeal.showItems();

  }
}
