package com.uce.edu.ec.efinal2_api_ec.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.ec.efinal2_api_ec.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    public Estudiante consultarEstudiante(String cedula) {

        TypedQuery<Estudiante> myQuery = this.entityManager
                .createQuery("SELECT e FROM Estudiante e WHERE e.cedula=:datoCedula", Estudiante.class);
        myQuery.setParameter("datoCedula", cedula);
        try {
            return myQuery.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }

}
