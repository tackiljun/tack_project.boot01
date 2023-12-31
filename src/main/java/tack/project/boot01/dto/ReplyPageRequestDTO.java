package tack.project.boot01.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReplyPageRequestDTO extends PageRequestDTO {

    ///////////////////////
    private Long bno;

    ///////////////////////
    @Builder.Default
    private int page = 1;
    @Builder.Default
    private int size = 10;
    
    ///////////////////////
    private boolean last;
    
}
