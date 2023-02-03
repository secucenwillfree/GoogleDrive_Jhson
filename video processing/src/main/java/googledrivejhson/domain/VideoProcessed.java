package googledrivejhson.domain;

import googledrivejhson.domain.*;
import googledrivejhson.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileKyes;

    public VideoProcessed(Video aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
