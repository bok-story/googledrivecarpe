package googledrivecarpe.domain;

import googledrivecarpe.NotificationApplication;
import googledrivecarpe.domain.Notified;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notification_table")
@Data
//<<< DDD / Aggregate Root
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileId;

    private String videoId;

    private String indexId;

    private Date notifiedDt;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static NotificationRepository repository() {
        NotificationRepository notificationRepository = NotificationApplication.applicationContext.getBean(
            NotificationRepository.class
        );
        return notificationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void customerNotified(StreamProcessed streamProcessed) {
        //implement business logic here:

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        Notified notified = new Notified(notification);
        notified.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(streamProcessed.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);

            Notified notified = new Notified(notification);
            notified.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void customerNotified(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        Notified notified = new Notified(notification);
        notified.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);

            Notified notified = new Notified(notification);
            notified.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
