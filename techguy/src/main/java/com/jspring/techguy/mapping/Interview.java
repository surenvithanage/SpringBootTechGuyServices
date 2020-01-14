package com.jspring.techguy.mapping;
// Generated Jan 3, 2019 9:27:06 AM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Interview generated by hbm2java
 */
@Entity
@Table(name="interview"
    ,catalog="techguy"
)
public class Interview  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -1560674432108843478L;
	private Integer interviewId;
     private String technology;
     private Set<Interviewdescription> interviewdescriptions = new HashSet<Interviewdescription>(0);

    public Interview() {
    }

    public Interview(String technology, Set<Interviewdescription> interviewdescriptions) {
       this.technology = technology;
       this.interviewdescriptions = interviewdescriptions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="interviewId", unique=true, nullable=false)
    public Integer getInterviewId() {
        return this.interviewId;
    }
    
    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }
    
    @Column(name="technology", length=255)
    public String getTechnology() {
        return this.technology;
    }
    
    public void setTechnology(String technology) {
        this.technology = technology;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="interview")
    public Set<Interviewdescription> getInterviewdescriptions() {
        return this.interviewdescriptions;
    }
    
    public void setInterviewdescriptions(Set<Interviewdescription> interviewdescriptions) {
        this.interviewdescriptions = interviewdescriptions;
    }




}

