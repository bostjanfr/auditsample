package org.bofie.audit.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
public class FooAudit {

    @Id
    @GeneratedValue
    private long id;

    String stuff;

    @Embedded
    FooData fooData;
    
}
