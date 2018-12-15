package Game;
import Board.Board;
import Person.Person;
import Game.Game;
import Rooms.GhostRoom;
import Rooms.Room;
import Rooms.ZombieRoom;
import java.util.Scanner;
public class Game {
    private static boolean gameOn = true;
    public static void main(String[] args)
    {
        Room[][]map1 = new Room[8][8];
        Board map = new Board(map1);
        Person player1 = new Person(0,0);
        map1[0][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            map.print();
            map.didWin();
            System.out.println("Where would you like to move? (Choose N, E, S, W)");
            String move = in.nextLine();
            if(validMove(move, player1, map1))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
            }
            else {
                System.out.println("Please choose a valid move.");
            }
            map.didWin();
        }
        in.close();
    }

    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;
        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }
}
