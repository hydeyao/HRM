package com.hyde.domain.system;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "bs_user")
public class User implements Serializable {
    public static final long serialVersionUID = 4297464181093070302L;
    private String id;
    private String mobile;
    private String username;
    private String password;
    private Integer enableState;
    private Date createTime;
    private String departmentId;
    private String timeOfEntry;
    private Integer formOfEmployment;
    private String workNumber;
    private String formOfManagement;
    private String working_city;
    private Date correction_time;
    private Integer inServiceStatus;
    private String companyId;
    private String companyName;
    private String departmentName;
    private String level;
    private String staffPhoto;
    private Date timeOfDimission;

}
