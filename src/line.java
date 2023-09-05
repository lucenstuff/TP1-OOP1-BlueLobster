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

    //Line slope method

    public double getSlope(){
        return ((double) (pointB.getY() - pointA.getY()) /((double) pointB.getX() /pointA.getX()));
    }

    //line length method
    public double calculateLength(){
       double XDifference = this.pointB.getX()-this.pointA.getX();
       double YDifference = this.pointB.getY()-this.pointA.getY();
        return Math.sqrt(Math.pow(XDifference, 2) + Math.pow(YDifference, 2));
    }
}
