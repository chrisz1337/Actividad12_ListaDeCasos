/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainhora;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Hora horaActual = new Hora(2, 5, 69);

        horaActual.visualizar();

        horaActual.avanzar();
        horaActual.visualizar();

      
        horaActual.ponerACero();
        horaActual.visualizar();
    }
}
