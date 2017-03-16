/**
 * Created by dinesh on 3/16/2017.
 */
public class vehicle {
    private String name;
    private String size;

    private int currentvelocity;
    private int currentDirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentvelocity=0;
        this.currentDirection=0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): Steering at "+ currentDirection + "degrees");

    }
    public void move(int velocity, int direction){
        currentvelocity = velocity;
        currentDirection = direction ;
        System.out.println("vehicle.move() : moving at " + currentvelocity+ "in direction"+ currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public void setCurrentvelocity(int currentvelocity) {
        this.currentvelocity = currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    public void stop() {
        this.currentvelocity = 0;

    }
}


