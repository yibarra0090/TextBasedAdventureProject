package Board;
import Rooms.GhostRoom;
import Rooms.Room;
import Rooms.ZombieRoom;

public class Board {
    private Room [][] map;
    public Board(Room[][]map){
        this.map = map;
        for (int x = 0; x < this.map.length; x++)
        {
            for (int y = 0; y < this.map[x].length; y++)
            {
                this.map[x][y] = new Room(x,y);
            }
            int a = (int)(Math.random()*map.length);
            int b = (int)(Math.random()*map.length);
            map[a][b] = new ZombieRoom(a,b);
            int q = (int)(Math.random()*map.length);
            int t = (int)(Math.random()*map.length);
            map[q][t] = new GhostRoom(q,t);
        }
    }
    public void print(){
        String row = "";
        for(int i =0; i < map.length;i++){
            row = " ";
            for(int j = 0; j < map[i].length; j++){
                row += map[i][j].toString();}
            System.out.println(row);
            }
        }

    }
