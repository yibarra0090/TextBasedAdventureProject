package Rooms;
import Game.Game;
import Person.Person;
import java.util.Scanner;
public class ZombieRoom extends Room {
    boolean alive = true;
    public ZombieRoom(int x, int y){
        super(x,y);
    }
    /**
     * Method controls the results when a person enters this room. Checks if the player has the key, and asks math question
     * @param x the Person entering
     */
    public void enterRoom(Person x){
        isThere = true;
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        boolean hasKey = false;
        if (x.ZombieKey == true){
            hasKey = true;
        }
        if (hasKey == true){
            String [][] math = {{"(9+1)^2-7","8*3+4+3-2","16^0.5+6+3+12","23+23^2-5^2+9","(100!)/(99!)","ln(e^x)","((900!)/(899!))*0.5"},{"93","29","25","536","100","x","450"}};
            int rand = (int)((Math.random()*8));
            System.out.println("Zombie! Watch Out!");
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
                    System.out.println("Good job, you defeated the zombie!");
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
        /*
        Prints zombie on board
         */
    public String toString(){
        if (alive){
            return "{Z}";
        } else {
        return "{*}";
    }
}}

