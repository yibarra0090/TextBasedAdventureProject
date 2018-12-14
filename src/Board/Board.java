package Board;
import Rooms.*;

public class Board {
    private static Room [][] map;
    int x;
    int y;
    public Board(int x, int y){
        this.map = new Room[x][y];
        for ( x = 0; x < this.map.length; x++)
        {
            for (y = 0; y < this.map[x].length; y++)
            {
                this.map[x][y] = new Room(x,y);
            }
        }
        int a = rand();
        int b = rand();
        //if (a == b){
        //while (a == b){
        //     b = rand();
        //  }
        //}
        map[a][b] = new ZombieRoom(a,b);

        int q = (int)(Math.random()*map.length);
        int t = (int)(Math.random()*map.length);
        // if (q == t){
        //   while (q == t){
        //     q = (int)(Math.random()*map.length);
        //}
        //}
        map[q][t] = new GhostRoom(q,t);

        int s = (int)(Math.random()*map.length);
        int d = (int)(Math.random()*map.length);
        //if (s == d){
        //  while (s == d){
        //    d = (int)(Math.random()*map.length);
        //}
        //}
        map[s][d] = new GhostKeyRoom(s,d);

        int m = (int)(Math.random()*map.length);
        int n = (int)(Math.random()*map.length);
        //if (m == n){
        //  while (m == n){
        //    n = (int)(Math.random()*map.length);
        //}
        //}
        map[m][n] = new ZombieKeyRoom(m,n);
    }
    public Board(Room[][]map){
        this.map = map;
        for ( x = 0; x < this.map.length; x++)
        {
            for (y = 0; y < this.map[x].length; y++)
            {
                this.map[x][y] = new Room(x,y);
            }
        }
            int a = rand();
            int b = rand();
            //if (a == b){
                //while (a == b){
                //     b = rand();
              //  }
            //}
            map[a][b] = new ZombieRoom(a,b);

            int q = (int)(Math.random()*map.length);
            int t = (int)(Math.random()*map.length);
           // if (q == t){
             //   while (q == t){
               //     q = (int)(Math.random()*map.length);
                //}
            //}
            map[q][t] = new GhostRoom(q,t);

            int s = (int)(Math.random()*map.length);
            int d = (int)(Math.random()*map.length);
            //if (s == d){
              //  while (s == d){
                //    d = (int)(Math.random()*map.length);
                //}
            //}
            map[s][d] = new GhostKeyRoom(s,d);

            int m = (int)(Math.random()*map.length);
            int n = (int)(Math.random()*map.length);
            //if (m == n){
              //  while (m == n){
                //    n = (int)(Math.random()*map.length);
                //}
            //}
            map[m][n] = new ZombieKeyRoom(m,n);
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
        public static int rand(){
            int a = (int)(Math.random()*map.length);
            return a;
        }
    }

