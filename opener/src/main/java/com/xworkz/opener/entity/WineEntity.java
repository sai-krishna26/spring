package com.xworkz.opener.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "WineInfo")
@Getter
@Setter
@ToString

public class WineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "company_name")
    private String companyName;

    private String location;

    @Column(name = "mnf_name")
    private String mnfName;

    @Column(name = "mnf_date")
    private LocalDate mnfDate;

    private String variety;

    private Integer age;
}
