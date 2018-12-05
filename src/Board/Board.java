package Board;
import Rooms.Room;
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
