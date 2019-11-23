package pl.lentek.domain;

public class WhiteQueen extends ChessPiece {

  private final static String colorName = "white";

  public WhiteQueen(String name) {
    super(name, "1", "d", colorName);
  }
}
