/**
 * 
 */
package com.assignment.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignment.demo.beans.Assignment;
import com.assignment.demo.repositories.dao.TareasHelper;

/**
 * @author dgaram
 *
 */
@Repository
public class TareasRepository {
    private TareasHelper helper;
    
    @Autowired
    public void setHelper(TareasHelper helper){
        this.helper=helper;
    }

    public List<Assignment> retrieveAss() {
        return helper.findAll();
    }

    public Assignment retrieveAss(long id) {
        return helper.findById(id);
    }

    public long addAss(String description) {
        Assignment a = helper.save(new Assignment(description));
        return a != null ? a.getId() : -1L;
    }

    public void modifyAss(Assignment a) {
        helper.save(a);
    }

    public boolean deleteAss(long id) {
        helper.deleteById(id);
        return true;
    }
}
