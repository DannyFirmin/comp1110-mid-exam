package comp1110.mse;

/**
 * COMP1110 Mid-Semester Exam, Question 3
 */
public class Q3Plane {

    /**
     * Constructor
     *
     * @param name The name of the plane
     * @param speed The speed of the plane (in km/h),
     */
    String name;
    int speed;
    Q3Plane(String name, int speed) {
        // FIXME 3a: complete this constructor
        this.name = name;
        this.speed = speed;
    }

    /** Return the speed of the plane */
    int getSpeed() {
        return speed; // FIXME 3b: complete this method
    }

    /**
     * Reset the speed of the plane according to the argument speed
     * @param speed The new speed of the plane
     */
    void resetSpeed(int speed) {
        // FIXME 3c: complete this method
        this.speed = speed;

    }

    /**
     * Calculate the time to travel the specified distance at the current speed.
     * @param distance The distance (in km)
     * @return The time to travel the distance (in minutes)
     */
    int timeToTravel(int distance) {
        int time;
        time = 60*distance / speed;
        return time; // FIXME 3f: complete this method
    }

    /**
     * Return a string describing the plane and its speed,
     * in the format
     *    "Plane NAME is travelling S km/h"
     * where NAME is replaced by the plane's name, and S is replaced by
     * the plane's speed.
     *
     * @return A string describing the plane and its speed
     */
    @Override
    public String toString() {
        return "Plane " + name + " is travelling " + speed + " km/h";  // FIXME 3g: complete this method
    }
}
