package Module_6.ComposerApp;

/**
 * Composer class - representation of a musical composer
 */
public class Composer {
    // id number for the composer
    private int id;
    // name for the composer
    private String name;
    // musical genre name for the composer
    private String genre;

    /**
     * Default constructor
     */
    public Composer() {
        id = 0;
        name = "";
        genre = "";
    }

    /**
     * Parameter constructor for Composer
     * 
     * @param id    id number for the composer object
     * @param name  name for the composer object
     * @param genre genre for the composer object
     */
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

    /**
     * Override of ToString() method with friendly display
     */
    @Override
    public String toString() {
        return "id: " + String.format("%d", id) + "\r\n" +
                "name: " + name + "\r\n" +
                "genre: " + genre + "\r\n";
    }

}
