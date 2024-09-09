package com.saireddy.jwtTeluskoYt.controller;

import com.saireddy.jwtTeluskoYt.model.Studnet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController{

    private  List<Studnet> studnets = new ArrayList<>(List.of(
            new Studnet(1,"sai",10),
            new Studnet(2,"reddy",20)
    ));

    @GetMapping("/students")
    public List<Studnet> getstudents(){
        return studnets;
    }

    @PostMapping("/students")
    public Studnet addStudnet(@RequestBody Studnet studnet){
        studnets.add(studnet);
        return studnet;
    }
}
