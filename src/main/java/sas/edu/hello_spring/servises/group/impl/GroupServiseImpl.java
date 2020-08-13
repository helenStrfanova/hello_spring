package sas.edu.hello_spring.servises.group.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas.edu.hello_spring.dao.cafedra.impls.DaoCafedraImpl;
import sas.edu.hello_spring.dao.group.impls.DaoGroupImpl;
import sas.edu.hello_spring.model.Group;
import sas.edu.hello_spring.servises.group.interfaces.IGroupServise;

import java.util.List;

@Service
public class GroupServiseImpl implements IGroupServise {

    @Autowired
    DaoGroupImpl daoGroup;

    @Override
    public Group create(Group group) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public Group update(Group group) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return daoGroup.getAll();
    }
}
