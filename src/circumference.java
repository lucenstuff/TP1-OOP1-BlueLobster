public class circumference {
    private  int radius;

    private point center;

    public circumference(int radius, point center) {
        this.radius = radius;
        this.center = center;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public point getCenter() {
        return center;
    }

    public void setCenter(point center) {
        this.center = center;
    }
}
