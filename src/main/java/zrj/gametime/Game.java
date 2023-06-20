package zrj.gametime;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import zrj.gametime.actions.Action;
import zrj.gametime.actions.ActionType;

@Setter
@Getter
public class Game {

    private String location;
    private boolean won = false;

    public void performAction(Action action) {
        if (Objects.requireNonNull(action.getActionType()) == ActionType.GO_TO) {
            location = action.getTarget();
            System.out.println("You have moved to " + location);
        } else if (action.getActionType() == ActionType.WALK_TO) {
            location = action.getTarget();
            System.out.println("You have walked to " + location);
            // Handle other action types as needed
        }
    }

}
