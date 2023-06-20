package zrj.gametime;

import java.util.HashMap;
import java.util.Map;
import zrj.gametime.actions.Action;
import zrj.gametime.actions.ActionType;

public class CommandParser {

    private static final Map<String, ActionType> actionKeywords = new HashMap<>();

    static {
        actionKeywords.put("go to", ActionType.GO_TO);
        actionKeywords.put("walk to", ActionType.WALK_TO);
        actionKeywords.put("run to", ActionType.RUN_TO);
        actionKeywords.put("move to", ActionType.MOVE_TO);
    }

    public Action parseCommand(String command) {
        for (Map.Entry<String, ActionType> actionKeyword : actionKeywords.entrySet()) {
            if (command.startsWith(actionKeyword.getKey())) {
                String target = command.substring(actionKeyword.getKey().length());
                return new Action(actionKeyword.getValue(), target);
            }
        }
        throw new IllegalArgumentException("Invalid Command");
    }

}
