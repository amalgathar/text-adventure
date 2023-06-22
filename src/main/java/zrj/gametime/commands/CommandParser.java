package zrj.gametime.commands;

import java.util.HashMap;
import java.util.Map;

public class CommandParser {

    private static final Map<String, ActionType> actionKeywords = new HashMap<>();

    static {
        for (ActionType actionType : ActionType.values()) {
            String command = actionType.name().toLowerCase().replace("_", " ");
            actionKeywords.put(command, actionType);
        }
    }

    public Action parseCommand(String command) {
        command = command.toLowerCase();

        for (Map.Entry<String, ActionType> actionKeyword : actionKeywords.entrySet()) {
            if (command.startsWith(actionKeyword.getKey())) {
                String target = command.substring(actionKeyword.getKey().length());
                return new Action(actionKeyword.getValue(), target);
            }
        }
        throw new IllegalArgumentException("Invalid Command");
    }

}
