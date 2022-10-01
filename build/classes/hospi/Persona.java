/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospi;

import javax.swing.JOptionPane;

public class Persona {

    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String genero;
    protected String direccion;
    protected String hospital;
    protected String doctor;
    protected String motivo;

    public Persona() {
        nombre = "";
        apellidos = "";
        edad = 0;
        genero = "";
        direccion = "";
        hospital = "";
        doctor = "";
        motivo = "";

    }

    public Persona(String nombre, String apellidos, int edad, String genero, String direccion, String hospital, String doctor, String motivo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.hospital = hospital;
        this.doctor = doctor;
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String Genero) {
        this.genero = Genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

}
