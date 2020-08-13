package sas.edu.hello_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sas.edu.hello_spring.model.Group;
import sas.edu.hello_spring.servises.cafedra.interfaces.ICafedralServise;
import sas.edu.hello_spring.servises.group.impl.GroupServiseImpl;

import java.util.List;

@RequestMapping("/api/group")
@RestController
public class GroupRestController {

    @Autowired
    GroupServiseImpl groupServise;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Group> getGroup(){
        return groupServise.getAll();
    }
}
