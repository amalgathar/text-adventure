package zrj.gametime.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Door {

    private boolean isUnlocked;
    private boolean isOpen;
    private boolean requiresKeyAttribute;
    private boolean isExit;
    private String description;
    private Direction direction;

}
