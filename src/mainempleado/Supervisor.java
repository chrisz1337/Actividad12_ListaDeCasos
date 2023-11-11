/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleado;

/**
 *
 * @author USUARIO
 */
class Supervisor extends Empleado {
    protected int nivel;
    
    public Supervisor(String nombre, int edad, double salarioBase, int nivel) {
        super(nombre, edad, salarioBase);
        this.nivel = nivel;
    }

    public void promoverEmpleado(Empleado empleado) {
        System.out.println("Empleado promovido a Supervisor: " + empleado.nombre);
    }
}
