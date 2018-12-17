package Board;
import Game.Game;
import Rooms.*;
import Person.Person;
public class Board {
    public static Room[][] map;
    int x;
    int y;
    /*
    Board has two different constructors, one with parameters, one is default
     */
    public Board(int x, int y) {
        this.map = new Room[x][y];
        for (x = 0; x < this.map.length; x++) {
            for (y = 0; y < this.map[x].length; y++) {
                this.map[x][y] = new Room(x, y);
            }
        }
        for (int i = 0; i <4 ; i++){
            int a = rand();
            int b = rand();
            map[a][b] = new ZombieRoom(a, b);
            int q = rand();
            int t = rand();
            map[q][t] = new GhostRoom(q, t);
        }
        //Generates location of both keys
        int s = rand();
        int d = rand();
        map[s][d] = new GhostKeyRoom(s, d);

        int m = rand();
        int n = rand();
        map[m][n] = new ZombieKeyRoom(m, n);
    }

    /**
     * Default map
     * @param map Room variable
     */
    public Board(Room[][] map) {
        this.map = map;
        //Constructs the board
        for (x = 0; x < this.map.length; x++) {
            for (y = 0; y < this.map[x].length; y++) {
                this.map[x][y] = new Room(x, y);
            }
        }
        //Generates more than one Ghost and Zombie rooms in random locations
        for (int i = 0; i <4 ; i++){
            int a = 0;
            int b = 0;
            a = rand();
            b = rand();
            map[a][b] = new ZombieRoom(a, b);
            int q = rand();
            int t = rand();
            map[q][t] = new GhostRoom(q, t);

        }
        //Generates location of both keys
        int s = rand();
        int d = rand();
        map[s][d] = new GhostKeyRoom(s, d);

        int m = rand();
        int n = rand();
        map[m][n] = new ZombieKeyRoom(m, n);
    }

    /**
     * Prints out the board row by row
     */
    public void print() {
        String row = "";
        for (int i = 0; i < map.length; i++) {
            row = " ";
            for (int j = 0; j < map[i].length; j++) {
                row += map[i][j].toString();
            }
            System.out.println(row);
        }
    }
    /*
    Determines if the player has killed all zombies and ghosts
     */
    public void didWin(){
        boolean win = true;
        for( int x = 0; x < map.length; x++){
            for (int y = 0; y < map[0].length; y++){
                if ((map[x][y] instanceof ZombieRoom || map[x][y] instanceof GhostRoom) && map[x][y].isThere == false){
                    win = false;
                }
            }
        }
        if(win){
            System.out.println("Congrats, you won!!!");
            Game.gameOff();
        }
    }
    /*
    Generates a random number for constructor
     */
    public static int rand() {
        int a = (int) (Math.random() * map.length);
        return a;
    }
}

