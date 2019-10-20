package org.bofie.audit.sample.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
public class BarAudit12 {

    @Id
    @GeneratedValue
    private Long id;

    String Stuff;

    @Embedded
    BarData barData;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FooAudit> foos;

}
