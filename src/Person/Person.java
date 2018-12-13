package Person;
import Items.Key;
public class Person {
    int xLoc, yLoc;
    public int health = 10;
    public Key [] keys = new Key[2];
    public int getxLoc() {
        return xLoc;
    }
    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }
    public int getyLoc() {
        return yLoc;
    }
    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }
    public Person (int xLoc, int yLoc)
    {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
}
