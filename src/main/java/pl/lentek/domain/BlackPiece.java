package pl.lentek.domain;

public class BlackPiece extends ChessPiece {

  private final static String colorName = "black";

  public BlackPiece(String name, String numberPosition, String letterPosition) {
    super(name, numberPosition, letterPosition, colorName);
  }
}
