package org.example;

public class Cliente {
    private String nombre;
    private String rut;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String aNombre) {
        this.nombre = aNombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String aRut) {
        this.rut = aRut;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}