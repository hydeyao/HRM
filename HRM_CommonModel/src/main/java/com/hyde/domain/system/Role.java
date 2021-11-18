package com.hyde.domain.system;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pe_role")
public class Role implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    private String companyId;





}
