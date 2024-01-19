package googledrivecarpe.domain;

import googledrivecarpe.VideoProcessingApplication;
import googledrivecarpe.domain.StreamProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoProcessing_table")
@Data
//<<< DDD / Aggregate Root
public class VideoProcessing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileLocation;

    private String fileId;

    private String videoStreamUrl;

    private Date videoStreamDt;

    @PostPersist
    public void onPostPersist() {
        StreamProcessed streamProcessed = new StreamProcessed(this);
        streamProcessed.publishAfterCommit();
    }

    public static VideoProcessingRepository repository() {
        VideoProcessingRepository videoProcessingRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoProcessingRepository.class
        );
        return videoProcessingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifVideoVideoStreaming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        VideoProcessing videoProcessing = new VideoProcessing();
        repository().save(videoProcessing);

        StreamProcessed streamProcessed = new StreamProcessed(videoProcessing);
        streamProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoProcessing->{
            
            videoProcessing // do something
            repository().save(videoProcessing);

            StreamProcessed streamProcessed = new StreamProcessed(videoProcessing);
            streamProcessed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
