package zrj.gametime.commands;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MovementActions {
    GO_TO("go to"),
    WALK_TO("walk to"),
    RUN_TO("run to"),
    MOVE_TO("move to"),
    YEET_YOURSELF("yeet myself"),
    MOVE("move"),
    RUN("run"),
    GO("go"),
    WALK("walk");

    @Getter
    private final String lowerForm;

}
