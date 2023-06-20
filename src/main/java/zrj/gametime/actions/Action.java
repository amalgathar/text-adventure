package zrj.gametime.actions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action {

    private ActionType actionType;
    private String target;

    public Action(ActionType actionType, String target) {
        this.actionType = actionType;
        this.target = target;
    }

}
