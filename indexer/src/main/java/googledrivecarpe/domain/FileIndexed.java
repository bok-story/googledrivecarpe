package googledrivecarpe.domain;

import googledrivecarpe.domain.*;
import googledrivecarpe.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileLocaltion;
    private String fileId;
    private String indexYn;
    private Date indexedDt;

    public FileIndexed(Indexer aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event
