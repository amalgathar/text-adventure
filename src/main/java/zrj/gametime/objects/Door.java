package zrj.gametime.objects;

public class Door {

    private boolean isUnlocked;
    private boolean isOpen;
    private boolean requiresKeyAttribute;
    private Direction direction;

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
