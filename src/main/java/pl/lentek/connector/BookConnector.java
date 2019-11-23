package pl.lentek.connector;

import java.time.LocalDate;
import pl.lentek.api.LibraryAPI;
import pl.lentek.domain.User;

public class BookConnector {

  private final User user;
  private final LibraryAPI api;

  public BookConnector(User user, LibraryAPI api) {
    this.user = user;
    this.api = api;
  }

  public boolean checkAvailability(String title) {
    return api.isAvailable(title);
  }

  public boolean reserve(String title, User user) {
    return api.reserve(title, user.getPESEL());
  }

  public LocalDate whenToReturn(String title, User user) {
    return api.dueDate(title, user.getPESEL());
  }
}
