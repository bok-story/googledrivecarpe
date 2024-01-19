package googledrivecarpe.domain;

import googledrivecarpe.domain.*;
import googledrivecarpe.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String fileLocation;
    private String fileId;
    private String videoStreamUrl;
    private Date videoStreamDt;
}
