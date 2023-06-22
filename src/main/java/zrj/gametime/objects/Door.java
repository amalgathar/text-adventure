package zrj.gametime.objects;

public class Door {

    private boolean isUnlocked;
    private boolean isOpen;
    private boolean requiresKeyAttribute;
    private Direction direction;
    private boolean exit;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public void setUnlocked(boolean unlocked) {
        isUnlocked = unlocked;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isRequiresKeyAttribute() {
        return requiresKeyAttribute;
    }

    public void setRequiresKeyAttribute(boolean requiresKeyAttribute) {
        this.requiresKeyAttribute = requiresKeyAttribute;
    }

}
