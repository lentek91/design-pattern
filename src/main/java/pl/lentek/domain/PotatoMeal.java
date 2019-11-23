package pl.lentek.domain;

public class PotatoMeal extends Meal {

  @Override
  public void prepareMeal() {
    System.out.println("Przygotowuję posiłek na bazie ziemniaków.");
  }
}
