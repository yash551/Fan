package MBC;

public class Fan {

    private int speed = 0;

    private Direction direction = Direction.FORWARD;

    //default constructor
    Fan() {
        setSpeed(1);
        setDirection(Direction.FORWARD);
    }

    //Parametrized constructor
    Fan(int speed, Direction direction) {
        try {
            setSpeed(speed);
            setDirection(direction);
        }
        catch (Exception exception) { System.out.println("Something went wrong..."); }
    }

    //getters
    public int getSpeed() { return this.speed; }
    public Direction getDirection() { return this.direction; }

    //setter
    private void setSpeed(int speed) { this.speed = speed; }
    private void setDirection(Direction direction) { this.direction = direction; }

    // method to change speed profile
    public void speedChange(int speed) {
        if (speed == 3) { this.speed = 0; }
        else { this.speed++; }
    }

    //method to change direction
    public void directionChange(Direction direction) {
        if (direction==Direction.FORWARD) { this.direction = Direction.BACKWARD; }
        else { this.direction = Direction.FORWARD; }
    }

    //function for cord1
    public String pullCord1() {
        speedChange(this.speed);
        return "Cord 1 pulled";
    }

    //function for cord2
    public String pullCord2() {
        directionChange(this.direction);
        return "Cord 2 pulled";
    }

    @Override
    public String toString() {
        return String.format("Fan is on speed profile of %d and is rotating %s.", speed, direction);
    }
}

// directory for roatations
enum Direction {
    FORWARD,
    BACKWARD
}
