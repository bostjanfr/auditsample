package org.bofie.audit.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;



@Entity
@Data
@AllArgsConstructor
public class Foo {

    @Id
    @GeneratedValue
    private long id;

    @Embedded
    FooData fooData;

}
