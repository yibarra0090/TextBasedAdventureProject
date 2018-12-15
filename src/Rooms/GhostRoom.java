package Rooms;
import Game.Game;
import Items.Key;
import Person.Person;
import Person.Person;
import org.omg.CORBA.SystemException;

import java.util.Scanner;
import java.util.Scanner;

public class GhostRoom extends Room  {
    boolean alive = true;
    public GhostRoom(int x, int y){
        super(x,y);
    }
    public void enterRoom(Person x){
        this.isThere = true;
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        boolean hasKey = false;
        if (x.GhostKey == true){
            hasKey = true;
        }
        //1234
        if (hasKey){
            String [][] math = {{"(9+1)^2-7","8*3+4+3-2","16^0.5+6+3+12"},{"93","29","25"}};
            int rand = (int)((Math.random()*2));
            System.out.println("Ghost! Watch Out!");
            System.out.println("To defeat it, answer this question:"+" "+math[0][rand]);
            Scanner in = new Scanner(System.in);
            String ans = in.nextLine();
            boolean correctAnswer=false;
            while (correctAnswer == false){
                if (x.health <= 0){
                    System.out.println("You died! Game Over!");
                    Game.gameOff();
                    break;
                }
                else if (ans.equals(math[1][rand])){
                    System.out.println("Good job, you defeated the ghost!");
                    alive = false;
                    correctAnswer=true;
                } else {
                    System.out.println("Keep trying!");
                    x.health = x.health-2;
                    System.out.println("Your health is now: " + ""+x.health);
                    ans = in.nextLine();
                }
            }
        }
        else{
            System.out.println("Get the Key!");
        }
    }
    public String toString(){
        if (alive){
            return "{G}";
        } else {
            return "{ }";
        }
}}
