/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainempleados;

/**
 *
 * @author USUARIO
 */
public class MainEmpleados {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[50];
        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            empleados[i].leerDatos();
        }
        for (Empleado empleado : empleados) {
            empleado.verDatos();
        }
    }
}
