package tack.project.boot01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "t_reply")
@ToString(exclude = "board")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Reply {

    ////////////////////////////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;
    private String replyText;
    private String replyFile;
    private String replyer;

    ////////////////////////////////////////////////////
    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;
    
    ////////////////////////////////////////////////////
    public void changeText(String text) {
        this.replyText = text;
    }

    ////////////////////////////////////////////////////
    public void changeFile(String fileName) {
        this.replyFile = fileName;
    }
    
}
