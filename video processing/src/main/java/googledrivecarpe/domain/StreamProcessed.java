package googledrivecarpe.domain;

import googledrivecarpe.domain.*;
import googledrivecarpe.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String fileLocation;
    private String fileId;
    private String videoStreamUrl;
    private Date videoStreamDt;

    public StreamProcessed(VideoProcessing aggregate) {
        super(aggregate);
    }

    public StreamProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
