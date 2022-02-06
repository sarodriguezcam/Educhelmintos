package com.educacionhelmintos.model.entity;

import javax.persistence.*;

@Entity
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="edad")
    private int edad;

    @Column(name="sexo")
    private String sexo;

    @Column(name="diagnostico")
    private String diagnostico;

    @Column(name="sintomas")
    private String sintomas;

    @Column(name="iduser")
    private long iduser;

    public Persona(long id, String nombre, String apellido, int edad, String sexo, String diagnostico, String sintomas, long iduser) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.diagnostico = diagnostico;
        this.sintomas = sintomas;
        this.iduser = iduser;
    }

    public Persona() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }
}
