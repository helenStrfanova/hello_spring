package sas.edu.hello_spring.servises.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas.edu.hello_spring.dao.cafedra.impls.DaoCafedraImpl;
import sas.edu.hello_spring.datastorage.DataFake;
import sas.edu.hello_spring.model.Cafedra;
import sas.edu.hello_spring.repository.CafedraRepository;
import sas.edu.hello_spring.servises.cafedra.interfaces.ICafedralServise;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class CafedralServiseImpl implements ICafedralServise {

    /*@Autowired
    DaoCafedraImpl daoCafedra;
    */

    @Autowired
    CafedraRepository cafedraRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public List<Cafedra> getAll() {
        return cafedraRepository.findAll();
    }

    public void reloadDatabase(){
        dataFake.init();
    }
}
