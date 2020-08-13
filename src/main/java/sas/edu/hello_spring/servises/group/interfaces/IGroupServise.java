package sas.edu.hello_spring.servises.group.interfaces;

import sas.edu.hello_spring.model.Group;

import java.util.List;

public interface IGroupServise {

    Group create(Group group);
    Group get(String id);
    Group delete(String id);
    Group update(Group group);
    List<Group> getAll();

}
