/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleados;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    private String nombre;
    private int numeroEmpleado;

    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        this.nombre = scanner.nextLine();
        System.out.println("Ingrese el número de empleado:");
        this.numeroEmpleado = scanner.nextInt();
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Número de empleado: " + this.numeroEmpleado);
    }
}
