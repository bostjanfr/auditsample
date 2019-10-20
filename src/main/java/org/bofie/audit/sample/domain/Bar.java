package org.bofie.audit.sample.domain;

import lombok.Data;
import org.hibernate.annotations.OrderBy;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Bar {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "bar", fetch = FetchType.LAZY)
    @OrderBy(clause = "NAME DESC")
    private Set<Foo> foos;
}
