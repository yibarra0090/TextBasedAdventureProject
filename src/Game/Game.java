package Game;
import Board.Board;
import Person.Person;
import Game.Game;
import Rooms.Room;

public class Game {
    private static boolean gameOn = true;
    public static void main(String[] args)
    {
        Room[][]map1 = new Room[8][8];
        Board map = new Board(map1);
        System.out.println(map1);
    }
}
