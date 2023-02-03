package googledrivejhson.domain;

import googledrivejhson.domain.*;
import googledrivejhson.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;

    public FileIndexed(Index aggregate){
        super(aggregate);
    }
    public FileIndexed(){
        super();
    }
}
