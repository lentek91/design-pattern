package pl.lentek.domain;

public class WhitePiece extends ChessPiece {

  private final static String colorName = "white";

  public WhitePiece(String name, String numberPosition, String letterPosition) {
    super(name, numberPosition, letterPosition, colorName);
  }
}
