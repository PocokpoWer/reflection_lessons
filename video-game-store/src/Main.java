public class Main {
    public static void main(String[] args) {
        // 1. Create store.
        Store store = new Store();

        // 2. Add 3 different Game instances.
        Game game1 = new Game("Diablo", "RPG", 25990, true);
        Game game2 = new Game("GTA6", "RPG", 40990, false);
        Game game3 = new Game("WorldOfWarcraft", "MMORPG", 15990, true);
        store.addGame(game1);
        store.addGame(game2);
        store.addGame(game3);

        //3. Add 2 Customer instances with initial wallet balances.
        Customer customer1 = new Customer("Henry Osborn", 20_0000);
        Customer customer2 = new Customer("Jean-Claude Van Damme", 23_650_000);
        store.addCustomer(customer1);
        store.addCustomer(customer2);

        // 4. Call store.listAvailableGames().
        store.listAvailableGames();
        System.out.println();

        // 5. Let one customer attempt to purchase a game.
        store.sellGame("Diablo", "Henry Osborn");
        System.out.println();

        // 6. Call store.listCustomers() to confirm ownership.
        store.listCustomers();
    }
}
