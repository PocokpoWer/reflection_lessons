import java.util.*;

public class Store {
    private List<Game> availableGames = new ArrayList<>();
    private List<Customer> registeredCustomers = new ArrayList<>();

    //Constructors
    public Store() {
    }

    public Store(List<Game> availableGames, List<Customer> registeredCustomers) {
        this.availableGames = availableGames;
        this.registeredCustomers = registeredCustomers;
    }

    //Getter Setter
    public List<Game> getAvailableGames() {
        return availableGames;
    }

    public void setAvailableGames(List<Game> availableGames) {
        this.availableGames = availableGames;
    }

    public List<Customer> getRegisteredCustomers() {
        return registeredCustomers;
    }

    public void setRegisteredCustomers(List<Customer> registeredCustomers) {
        this.registeredCustomers = registeredCustomers;
    }

    // Create methods
    public void addGame(Game game) {
        availableGames.add(game);
    }

    public void addCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

    public void listAvailableGames() {
        for (Game games : availableGames) {
            System.out.println(games);
        }
    }

    public Game findGameByTitle(String title) {
        for (Game games : availableGames) {
            if (games.equals(title)) {
                return games;
            }
        }
        return null;
    }

    public void sellGame(String gameTitle, String customerName) {
        Game foundGame = null;
        Customer foundCustomer = null;
        for (Game game : availableGames) {
            if (game.getTitle().equals(gameTitle)) {
                foundGame = game;
            }
        }
        for (Customer customer : registeredCustomers) {
            if (customer.getName().equals(customerName)) {
                foundCustomer = customer;
            }
        }
        if (foundGame != null && foundCustomer != null) {
            System.out.println(foundCustomer.purchaseGame(foundGame));

        } else {
            System.out.println("Not found game or customer.");
        }
    }

    public void listCustomers() {
        for (Customer registeredCustomer : registeredCustomers) {
            System.out.println(registeredCustomer);
        }
    }
}
