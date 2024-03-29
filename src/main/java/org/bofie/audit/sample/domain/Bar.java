package org.bofie.audit.sample.domain;

import lombok.Data;
import org.hibernate.annotations.OrderBy;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Set;



@Entity
@Data
public class Bar {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    BarData barData;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Foo> foos;

}
