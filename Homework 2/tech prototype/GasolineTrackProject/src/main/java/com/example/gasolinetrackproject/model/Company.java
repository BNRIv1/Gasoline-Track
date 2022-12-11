package com.example.gasolinetrackproject.model;

import lombok.Data;
import javax.persistence.*;

@Data
//@Entity
public class Company {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "companyId")
    private Long companyId;

    private String companyName;

    public Company() {
    }

    public Company(Long companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
}
