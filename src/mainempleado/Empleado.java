/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleado;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void darDeAlta() {
        System.out.println("Empleado dado de alta: " + nombre);
    }

    public void jubilarse() {
        System.out.println("Empleado jubilado: " + nombre);
    }

    public void calcularAumentoSalarial(double porcentaje) {
        salarioBase *= (1 + porcentaje);
    }

    public void calcularPrima() {
        System.out.println("Prima para empleado: " + nombre);
    }
}
