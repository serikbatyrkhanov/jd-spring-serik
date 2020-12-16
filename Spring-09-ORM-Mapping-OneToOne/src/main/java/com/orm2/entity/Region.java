package com.orm2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="regions")
public class Region extends BaseEntity {

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }

    private String region;
    private String country;
    @OneToOne(mappedBy = "region")
    private Employee employee;
}
