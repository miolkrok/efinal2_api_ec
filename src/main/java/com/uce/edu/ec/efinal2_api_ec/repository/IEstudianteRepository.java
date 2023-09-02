package com.uce.edu.ec.efinal2_api_ec.repository;

import com.uce.edu.ec.efinal2_api_ec.repository.modelo.Estudiante;

public interface IEstudianteRepository {

    public void guardarEstudiante(Estudiante estudiante);

    public void actualizar(Estudiante estudiante);

    public Estudiante consultarEstudiante(String cedula);

}
