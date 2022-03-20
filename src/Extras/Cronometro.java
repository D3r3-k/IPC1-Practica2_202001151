package Extras;

import D3r3_k.Inicio;

public class Cronometro extends Thread {

    @Override
    public void run() {
        String tiempo;
        try {
            while (estado) {
                tiempo = "";
                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }
                tiempo += ":";

                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }

                Inicio.txt_cronometraje.setText(tiempo);

                segundos++;
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static volatile boolean estado;
    private int minutos = 0, segundos = 0;

    public Cronometro(int minutos, int segundos) {
        estado = true;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public synchronized void parar() {
        estado = false;
    }

}
