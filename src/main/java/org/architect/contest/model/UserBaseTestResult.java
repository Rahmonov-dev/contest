package org.architect.contest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_base_test_result")
@Data
public class UserBaseTestResult extends IdEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    private boolean correct;
    private LocalDateTime answeredAt;

}
