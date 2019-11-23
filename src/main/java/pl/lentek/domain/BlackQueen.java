package pl.lentek.domain;

public class BlackQueen extends ChessPiece {

  private final static String colorName = "black";

  public BlackQueen(String name) {
    super(name, "8", "d", colorName);
  }
}
