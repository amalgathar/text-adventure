package zrj.gametime.objects;

import java.util.List;

public class Room {

    private String name;
    private String description;
    private List<Item> items;
    private List<Door> doors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public String getNumberOfDoors() {
        String doorsDescription;
        if (getDoors().size() == 1) {
            doorsDescription = "\nThere is 1 door, in the " + getDoors().get(0).getDirection() + " end of the room.";
        } else {
            doorsDescription = getMultipleDoorDirections();
        }
        return doorsDescription;
    }

    @Override
    public String toString() {
        return "Room{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", item=" + items + ", doors=" + doors
                + '}';
    }

    private String getMultipleDoorDirections() {
        StringBuilder stringBuilder = new StringBuilder("\nThere are " + getDoors().size() + " doors in the room.");
        for (int i = 0; i < getDoors().size(); i++) {
            stringBuilder
                    .append("\nDoor number ")
                    .append(i + 1)
                    .append(" is in the ")
                    .append(getDoors().get(i).getDirection())
                    .append(" end of the room.");
        }
        return stringBuilder.toString();
    }

}
