package zrj.gametime.commands;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommandParser {

    private static Map<String, MovementActions> actionKeywords = new LinkedHashMap<>();

    static {
        actionKeywords = Arrays.stream(MovementActions.values())
                .collect(Collectors.toMap(
                        MovementActions::getLowerForm,
                        Function.identity(),
                        (action1, action2) -> action1,
                        LinkedHashMap::new
                ));

        actionKeywords.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparingInt(String::length).reversed()))
                .forEachOrdered(entry -> actionKeywords.put(entry.getKey(), entry.getValue()));
    }

    public MovementAction parseCommand(String command) {
        return actionKeywords.entrySet()
                .stream()
                .filter(a -> command.startsWith(a.getKey()))
                .map(a -> new MovementAction(a.getValue(), command.substring(a.getKey().length()).trim()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Command"));
    }

}
