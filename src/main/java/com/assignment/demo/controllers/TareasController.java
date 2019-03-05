/**
 * 
 */
package com.assignment.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.assignment.demo.beans.Assignment;
import com.assignment.demo.constants.RestConstants;
import com.assignment.demo.services.TareasService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author dgaram
 *
 */
@RestController()
@RequestMapping(RestConstants.ASSIGNMENT_PREFIX)
public class TareasController {

    @Autowired
    private TareasService tareasService;

    @ApiOperation(value = "Retrieve all assignments", notes = "Retrieve all assignments")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Assaingments",
            response = Assignment.class, responseContainer = "List") })
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = RestConstants.REST_ASSIGNMENT_RETRIEVE_ALL)
    public List<Assignment> retrieveAss() {
        return tareasService.retrieveAss();
    }
    

    @ApiOperation(value = "Retrieve one assignment", notes = "Retrieve one assignment")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Assaingment",
            response = Assignment.class) })
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = RestConstants.REST_ASSIGNMENT_RETRIEVE_ONE)
    public List<Assignment> retrieveAss(@PathVariable("id") long id) {
        
        throw new HttpServerErrorException(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Add Assignment", notes = "Add Assignment")
    @ApiResponses(
            value = { @ApiResponse(code = 200, message = "Identifier", response = Long.class) })
    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT, path = RestConstants.REST_ASSIGNMENT_ADD)
    public Long addAss(@RequestBody String description) {
        return tareasService.addAss(description);
    }

    @ApiOperation(value = "Finish assignment", notes = "Finish assignment")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Void.class) })
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, path = RestConstants.REST_ASSIGNMENT_FINISH)
    public void finishAss(@PathVariable("id") long id) {
        tareasService.finishAss(id);
    }

    @ApiOperation(value = "Delete Assignment", notes = "Delete Assignment")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Boolean.class) })
    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, path = RestConstants.REST_ASSIGNMENT_DELETE)
    public boolean deleteAss(@PathVariable("id") long id) {
        return tareasService.deleteAss(id);
    }

}
