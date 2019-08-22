package Flyweight.Chess;

public abstract class ChessPiece {

String name;
String numberPosition;
String letterPosition;
Color color;


    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color) {
            case "black":
                this.color = ColorRepository.getBlack();
                 default:
                     this.color = ColorRepository.getWhite();
        }
        }

    public Color getColor() {
        return color;
    }
}
