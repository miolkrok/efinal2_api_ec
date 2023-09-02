package com.uce.edu.ec.efinal2_api_ec.service;

import com.uce.edu.ec.efinal2_api_ec.repository.modelo.Estudiante;
import com.uce.edu.ec.efinal2_api_ec.service.to.EstudianteCompletoTO;
import com.uce.edu.ec.efinal2_api_ec.service.to.EstudianteTO;

public interface IEstudianteService {

    public void guardarEstudiante(EstudianteCompletoTO estudiante);

    public EstudianteTO consultarEstudiante(String cedula);

    public void actualizar(Estudiante estudiante);

}
