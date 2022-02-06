package com.educacionhelmintos.model.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String username;

    public Usuario(long id, String nombre, String apellido, String username, String password) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
    }

    public Usuario() {
        super();
    }

    private String password;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

