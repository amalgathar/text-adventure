package zrj.gametime.scenario;

import java.util.ArrayList;
import java.util.List;
import lombok.experimental.UtilityClass;
import zrj.gametime.objects.Room;

@UtilityClass
public class ScenarioArranger {

    public List<Room> rooms = new ArrayList<>();

    public Scenario buildScenario() {
        return Scenario.builder()
                .build();
    }

}
