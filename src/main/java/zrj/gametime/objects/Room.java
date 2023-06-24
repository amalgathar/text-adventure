package zrj.gametime.objects;

import java.util.List;
import lombok.Builder;

@Builder
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

    @Override
    public String toString() {
        return "Room{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", item=" + items + ", doors=" + doors
                + '}';
    }

}
