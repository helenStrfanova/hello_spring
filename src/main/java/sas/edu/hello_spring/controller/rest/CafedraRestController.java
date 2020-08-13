package sas.edu.hello_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sas.edu.hello_spring.model.Cafedra;
import sas.edu.hello_spring.servises.cafedra.impls.CafedralServiseImpl;

import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
public class CafedraRestController {

    @Autowired
    CafedralServiseImpl cafedralServise;

    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Web Controller</h1>";
    }


    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello form Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Cafedra> getCafedrasList(){
        return cafedralServise.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id){
        return cafedralServise.get(id);
    }
}
