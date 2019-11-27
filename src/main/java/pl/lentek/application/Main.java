package pl.lentek.application;

import pl.lentek.application.domain.Ania;
import pl.lentek.application.domain.Antek;
import pl.lentek.application.domain.Child;
import pl.lentek.application.domain.Shelf;
import pl.lentek.application.domain.Tomek;
import pl.lentek.application.request.MotherRequest;

public class Main {

  public static void main(String[] args) {
    MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
    Child tomek = new Tomek();
    Child ania = new Ania();
    Child antek = new Antek();
    tomek.setTallerChild(ania);
    ania.setTallerChild(antek);
    tomek.processRequest(motherRequest);
  }
}
