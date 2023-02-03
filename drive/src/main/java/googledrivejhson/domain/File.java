package googledrivejhson.domain;

import googledrivejhson.domain.FileUploaded;
import googledrivejhson.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="File_table")
@Data

public class File  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Integer size;
    
    
    
    
    
    private String type;
    
    
    
    
    
    private Long userId;
    
    
    
    
    
    private Date createdTime;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static FileRepository repository(){
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(FileRepository.class);
        return fileRepository;
    }






}
