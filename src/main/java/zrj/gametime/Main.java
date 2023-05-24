package zrj.gametime;

import java.util.ArrayList;
import java.util.List;
import zrj.gametime.objects.Direction;
import zrj.gametime.objects.Door;
import zrj.gametime.objects.Item;
import zrj.gametime.objects.Key;
import zrj.gametime.objects.Room;

public class Main {

    public static void main(String[] args) {
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
        door.setDirection(Direction.NORTH);

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
