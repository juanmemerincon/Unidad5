/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rincon
 */
@Entity
@Table(name="specialty")
public class Specialty implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_specialty")
    private Long idSpecialty;
    
    @Column(name="name", length=100)
    private String name;
    
    public Specialty(Long idSpecialty, String name){
        super();
        this.idSpecialty=idSpecialty;
        this.name=name;
    
}
      public Specialty() {
        this(0L,"");
    }
      public Long getIdSpecialty() {
        return idSpecialty;
    }

    public void setIdSpecialty(Long idSpecialty) {
        this.idSpecialty = idSpecialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
