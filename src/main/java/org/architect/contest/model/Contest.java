package org.architect.contest.model;

import jakarta.persistence.*;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

import java.util.List;

@Entity
@Table(name = "contests")
@Data
public class Contest extends IdEntity {

    private String name;
    private boolean isPrivate;
    private String accessCode;
    private String contestStartTime;
    private String contestEndTime;

    @ManyToMany
    @JoinTable(
            name = "contest_questions",
            joinColumns = @JoinColumn(name = "contest_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private List<Question> questions;

}

