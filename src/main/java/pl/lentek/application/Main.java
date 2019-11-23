package pl.lentek.application;

import pl.lentek.decoratos.ChickenMealDecorator;
import pl.lentek.decoratos.SauceMealDecorator;
import pl.lentek.decoratos.ShrimpMealDecorator;
import pl.lentek.domain.Meal;
import pl.lentek.domain.PotatoMeal;
import pl.lentek.domain.RiceMeal;

public class Main {

  public static void main(String[] args) {
    System.out.println("Nowy posiłek: ");
    Meal riceMeal = new RiceMeal();
    riceMeal.prepareMeal();
    System.out.println("\nNowy posiłek: ");
    Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
    riceMealWithShrimp.prepareMeal();
    System.out.println("\nNowy posiłek: ");
    Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(
        new ChickenMealDecorator(new PotatoMeal()));
    potatoMealWithChickenAndSauce.prepareMeal();
  }
}
