package miu.edu.day3springdata.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    User user;
}

