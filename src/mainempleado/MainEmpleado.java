/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainempleado;

/**
 *
 * @author USUARIO
 */
public class MainEmpleado {
    
    public static void main(String[] args) {
        System.out.println("--------EMPLEADO----------");
        Empleado empleado1 = new Empleado("Empleado1", 30, 1000);
        Supervisor supervisor1 = new Supervisor("Supervisor1", 35, 1500, 2);
        RecursosHumanos rrhh1 = new RecursosHumanos("RRHH1", 40, 2000, 3);
        SUNAT sunat1 = new SUNAT("SUNAT1", 45, 2500, 4);
      

        empleado1.darDeAlta();
        supervisor1.promoverEmpleado(empleado1);
        rrhh1.despedirEmpleado(empleado1);
        sunat1.accederInformacionConfidencial(sunat1);
        
        System.out.println("----------------------------");
              
    }
}
