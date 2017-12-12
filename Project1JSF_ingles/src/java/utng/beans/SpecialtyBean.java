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
import utng.dates.SpecialtyDAO;
import utng.models.Specialty;
/**
 *
 * @author Orlando
 */
    @ManagedBean(name="specialtyBean")
@SessionScoped
public class SpecialtyBean implements Serializable {
    
    private List<Specialty> specialties;
    private Specialty specialty;
    public SpecialtyBean(){}

    public Specialty getSpecialty() {
        return specialty;
    }
    public void setSpecialty(Specialty specialty){
    this.specialty = specialty;
    }
    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }
    
    public String listar(){
        SpecialtyDAO dao = new SpecialtyDAO();
        try {
            specialties=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Specialties";
    }
    
    public String eliminar(){
         SpecialtyDAO dao = new SpecialtyDAO();
        try {
            dao.delete(specialty);
            specialties=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";//no me queda claro si este es es lo que devuelve 
    }
    
    public String iniciar(){
        specialty= new Specialty();
        return "Iniciar";
    }
    
    public String guardar(){
        SpecialtyDAO dao = new SpecialtyDAO();
        try {
            if(specialty.getIdSpecialty()!= 0){
                dao.update(specialty);
            }else {
                dao.insert(specialty);
            }
            specialties=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Specialty specialty){
        this.specialty=specialty;
        return "Editar";
    }
        
}
    
    
    
