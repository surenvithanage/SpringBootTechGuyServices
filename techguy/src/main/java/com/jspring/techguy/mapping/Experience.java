package com.jspring.techguy.mapping;
// Generated Jan 3, 2019 9:27:06 AM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Experience generated by hbm2java
 */
@Entity
@Table(name="experience"
    ,catalog="techguy"
)
public class Experience  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -4657214324854433265L;
	private Long experienceId;
     private Cvdata cvdata;
     private String role;
     private String company;
     private Date durationFrom;
     private Date durationTo;
     private String description;

    public Experience() {
    }

	
    public Experience(Cvdata cvdata) {
        this.cvdata = cvdata;
    }
    public Experience(Cvdata cvdata, String role, String company, Date durationFrom, Date durationTo, String description) {
       this.cvdata = cvdata;
       this.role = role;
       this.company = company;
       this.durationFrom = durationFrom;
       this.durationTo = durationTo;
       this.description = description;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="experienceId", unique=true, nullable=false)
    public Long getExperienceId() {
        return this.experienceId;
    }
    
    public void setExperienceId(Long experienceId) {
        this.experienceId = experienceId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CVData_cvDataId", nullable=false)
    public Cvdata getCvdata() {
        return this.cvdata;
    }
    
    public void setCvdata(Cvdata cvdata) {
        this.cvdata = cvdata;
    }

    
    @Column(name="role", length=255)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    
    @Column(name="company", length=255)
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="durationFrom", length=255)
    public Date getDurationFrom() {
        return this.durationFrom;
    }
    
    public void setDurationFrom(Date durationFrom) {
        this.durationFrom = durationFrom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="durationTo", length=255)
    public Date getDurationTo() {
        return this.durationTo;
    }
    
    public void setDurationTo(Date durationTo) {
        this.durationTo = durationTo;
    }

    
    @Column(name="description", length=80)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


