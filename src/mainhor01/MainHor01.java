/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainhor01;

/**
 *
 * @author USUARIO
 */
public class MainHor01 {

    public static void main(String[] args) {

        Hora h1 = new Hora(4, 5, 60);
        Hora h2 = new Hora(1, 4, 5);
        Hora h3 = new Hora();
        //Ambas horas se suman

        h3.sumarHora(h1, h2);
        h3.visualizarHora();

    }

    
}
