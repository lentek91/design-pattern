package pl.lentek.decoratos;

import pl.lentek.domain.Meal;

public class SauceMealDecorator extends MealDecorator {

  public SauceMealDecorator(Meal meal) {
    super(meal);
  }

  @Override
  public void prepareMeal() {
    meal.prepareMeal();
    addSauce();
  }

  private void addSauce() {
    System.out.println("Posiłek polewam sosem.");
  }
}
