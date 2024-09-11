public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* Manhattan distance means the distance between two points if you can only travel in the direction of the coordinate axes, it is used in navigation algos */
    public int manhattanDistanceFromOrigin() {
        return Math.abs(x) + Math.abs(y);
    }

    /* This protected method is only usable by this class and its subclasses */
    protected String location() {
        return x + " " + y;
    }

    @Override
    public String toString() {
        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
    }
}
