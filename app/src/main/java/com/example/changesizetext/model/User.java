package com.example.changesizetext.model;

import java.io.Serializable;

/**
 * Clase que guarda la informacion del login del usuario
 * Esta clase debe implementar la interfaz Serializable porque esta contenida dentro de la clase
 * message que se pasa dentro de un intent
 * Parcelable encountered IOException writing serializable object
 */
public class User implements Serializable {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
