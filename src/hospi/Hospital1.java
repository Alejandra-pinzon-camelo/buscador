/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospi;



public class Hospital1 implements InterfaceHospital{


    @Override
    public void Hospital() {
      
        Hop p = new Hop("Hospital mayor", "Alejandro", "Diaz", 20, "Carrera 20 #14-01", "Masculino","Luis Ramos", "Migraña");
         Hop p1 = new Hop("Hospital mayor","Maria", "Cubillos", 10, "Calle 58B #65-85", "Femenino", "Luis Ramos", "Dolor abdominal");
        p.mostrarDatos();
        p1.mostrarDatos();
    }
    
        
    }
                
       
     
    

    
