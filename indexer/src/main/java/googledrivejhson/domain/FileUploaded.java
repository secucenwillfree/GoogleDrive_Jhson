package googledrivejhson.domain;

import googledrivejhson.domain.*;
import googledrivejhson.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private String type;
    private Long userId;
    private Date createdTime;
}


