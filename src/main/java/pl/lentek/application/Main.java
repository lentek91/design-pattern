package pl.lentek.application;

import pl.lentek.domain.BlackPiece;
import pl.lentek.domain.BlackQueen;
import pl.lentek.domain.ChessPiece;
import pl.lentek.domain.WhitePiece;
import pl.lentek.domain.WhiteQueen;

public class Main {

  public static void main(String[] args) {
    ChessPiece blackPawn = new BlackPiece("Czarny Pionek", "7", "a");
    ChessPiece whitePawn = new WhitePiece("Biały Pionek", "2", "a");
    ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
    ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
    //exactly same color object is used
    System.out.println(blackPawn.getColor() == blackQueen.getColor());
    System.out.println(whitePawn.getColor() == whiteQueen.getColor());
  }
}
