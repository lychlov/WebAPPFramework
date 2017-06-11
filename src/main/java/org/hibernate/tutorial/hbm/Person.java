package org.hibernate.tutorial.hbm;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zhikuncheng on 2017/6/9.
 */
@Entity
@Table(name = "PERSONS")
public class Person {
    private long id;
    private String person_name;

    public Person(){}

    public Person(String person_name) {
        this.person_name = person_name;
    }

    @Column(name="PERSON_NAME")
    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String name) {
        this.person_name = name;
    }



    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
