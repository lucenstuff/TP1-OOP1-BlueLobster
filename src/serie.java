public class serie {
    private String title;
    private int seasons;
    private boolean delivered = false;
    private String genre;
    private String creator;

    public serie() {
    }

    public serie(String genre, String creator) {
    }

    public serie(String title, int seasons, String genre, String creator) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}

