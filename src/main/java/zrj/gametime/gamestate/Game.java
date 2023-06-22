package zrj.gametime.gamestate;

import lombok.Getter;
import lombok.Setter;
import zrj.gametime.commands.Action;

@Setter
@Getter
public class Game {

    private String location;
    private boolean won = false;

    public void performAction(Action action) {
        location = action.getTarget();
        System.out.println("You have " + action.getActionType().toString().toLowerCase().replace("_", " ") +  location + ".");

    }

}
