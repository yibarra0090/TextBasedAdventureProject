package Rooms;
import Person.Person;
import Person.Person;

public class ZombieRoom extends Room {
    Person occupant;
    int xLoc,yLoc;
    public ZombieRoom(int x, int y){
        super(x,y);
    }
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Ghost time!");
    }
    public String toSting(){
        return "{V}";
    }
}
