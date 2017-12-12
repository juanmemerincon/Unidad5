/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dates;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import utng.models.Subject;

/**
 *
 * @author Orlando
 */
public class SubjectDAO extends DAO<Subject>{
    public SubjectDAO() {
        super(new Subject());
    }
    public Subject getOneById(Subject subject) throws HibernateException {
        return super.getOneById(subject.getIdSubject()); 
    }
   
}
