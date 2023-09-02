package com.uce.edu.ec.efinal2_api_ec.service.to;

import java.io.Serializable;

import javax.persistence.Column;

public class EstudianteCompletoTO implements Serializable {

    private Integer id;
    @Column(name = "estu_nombre")
    public String nombre;
    @Column(name = "estu_apellido")
    public String apellido;
    @Column(name = "estu_cedula")
    public String cedula;
    @Column(name = "estu_token")
    public String token;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
