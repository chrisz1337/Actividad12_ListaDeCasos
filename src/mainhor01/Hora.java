/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainhor01;

/**
 *
 * @author USUARIO
 */
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;


    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public void sumarHora(Hora h1, Hora h2) {
        this.segundos = h1.segundos + h2.segundos;
        this.minutos = h1.minutos + h2.minutos + this.segundos / 60;
        this.horas = h1.horas + h2.horas + this.minutos / 60;
        this.segundos %= 60;
        this.minutos %= 60;
    }
}
