package org.architect.contest.model;


import jakarta.persistence.*;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

@Entity
@Table(name = "user_contest_results")
@Data
public class UserContestResult extends IdEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "contest_id")
    private Contest contest;

    private int correctCount;
    private int totalCount;
}