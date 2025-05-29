import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    void shouldPurchaseGame() {
        Customer customer = new Customer();
        Game game = new Game();
        game.setInStock(false);
        game.setPrice(300);
        customer.setWalletBalance(500);
        String expected = "Game is not in the stock!";
        assertEquals(expected, customer.purchaseGame(game));
        assertEquals(500, customer.getWalletBalance());
    }

    @Test
    void shouldPurchaseGameTwo() {
        Customer customer = new Customer();
        Game game = new Game();
        game.setInStock(true);
        game.setPrice(800);
        customer.setWalletBalance(500);
        String expected = "You have no money for this game.";
        assertEquals(expected, customer.purchaseGame(game));
        assertEquals(500, customer.getWalletBalance());
    }

    @Test
    void shouldPurchaseGameThree() {
        Customer customer = new Customer();
        Game game = new Game();
        game.setInStock(true);
        game.setPrice(200);
        customer.setWalletBalance(500);
        String expected = "Game purchased successfully";
        assertEquals(expected, customer.purchaseGame(game));
        assertEquals(300, customer.getWalletBalance());
    }
}
