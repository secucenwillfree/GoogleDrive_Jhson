package googledrivejhson.domain;

import googledrivejhson.domain.*;
import googledrivejhson.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileKyes;
}


