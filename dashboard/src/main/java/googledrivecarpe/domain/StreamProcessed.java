package googledrivecarpe.domain;

import googledrivecarpe.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String fileLocation;
    private String fileId;
    private String videoStreamUrl;
    private Date videoStreamDt;
}
