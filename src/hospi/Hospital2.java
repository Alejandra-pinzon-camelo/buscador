/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospi;



/**
 *
 * @author aleja
 */
public class Hospital2 implements InterfaceHospital{
    @Override
    public void Hospital() {
          Hop p2= new Hop("Hospital macarena", "Humberto", "Cruz", 65, "Calle 76A #35-45", "Masculino", "Mario Lopez", "Calculos en los riñones");
         Hop p3 = new Hop("Hospital macarena", "Lorena", "Perez", 33, "Carrera 140 #45-45", "Femenino", "Mario Lopez", "Fractura de pie");
        p2.mostrarDatos();
        p3.mostrarDatos();
    }

}
