package zrj.gametime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import zrj.gametime.commands.MovementAction;
import zrj.gametime.commands.CommandParser;
import zrj.gametime.gamestate.Game;
import zrj.gametime.objects.Direction;
import zrj.gametime.objects.Door;
import zrj.gametime.objects.Item;
import zrj.gametime.objects.Key;
import zrj.gametime.objects.Room;
import zrj.gametime.scenario.Scenario;


public class Main {

    public static void main(String[] args) {
        CommandParser parser = new CommandParser();
        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            try {
                MovementAction action = parser.parseCommand(command);
                game.performAction(action);

                if (game.isWon()) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    private void funThings() {
        Key key = new Key();
        key.setName("Skull Key");
        key.setAttribute("skull");

        Item sword = new Item();
        sword.setName("Diamond Sword");

        List<Item> items = new ArrayList<>();
        items.add(key);
        items.add(sword);

        Door door = new Door();
        door.setOpen(false);
        door.setUnlocked(false);
        door.setRequiresKeyAttribute(true);
        door.setExit(false);
        door.setDirection(Direction.NORTH);
        door.setDescription("a door adorned with skulls. This could be the right way to go.  It could also be the right way to go if your goal is being destroyed by Satanic monsters. Your call.");

        Door door2 = new Door();
        door2.setOpen(true);
        door2.setDirection(Direction.EAST);

        List<Door> doors = new ArrayList<>();
        doors.add(door);
        doors.add(door2);

        Room room = new Room();
        room.setDescription("You wake in a dark nasty room. Good luck!");
        room.setName("Entrance");
        room.setItems(items);
        room.setDoors(doors);

        PlayerActions playerActions = new PlayerActions();

        playerActions.checkRoom(room);
    }

}
