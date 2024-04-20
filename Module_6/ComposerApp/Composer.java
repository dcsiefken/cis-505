package Module_6.ComposerApp;

public class Composer {
    private int id;
    private String name;
    private String genre;

    public Composer() {
        id = 0;
        name = "";
        genre = "";
    }

    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "id: " + String.format("%d", id) + "\r\n" +
                "name: " + name + "\r\n" +
                "genre: " + genre + "\r\n";
    }

}
