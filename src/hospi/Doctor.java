
package hospi;

import javax.swing.JOptionPane;


public class Doctor extends Persona{
    private int codigoDoctor;
    
    
    public Doctor() {
    
     
    codigoDoctor=0;
   
    }

    public Doctor(int codigoDoctor,  String doctor,String nombre, String apellidos, int edad, String genero, String direccion, String hospital, String motivo) {
        super(nombre, apellidos, edad, genero, direccion, hospital, doctor, motivo);
        this.codigoDoctor = codigoDoctor;
         
    }
    public void mostrarDatos() {
       
        JOptionPane.showMessageDialog(null, "Codigo doctor: "+codigoDoctor
                + "\n médico que atendió: " + getDoctor()
                +"\n Nombre: " + getNombre()
                + "\n Apellido: " + getApellidos()
                + "\n Apellido: " + getEdad()
                + "\n Direccion: " + getDireccion()
                + "\n Genero: " + getGenero()
                + "\n Centro de servicio: " + getHospital()
                + "\n Motivo de consulta : " + getMotivo());
    }
}
