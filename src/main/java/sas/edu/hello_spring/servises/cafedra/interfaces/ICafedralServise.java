package sas.edu.hello_spring.servises.cafedra.interfaces;

import sas.edu.hello_spring.model.Cafedra;

import java.util.List;

public interface ICafedralServise {

  Cafedra create(Cafedra cafedra);
  Cafedra get(String id);
  Cafedra update(Cafedra cafedra);
  Cafedra delete(String id);
  List<Cafedra> getAll();

}
