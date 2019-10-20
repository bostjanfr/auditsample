package org.bofie.audit.sample.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Foo {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne(targetEntity = Bar.class,  fetch = FetchType.LAZY)
    @JoinColumn(name = "BAR_ID")
    private Bar bar;

}
