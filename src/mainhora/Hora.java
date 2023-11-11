/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainhora;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void avanzar() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minutos++;
            if (this.minutos == 60) {
                this.minutos = 0;
                this.horas++;
                if (this.horas == 24) {
                    this.horas = 0;
                }
            }
        }
    }

    public void ponerACero() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public void visualizar() {
        System.out.printf("%02d:%02d:%02d\n", this.horas, this.minutos, this.segundos);
    }
}
