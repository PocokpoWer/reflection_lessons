public class Game extends Store {
    private String title;
    private String genre;
    private double price;
    private boolean inStock;

    //Constructors
    public Game() {
    }

    public Game(String title, String genre, double price, boolean inStock) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.inStock = inStock;
    }

    // Getter Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    // Create methods
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return String.format("Game name: %s Genre: %s Price: %f in stock: %b", title, genre, price, inStock);
    }
}
