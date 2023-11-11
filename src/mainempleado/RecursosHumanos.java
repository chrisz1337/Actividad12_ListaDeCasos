/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleado;

/**
 *
 * @author USUARIO
 */
class RecursosHumanos extends Supervisor {
    public RecursosHumanos(String nombre, int edad, double salarioBase, int nivel) {
        super(nombre, edad, salarioBase, nivel);
    }

    public void despedirEmpleado(Empleado empleado) {
        System.out.println("Empleado despedido: " + empleado.nombre);
    }
}
