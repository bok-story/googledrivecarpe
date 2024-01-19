package googledrivecarpe.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrivecarpe.config.kafka.KafkaProcessor;
import googledrivecarpe.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationRepository notificationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StreamProcessed'"
    )
    public void wheneverStreamProcessed_CustomerNotified(
        @Payload StreamProcessed streamProcessed
    ) {
        StreamProcessed event = streamProcessed;
        System.out.println(
            "\n\n##### listener CustomerNotified : " + streamProcessed + "\n\n"
        );

        // Sample Logic //
        Notification.customerNotified(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_CustomerNotified(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener CustomerNotified : " + fileUploaded + "\n\n"
        );

        // Sample Logic //
        Notification.customerNotified(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
