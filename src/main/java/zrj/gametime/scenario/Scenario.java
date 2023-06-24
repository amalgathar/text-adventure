package zrj.gametime.scenario;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import zrj.gametime.objects.Room;

@Builder
@Data
public class Scenario {

    public boolean validateLocation(String location){
        // default impl
        return true;
    }

    private List<Room> rooms;

}
