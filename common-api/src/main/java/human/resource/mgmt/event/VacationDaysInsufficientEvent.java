package human.resource.mgmt.event;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VacationDaysInsufficientEvent {

    private String userId;
    private String vacationId;
    private String reason;
}
