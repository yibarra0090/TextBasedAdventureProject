package Rooms;
import Person.Person;
public class Room {
    Person occupant;
    int xLoc,yLoc;
    public boolean isThere = false;
    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }
    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You entered a regular room. No villains here!");
        System.out.println("Find all zombies and ghosts! Find the keys!");
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
            return "{ }";
        }
    }
}

