package googledrivecarpe.infra;

import googledrivecarpe.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoProcessingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VideoProcessing>> {

    @Override
    public EntityModel<VideoProcessing> process(
        EntityModel<VideoProcessing> model
    ) {
        return model;
    }
}
