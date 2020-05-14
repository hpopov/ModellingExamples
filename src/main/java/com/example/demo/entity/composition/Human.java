package com.example.demo.entity.composition;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

@Entity
@Table(name = "human")
@Data
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK")
    private Long pk;

    @Column(name = "age")
    private Integer age;

    @RestResource(exported = false)
    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE,
	    CascadeType.PERSIST, CascadeType.REFRESH },
	    optional = false, mappedBy = "human")
    private Head head;
}
