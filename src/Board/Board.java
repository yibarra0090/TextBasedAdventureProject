package Board;
import Rooms.*;

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
            if (a == b){
                while (a == b){
                     b = (int)(Math.random()*map.length);
                }
            }
            map[a][b] = new ZombieRoom(a,b);

            int q = (int)(Math.random()*map.length);
            int t = (int)(Math.random()*map.length);
            if (q == t){
                while (q == t){
                    q = (int)(Math.random()*map.length);
                }
            }
            map[q][t] = new GhostRoom(q,t);

            int s = (int)(Math.random()*map.length);
            int d = (int)(Math.random()*map.length);
            if (s == d){
                while (s == d){
                    d = (int)(Math.random()*map.length);
                }
            }
            map[s][d] = new GhostKeyRoom(s,d);

            int m = (int)(Math.random()*map.length);
            int n = (int)(Math.random()*map.length);
            if (m == n){
                while (m == n){
                    n = (int)(Math.random()*map.length);
                }
            }
            map[m][n] = new ZombieKeyRoom(m,n);
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
