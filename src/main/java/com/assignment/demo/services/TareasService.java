/**
 * 
 */
package com.assignment.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.beans.Assignment;
import com.assignment.demo.exceptions.AssignmentNotFoundException;
import com.assignment.demo.repositories.TareasRepository;

/**
 * @author dgaram
 *
 */
@Service
public class TareasService {
    @Autowired
    private TareasRepository repository;

    public List<Assignment> retrieveAss() {
        return repository.retrieveAss();
    }

    public Long addAss(String description) {
        if (description != null && !description.isEmpty()) {
            return repository.addAss(description);
        }
        return -1L;
    }

    public void finishAss(long id) {
        Assignment a = repository.retrieveAss(id);
        if (a != null) {
            a.setFinished(true);
            repository.modifyAss(a);
        }else{
            throw new AssignmentNotFoundException();
        }
        
    }

    public boolean deleteAss(long id) {
        return repository.deleteAss(id);
    }
}
