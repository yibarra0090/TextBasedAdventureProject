package Game;
import Board.Board;
import Person.Person;
import Game.Game;
import Rooms.GhostRoom;
import Rooms.Room;
import Rooms.ZombieRoom;

public class Game {
    private static boolean gameOn = true;
    public static void main(String[] args)
    {
        Room[][]map1 = new Room[10][10];
        int a = (int)(Math.random()*map1.length);
        int b = (int)(Math.random()*map1.length);
        map1[a][b] = new ZombieRoom(a,b);
        int q = (int)(Math.random()*map1.length);
        int t = (int)(Math.random()*map1.length);
        map1[q][t] = new GhostRoom(q,t);
        Board map = new Board(map1);
        map.print();
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
