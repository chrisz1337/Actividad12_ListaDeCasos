/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincaracteres;


public class Cadena {
     private int longitud;
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }

    public void visualizar() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Longitud: " + longitud);
    }

    public char caracter(int i) {
        if (i >= longitud) {
            return (char) -1;
        } else {
            return cadena.charAt(i);
             //charAt es un tipo de casteo que toma un entero y te devuelve una cadena
        }
    }
    
}
