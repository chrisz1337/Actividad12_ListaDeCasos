/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleado;

/**
 *
 * @author USUARIO
 */
class SUNAT extends RecursosHumanos {
    public SUNAT(String nombre, int edad, double salarioBase, int nivel) {
        super(nombre, edad, salarioBase, nivel);
    }

    public void accederInformacionConfidencial(Empleado empleado) {
        System.out.println("Acceso a información confidencial de empleado: " + empleado.nombre);
    }
}

