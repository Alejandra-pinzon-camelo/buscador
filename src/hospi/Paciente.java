/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospi;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Paciente extends Persona {

    private int codigo;

    public Paciente() {
        codigo=0;
    }

    public Paciente(int codigo, String nombre, String apellidos, int edad, String genero, String direccion, String hospital, String doctor, String motivo) {
        super(nombre, apellidos, edad, genero, direccion, hospital, doctor, motivo);
        this.codigo = codigo;
    }


    public void mostrarDatos() {
       
        JOptionPane.showMessageDialog(null, "Codigo paciente: "+codigo
                +"\n Nombre: " + getNombre()
                + "\n Apellido: " + getApellidos()
                + "\n Apellido: " + getEdad()
                + "\n Direccion: " + getDireccion()
                + "\n Genero: " + getGenero()
                + "\n Centro de servicio: " + getHospital()
                + "\n médico que lo atendió: " + getDoctor()
                + "\n Motivo de consulta : " + getMotivo());
        
    }
}
