import java.util.*;

public class Customer extends Store {
    private String name;
    private double walletBalance;
    private List<String> ownedGames = new ArrayList<>();

    //Constructors
    public Customer() {
    }

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    //Getter Setter
    public List<String> getOwnedGames() {
        return ownedGames;
    }

    public void setOwnedGames(List<String> ownedGames) {
        this.ownedGames = ownedGames;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer name: %s Wallet balance: %f Owned games: %s", name, walletBalance, ownedGames);
    }

    // Create methods
    public double addFunds(double amount) {
        return walletBalance += amount;
    }

    public String purchaseGame(Game game) {
        if (!game.isInStock()) {
            return "Game is not in the stock!";
        } else if (getWalletBalance() < game.getPrice()) {
            return "You have no money for this game.";
        } else {
            game.setInStock(false);
            walletBalance -= game.getPrice();
            ownedGames.add(game.getTitle());
            return "Game purchased successfully";
        }
    }
}
