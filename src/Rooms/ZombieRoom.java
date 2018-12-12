package Rooms;
import Person.Person;
import Person.Person;
import java.util.Scanner;
public class ZombieRoom extends Room {
    Person occupant;
    int xLoc,yLoc;
    boolean alive = true;
    public ZombieRoom(int x, int y){
        super(x,y);
    }
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        String [][] math = {{"(9+1)^2-7","8*3+4+3-2","16^0.5+6+3+12"},{"93","29","25"}};
        int rand = (int)((Math.random()*2)+1);
        System.out.println("Zombie! Watch Out!");
        System.out.println("To defeat it, answer this question:"+" "+math[0][rand]);
        Scanner in = new Scanner(System.in);
        String ans = in.nextLine();
        while (!ans.equals(math[1][rand])){
            if (ans.equals(math[1][rand])){
                System.out.println("Good job, you defeated the zombie!");
                alive = false;
        } else {
                System.out.println("Keep trying!");
            }
        }
    }
    public String toString(){
        if (alive){
            return "{Z}";
        } else {
        return "{ }";
    }
}}

