package googledrivejhson.domain;

import googledrivejhson.domain.*;
import googledrivejhson.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private Long userId;
    private Date createdTime;

    public FileUploaded(File aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
