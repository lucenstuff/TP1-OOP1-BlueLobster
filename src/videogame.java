public class videogame {
    private String title;
    private int estimatedTime=10;
    private boolean delivered=false;
    private String company;

    public videogame() {
    }

    public videogame(String title, int estimatedTime) {
        this.title = title;
        this.estimatedTime = estimatedTime;
    }

    public videogame(String title, int estimatedTime, String company) {
        this.title = title;
        this.estimatedTime = estimatedTime;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
