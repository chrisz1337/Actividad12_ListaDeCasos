/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maincaracteres;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainCaracteres {
    
    public static void main(String[] args) {

        String cadenaFija = "Hola mundo";
        int indiceFijo = 5; 

        Cadena miCadena = new Cadena(cadenaFija);

        miCadena.visualizar();

        char caracter = miCadena.caracter(indiceFijo);
        if (caracter == (char) -1) {
            System.out.println("Índice fuera de rango");
        } else {
            System.out.println("Carácter en el índice " + indiceFijo + ": " + caracter);
        }
    }
}
