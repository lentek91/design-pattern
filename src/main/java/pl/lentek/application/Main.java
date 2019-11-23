package pl.lentek.application;

import pl.lentek.api.APIAdapter;
import pl.lentek.api.LibraryAPIv2;
import pl.lentek.api.LibraryAPIv2Impl;
import pl.lentek.connector.BookConnector;
import pl.lentek.domain.User;

public class Main {

  public static void main(String[] args) {

    User user = new User("Paweł","Cwik","32131212");
    LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
    APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
    BookConnector connector = new BookConnector(user,apiAdapter);
    connector.checkAvailability("Harry Potter i Zakon Feniksa");
  }
}
