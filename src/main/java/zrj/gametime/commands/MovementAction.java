package zrj.gametime.commands;

import lombok.Getter;
import lombok.Setter;
import zrj.gametime.scenario.Scenario;

@Getter
@Setter
public class MovementAction {

    private MovementActions actionType;
    private String targetLocation;

    public MovementAction(MovementActions actionType, String targetLocation) {
        this.actionType = actionType;
        this.targetLocation = targetLocation;
    }

    public void performAction(Scenario scenario) {
        if (!scenario.validateLocation(targetLocation)) {
            throw new IllegalArgumentException("Invalid Location");
        }
    }

}
