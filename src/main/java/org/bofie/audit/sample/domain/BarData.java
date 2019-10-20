package org.bofie.audit.sample.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Embeddable
public class BarData {

    private String name;

    private int age;

}
