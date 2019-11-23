package pl.lentek.decoratos;

import pl.lentek.domain.Meal;

public class ChickenMealDecorator extends MealDecorator {

  public ChickenMealDecorator(Meal meal) {
    super(meal);
  }

  @Override
  public void prepareMeal() {
    meal.prepareMeal();
    addChicken();
  }

  private void addChicken() {
    System.out.println("Do posiłku dodaje kurczaka");
  }
}
