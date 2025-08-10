package org.architect.contest.model;

import jakarta.persistence.*;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User extends IdEntity {

    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(mappedBy = "user")
    private List<UserContestResult> contestResults;
    @OneToMany(mappedBy = "user")
    private List<UserBaseTestResult> baseTestResults;
}
