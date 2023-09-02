package com.uce.edu.ec.efinal2_api_ec.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.efinal2_api_ec.repository.IEstudianteRepository;
import com.uce.edu.ec.efinal2_api_ec.repository.modelo.Estudiante;
import com.uce.edu.ec.efinal2_api_ec.service.to.EstudianteCompletoTO;
import com.uce.edu.ec.efinal2_api_ec.service.to.EstudianteTO;

@Service
@Transactional
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteRepository estudianteRepo;

    @Override
    public void guardarEstudiante(EstudianteCompletoTO estudiante) {
        Estudiante e = this.estudianteRepo.consultarEstudiante(estudiante.getCedula());

        if (e == null) {
            this.estudianteRepo.guardarEstudiante(this.convertirEstudianteCompletoTO(estudiante));
        } else {
            e.setNombre(estudiante.getNombre());
            e.setApellido(estudiante.getApellido());
            e.setId(e.getId());
            e.setToken(estudiante.getToken());
            e.setCedula(estudiante.getCedula());
            this.estudianteRepo.actualizar(e);

        }
    }

    @Override
    public EstudianteTO consultarEstudiante(String cedula) {

        return convertirEstudianteTO(this.estudianteRepo.consultarEstudiante(cedula));
    }

    private EstudianteTO convertirEstudianteTO(Estudiante estudiante) {
        EstudianteTO estu = new EstudianteTO();
        estu.setId(estudiante.getId());
        estu.setNombre(estudiante.getNombre());
        estu.setApellido(estudiante.getApellido());
        return estu;

    }

    private Estudiante convertirEstudianteCompletoTO(EstudianteCompletoTO estudiante) {
        Estudiante estu = new Estudiante();
        estu.setId(estudiante.getId());
        estu.setNombre(estudiante.getNombre());
        estu.setApellido(estudiante.getApellido());
        estu.setToken(estudiante.getToken());
        return estu;

    }

    @Override
    public void actualizar(Estudiante estudiante) {
        this.estudianteRepo.actualizar(estudiante);
    }

}
