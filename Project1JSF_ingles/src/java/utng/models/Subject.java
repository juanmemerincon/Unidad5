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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_subject")
    private Long idSubject;
    @Column(name="subject_name", length=30)
    private String subjectName;
    @Column(name="objetive", length=30)
    private String objetive;
    
    @Column(name="Cuatrimestre", length=30)
    private String subjectCuatri;
    
    @Column(name="Edificio", length=30)
     private String subjectEdific;
    
    @ManyToOne()
    @JoinColumn(name="id_specialty")
    private Specialty specialty;

    public Subject(Long idSubject, String subjectName,String subjectCuatri,String subjectEdific, String objetive, Specialty specialty) {
        super();
        this.idSubject = idSubject;
        this.subjectName = subjectName;
        this.subjectCuatri = subjectCuatri;
        this.subjectEdific = subjectEdific;
        this.objetive = objetive;
        this.specialty = specialty;
    }
    public Subject() {
        this.idSubject=0L;
    }

    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCuatri() {
        return subjectCuatri;
    }

    public void setSubjectCuatri(String subjectCuatri) {
        this.subjectCuatri = subjectCuatri;
    }

    public String getSubjectEdific() {
        return subjectEdific;
    }

    public void setSubjectEdific(String subjectEdific) {
        this.subjectEdific = subjectEdific;
    }
    
    

    public String getObjetive() {
        return objetive;
    }

    public void setObjetive(String objetive) {
        this.objetive = objetive;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
    
    
    
    
}


    
   
