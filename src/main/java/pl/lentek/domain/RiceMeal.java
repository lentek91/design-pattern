package pl.lentek.domain;

public class RiceMeal extends Meal {

  @Override
  public void prepareMeal() {
    System.out.println("Przygotowuję posiłek na bazie ryżu.");
  }
}
