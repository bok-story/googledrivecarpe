package googledrivecarpe.domain;

import googledrivecarpe.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private String fileSize;
    private String fielUploadYn;
    private Date fileUploadDt;
}
