/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospi;

public class Hospital3 implements InterfaceHospital{
 
    @Override
    public void Hospital() {
          Hop p4= new Hop("Hospital canicas", "Carolina", "Rubiano", 45, "Calle 08 #184-50", "Femenino",  "Leonardo Camelo", "Diabetes");
         Hop p5 = new Hop("Hospital canicas", "carlos", "Ramos", 45, "carrera 13B #20-68", "Masculino", "Leonardo Camelo", "Paperas");
        p4.mostrarDatos();
        p5.mostrarDatos();
    }
    
}
 