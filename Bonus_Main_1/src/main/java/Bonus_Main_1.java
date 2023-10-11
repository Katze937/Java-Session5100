import java.util.ArrayList;
import java.util.List;
Public class Bonus_Main_1{

    private static class game {

        public game() {
        }
    }
// The Ship class represents a single ship in the game.
public class Ship{
    private final int size;
    // Array to store ship's state, like hit or miss
     // Size of the ship (e.g., 3 for a cruiser)

    // Constructor for the Ship class
    public Ship(int size) {
        this.size = size;
    }
}

// ShipManager class is responsible for managing Ship objects
class ShipManager {
    private final List<Ship> ships = new ArrayList<>();  // List to store all Ship objects

    // Adds a new ship of a given size
    public Ship addShip(int size) {
        Ship ship = new Ship(size);
        ships.add(ship);
        return ship;
    }

    // Removes a specific ship from the list
    public void removeShip(ship, Object ship) {
        ships.remove(ship);
    }

    // Lists all the ships
    public void listAllShips() {
        for (Ship ship : ships) {
            System.out.println(ship.size + "Ship of size: ");
        }
    }
}

// Grid class represents the game board grid where ships are placed
class Grid {
    private List<Ship> ships = new ArrayList<>();  // List to store Ship objects on the grid

    // Adds a ship to the grid
    public void addShip(Ship ship) {
        ships.add(ship);
    }

    // Removes a specific ship from the grid
    public void removeShip(Ship ship) {
        ships.remove(ship);
    }

    // Lists all ships present on the grid
    public void listAllShips() {
        for (Ship ship : ships) {
            System.out.println("Ship of size: " + ship.size);
        }
    }
}

// Board class represents the entire game board for a player
class Board {
    private Grid grid;  // The game grid where ships are placed

    // Constructor for the Board class
    public Board() {
        this.grid = new Grid();
    }

    // Returns the game grid
    public Grid getGrid() {
        return grid;
    }
}

// Player class represents an individual player in the game
class Player {
    String name;  // Name of the player
    private boolean isHuman;  // Flag to check if the player is human
    private int points;  // Player's score
    private Board board;  // The game board associated with the player

    // Constructor for the Player class
    public Player(String name, boolean isHuman) {
        this.name = name;
        this.isHuman = isHuman;
        this.points = 0;
        this.board = new Board();
    }

    // Returns the game board of the player
    public Board getBoard() {
        return board;
    }
}

// Game class represents the main battleship game
class Game {
    private Player player1;  // Player 1
    private Player player2;  // Player 2

    // Constructor for the Game class
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Lists the names of both players
    private void listAllPlayers() {
        System.out.println("Player 1: " + player1.name);
        System.out.println("Player 2: " + player2.name);
    }
}

// Main class for demonstrating the battleship game
public class BattleshipGame {
    public static void main(String[] args) {
        // Create a ShipManager to manage ships
        ShipManager manager = new ShipManager();

        // Add a new ship of size 3
        Ship ship1 = manager.addShip(3);

        // Create two players, John (human) and Jane (AI)
        Player player1 = new Player("John", true);
        Player player2 = new Player("Jane", false);

        // Add the ship to John's board
        player1.getBoard().getGrid().addShip(ship1);
        // Create a new game with the two players


        // List the names of both players
        game.listAllPlayers();
    }
}
}