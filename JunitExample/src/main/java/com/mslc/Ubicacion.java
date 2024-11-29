package com.mslc;

public class Ubicacion {

    private boolean restricciones;
    private int aforo;
    private int aforoMaximo;

   

    public Ubicacion(boolean restricciones, int aforo, int aforoMaximo) {
        this.setRestricciones(restricciones);
        this.setAforo(aforoMaximo);
        this.setAforoMaximo(aforoMaximo);
    }

    public boolean aforoCompleto() {
        return this.getAforo() >= this.getAforoMaximo();
    }

    public boolean isRestricciones() {
        return restricciones;
    }

    public void setRestricciones(boolean restricciones) {
        this.restricciones = restricciones;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    



}
