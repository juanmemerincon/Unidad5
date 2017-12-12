/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.beans;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.dates.SubjectDAO;
import utng.dates.SpecialtyDAO;
import utng.models.Subject;
import utng.models.Specialty;

/**
 *
 * @author Orlando
 */

@ManagedBean 
@SessionScoped
public class SubjectBean implements Serializable {
    private List<Subject> subjects;
    private Subject subject;
    private List<Specialty> specialties;
    
    public SubjectBean(){
        subject = new Subject();
        subject.setSpecialty(new Specialty());
    
}

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }

public String listar(){
        SubjectDAO dao = new SubjectDAO();
        try {
            subjects=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Subjects";
    }
    
    public String eliminar(){
         SubjectDAO dao = new SubjectDAO();
        try {
            dao.delete(subject);
            subjects=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        subject= new Subject();
        subject.setSpecialty(new Specialty());
        try {
            specialties= new SpecialtyDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        SubjectDAO dao = new SubjectDAO();
        try {
            if(subject.getIdSubject()!= 0){
                dao.update(subject);
            }else {
                dao.insert(subject);
            }
            subjects=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Subject subject){
        this.subject=subject;
        try {
            specialties = new SpecialtyDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
}