import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class polygon {
    private String name;
    private ArrayList<point>points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<point> points) {
        this.points = points;
    }

    //Constructor
    public polygon(String name, ArrayList<point> points) {
        if (points.size()<3){
            throw new IllegalArgumentException("A polygon must have at least 3 points.");
        }else {
            this.name = name;
            this.points = points;
        }
    }
}
