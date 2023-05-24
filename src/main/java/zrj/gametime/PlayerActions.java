package zrj.gametime;

import java.util.List;
import zrj.gametime.objects.Door;
import zrj.gametime.objects.Item;
import zrj.gametime.objects.Room;

public class PlayerActions {

    public void openDoor(Door door) {
        if (door.isOpen()) {
            System.out.println("The door is already open.  You just need to walk through it.  You can do it!");
        } else if (door.isUnlocked()) {
            door.setOpen(true);
        }
    }

    public void unlockDoor(Door door) {
        if (!door.isUnlocked() && !door.isRequiresKeyAttribute()) {
            System.out.println("The door is locked, and it appears to require a regular key.");
        } else {
            System.out.println("The door is locked, and it appears to require a specific type of key.");
        }
    }

    public void checkRoom(Room room) {
        System.out.println(room.getDescription() + getNumberOfDoors(room) + checkCurrentItemsInRoom(room));
    }

    private String checkCurrentItemsInRoom(Room room) {
        List<Item> items = room.getItems();
        if (items.isEmpty()) {
            return "\nYou see nothing of note.";
        } else {
            StringBuilder stringBuilder = new StringBuilder("\nYou see the following in the room: ");
            for (Item item : items) {
                stringBuilder.append(item.getName()).append(". ");
            }
            return stringBuilder.toString();
        }
    }

    private String getNumberOfDoors(Room room) {
        String doorsDescription;
        if (room.getDoors().size() == 1) {
            doorsDescription = "\nThere is 1 door, in the " + room.getDoors().get(0).getDirection() + " end of the room.";
        } else {
            doorsDescription = getMultipleDoorDirections(room);
        }
        return doorsDescription;
    }

    private String getMultipleDoorDirections(Room room) {
        StringBuilder stringBuilder = new StringBuilder("\nThere are " + room.getDoors().size() + " doors in the room.");
        for (int i = 0; i < room.getDoors().size(); i++) {
            stringBuilder
                    .append("\nDoor number ")
                    .append(i + 1)
                    .append(" is in the ")
                    .append(room.getDoors().get(i).getDirection())
                    .append(" end of the room.");
        }
        return stringBuilder.toString();
    }

}
