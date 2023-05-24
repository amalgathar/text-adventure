package zrj.gametime.objects;

public enum Direction {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West");

    private final String directionString;

    Direction(final String direction) {
        this.directionString = direction;
    }

    @Override
    public String toString() {
        return directionString;
    }

}
