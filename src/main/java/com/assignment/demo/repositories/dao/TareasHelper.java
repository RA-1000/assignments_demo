/**
 * 
 */
package com.assignment.demo.repositories.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.assignment.demo.beans.Assignment;

/**
 * @author dgaram
 *
 */
@Component
public interface TareasHelper extends JpaRepository<Assignment, Long>{

    /**
     * Finds one element
     * 
     * @param id
     * @return
     */
    public Assignment findById(long id);
}
