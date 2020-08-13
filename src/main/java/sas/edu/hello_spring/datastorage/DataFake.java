package sas.edu.hello_spring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sas.edu.hello_spring.model.Cafedra;
import sas.edu.hello_spring.model.Group;
import sas.edu.hello_spring.repository.CafedraRepository;
import sas.edu.hello_spring.repository.GroupRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    CafedraRepository cafedraRepository;

    @Autowired
    GroupRepository groupRepository;

    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("LOL", "KEK", "L"),
            new Cafedra("pop", "lop", "or")));

    @PostConstruct
    public void init(){
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(cafedras);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
    }

    List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("lol", "kek", cafedras.get(0)),
            new Group("pop", "lop", cafedras.get(1))));

    public List<Cafedra> getCafedras() {
        return cafedras;
    }
    public List<Group> getGroups() {
        return groups;
    }

    public void setCafedras(List<Cafedra> cafedras) {
        this.cafedras = cafedras;
    }
    public void setGroup(List<Group> groups) {
        this.groups = groups;
    }
}
