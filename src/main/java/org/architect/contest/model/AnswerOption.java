package org.architect.contest.model;

import jakarta.persistence.*;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

@Entity
@Data
public class AnswerOption extends IdEntity {
    @Column(columnDefinition = "TEXT")
    private String text;
    private boolean correct;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
