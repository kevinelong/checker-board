
public class Game {
    Board board; //has-a

    Game() {
        Player a = new Player("A");
        Player b = new Player("B");
        Position[][] board = new Position[8][8];
        //TODO LOOP AND CREATE
    }

    boolean isLegal(Player player, Piece piece, Position position) {
        return true;
    }

    public void move(Player player, Piece piece, Position position) {
        if (isLegal(player, piece, position)) {
            piece.setPosition(position);
        }
    }
}

class Player {
    Piece[] pieces;
    String name;

    Player(String name) {
        this.name = name;
    }
}

class Board {
    Square[] squares; //how many? 8x8=64
}

class Position {
    int x, y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Square {
    Position position = new Position(-1, -1);
    String color = "Black";
}

class Piece {
    String color = "Black";
    Position position;

    public void setPosition(Position postition) {
        this.position = postition;
    }
}

/*
board
    squares
        light
        dark
pieces
    color
        light
        dark
player
    move (a piece from one square to another if legal)
 */
