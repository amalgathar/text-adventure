package zrj.gametime.gamestate;

import lombok.Getter;
import lombok.Setter;
import zrj.gametime.commands.MovementAction;
import zrj.gametime.scenario.Scenario;

@Setter
@Getter
public class Game {

    private String location;
    private boolean won = false;
    private Scenario scenario;

    public void performAction(MovementAction action) {
        location = action.getTargetLocation();
        System.out.println("You are now in " + location + ".");
    }

}
