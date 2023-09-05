public class line {
    private point pointA;
    private point pointB;

    public line(point pointA, point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public point getPointA() {
        return pointA;
    }

    public void setPointA(point pointA) {
        this.pointA = pointA;
    }

    public point getPointB() {
        return pointB;
    }

    public void setPointB(point pointB) {
        this.pointB = pointB;
    }

    public double getSlope(){
        return ((double) (pointB.getY() - pointA.getY()) /((double) pointB.getX() /pointA.getX()));
    }

    public static double calculateDistance(double x1,)
}
