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

    public class Hop extends Persona {

    public Hop() {
    }

    public Hop( String hospital,String nombre, String apellidos, int edad, String genero, String direccion, String doctor, String motivo) {
        super(nombre, apellidos, edad, genero, direccion, hospital, doctor, motivo);
    }

    public void mostrarDatos() {
       
        JOptionPane.showMessageDialog(null,"Centro de servicio: " + getHospital()
               + "\n Nombre: " + getNombre()
                + "\n Apellido: " + getApellidos()
                + "\n Apellido: " + getEdad()
                + "\n Direccion: " + getDireccion()
                + "\n Genero: " + getGenero()
                + "\n médico que lo atendió: " + getDoctor()
                + "\n Motivo de consulta : " + getMotivo());
        
    }
}