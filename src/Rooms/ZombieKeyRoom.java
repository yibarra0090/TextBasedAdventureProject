package Rooms;
import Items.Key;
import Person.Person;

public class ZombieKeyRoom extends Room implements Key {
    Person occupant;
    int xLoc,yLoc;
    boolean alive = true;
    public ZombieKeyRoom(int x, int y){
        super(x,y);
    }
    public boolean hasKey(Person x) {
       if (isThere == true){
            x.ZombieKey = true;
       }
       return x.ZombieKey;
    }

    public void enterRoom(Person x)
    {
        System.out.println("This room contains a Zombie key!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        isThere = true;
    }
    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
    public String toString(){
        if (isThere){
            return "{*}";}
        else{
            return "{?}";
        }
    }
}
