package googledrivecarpe.domain;

import googledrivecarpe.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileLocaltion;
    private String fileId;
    private String indexYn;
    private Date indexedDt;
}
