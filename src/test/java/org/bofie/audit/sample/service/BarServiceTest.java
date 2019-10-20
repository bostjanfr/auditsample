package org.bofie.audit.sample.service;

import org.bofie.audit.sample.domain.Bar;
import org.bofie.audit.sample.domain.Foo;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

class BarServiceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void save() {

        Bar bar1 =  new Bar();
        bar1.setAge(12);
        bar1.setId(1L);
        bar1.setName("bar1");
        bar1.setFoos( new HashSet<>(Arrays.asList(new Foo(1L, "Foo1"),
                new Foo(1L, "Foo1"),
                new Foo(2L, "Foo2"))));

        Bar bar2 =  new Bar();
        bar2.setAge(12);
        bar2.setId(1L);
        bar2.setName("bar2");
        bar2.setFoos( new HashSet<>(Arrays.asList(new Foo(1L, "Foo1"),
                new Foo(1L, "Foo1"),
                new Foo(2L, "Foo2"))));


        Javers javers = JaversBuilder.javers().build();

        Diff diff = javers.compare(bar1, bar2);
        String summery = diff.changesSummary();
        System.out.println(summery);
    }
}