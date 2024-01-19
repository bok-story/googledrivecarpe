package googledrivecarpe.domain;

import googledrivecarpe.domain.*;
import googledrivecarpe.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private String fileSize;
    private String fielUploadYn;
    private Date fileUploadDt;
}
