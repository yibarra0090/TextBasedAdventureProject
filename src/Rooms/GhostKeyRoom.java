package Rooms;
import Person.Person;
import Items.Key;


public class GhostKeyRoom extends Room implements Key {
    boolean alive = true;
    public GhostKeyRoom(int x, int y){
        super(x,y);
    }
    public boolean hasKey(Person x) {
        if (isThere == true){
            x.GhostKey = true;
        }
        return x.GhostKey;
    }
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        isThere = true;
        hasKey(x);
        System.out.println("This room contains a Ghostkey!");
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

