package org.architect.contest.model;

import jakarta.persistence.*;
import lombok.Data;
import org.architect.contest.model.base.IdEntity;

import java.util.List;

@Entity
@Table(name = "modules")
@Data
public class Module  extends IdEntity {

    private String name;
    private String description;

    @OneToMany(mappedBy = "module")
    private List<Question> questions;
}

