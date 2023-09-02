package com.uce.edu.ec.efinal2_api_ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.ec.efinal2_api_ec.repository.modelo.Estudiante;
import com.uce.edu.ec.efinal2_api_ec.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService estudianteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void guardarEstudiante(Estudiante estudiante) {

        this.estudianteService.guardarEstudiante(estudiante);

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Estudiante> consultarPorCedula(Estudiante estudiante) {

        ResponseEntity.ok(this.estudianteService.consultarEstudiante(estudiante));

    }

}
