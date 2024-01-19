package googledrivecarpe.domain;

import googledrivecarpe.domain.*;
import googledrivecarpe.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;

    public Notified(Notification aggregate) {
        super(aggregate);
    }

    public Notified() {
        super();
    }
}
//>>> DDD / Domain Event
