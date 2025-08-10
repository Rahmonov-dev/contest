package org.architect.contest.model;

import jakarta.persistence.*;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

import java.util.List;

@Entity
@Data
public class Question extends IdEntity {
    @Column(columnDefinition = "TEXT")
    private String text;

    private boolean isBaseQuestion;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<AnswerOption> options;

    private boolean deleted;

    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private User createdBy;
}
